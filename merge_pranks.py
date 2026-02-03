import json
import os
from datetime import datetime

def merge_pranks():
    base_file = r"d:\vs-ANDROID-studio\notififcation-menace\docs\sample_pranks.json"
    batch_files = [
        r"d:\vs-ANDROID-studio\notififcation-menace\docs\generated_batch_1.json",
        r"d:\vs-ANDROID-studio\notififcation-menace\docs\generated_batch_2.json",
        r"d:\vs-ANDROID-studio\notififcation-menace\docs\generated_batch_3.json",
        r"d:\vs-ANDROID-studio\notififcation-menace\docs\generated_batch_4.json",
        r"d:\vs-ANDROID-studio\notififcation-menace\docs\generated_batch_5.json"
    ]

    try:
        # Load base file
        with open(base_file, 'r', encoding='utf-8') as f:
            data = json.load(f)
        
        print(f"Initial prank count: {len(data['pranks'])}")

        new_pranks_count = 0
        
        # Load and append batches
        for batch_file in batch_files:
            if os.path.exists(batch_file):
                with open(batch_file, 'r', encoding='utf-8') as f:
                    batch_data = json.load(f)
                    data['pranks'].extend(batch_data)
                    new_pranks_count += len(batch_data)
                    print(f"Added {len(batch_data)} pranks from {os.path.basename(batch_file)}")
            else:
                print(f"Warning: {batch_file} not found.")

        # Update metadata
        data['lastUpdated'] = datetime.now().strftime("%Y-%m-%d")
        
        # Sort by ID to be safe
        data['pranks'].sort(key=lambda x: x['id'])
        
        # Save back
        with open(base_file, 'w', encoding='utf-8') as f:
            json.dump(data, f, indent=4)
            
        print(f"Successfully merged. Total pranks: {len(data['pranks'])}")
        print(f"Added {new_pranks_count} new pranks.")

    except Exception as e:
        print(f"Error merging files: {e}")

if __name__ == "__main__":
    merge_pranks()
