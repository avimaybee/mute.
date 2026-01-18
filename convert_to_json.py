import re
import json

def parse_pranks(file_path):
    with open(file_path, 'r', encoding='utf-8') as f:
        content = f.read()

    # Find the pranks list content
    match = re.search(r'private val pranks = mutableListOf\((.*?)\)\n    \)', content, re.DOTALL)
    if not match:
        # Try finding the start and manually scanning till the end of the list
        start_match = re.search(r'private val pranks = mutableListOf\(', content)
        if start_match:
            start_index = start_match.end()
            # Simple bracket counting
            bracket_count = 1
            current_index = start_index
            while bracket_count > 0 and current_index < len(content):
                if content[current_index] == '(':
                    bracket_count += 1
                elif content[current_index] == ')':
                    bracket_count -= 1
                current_index += 1
            pranks_text = content[start_index:current_index-1]
        else:
            return []
    else:
        pranks_text = match.group(1)

    # Regex to match Prank(...) calls
    # Prank(id, PrankType.TYPE, "sender", "body", "punchline", listOf(ContextTrigger.TAG, ...))
    prank_pattern = re.compile(r'Prank\(\s*(\d+),\s*PrankType\.(\w+),\s*"(.*?)",\s*"(.*?)",\s*"(.*?)",\s*listOf\((.*?)\)\s*\)', re.DOTALL)
    
    pranks = []
    for m in prank_pattern.finditer(pranks_text):
        prank_id = int(m.group(1))
        prank_type = m.group(2)
        sender = m.group(3)
        body = m.group(4)
        punchline = m.group(5)
        tags_text = m.group(6)
        
        # Clean up tags
        tags = [t.strip().replace('ContextTrigger.', '') for t in tags_text.split(',') if t.strip()]
        
        pranks.append({
            "id": prank_id,
            "type": prank_type,
            "senderName": sender,
            "messageBody": body,
            "punchlineText": punchline,
            "tags": tags
        })
    
    return pranks

if __name__ == "__main__":
    kt_file = r'd:\vs-ANDROID-studio\notififcation-menace\app\src\main\java\com\example\notificationmenace\data\PrankRepository.kt'
    output_json = 'pranks.json'
    
    data = parse_pranks(kt_file)
    with open(output_json, 'w', encoding='utf-8') as f:
        json.dump(data, f, indent=2, ensure_ascii=False)
    
    print(f"Successfully converted {len(data)} pranks to {output_json}")
