def insertsort(arr):
    n = len(arr)
    for i in range(1, n):
        key = arr[i]
        j = i - 1
        
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key


arr = []

size = int(input("Enter number (between 10 and 20): "))

if size < 10 or size > 20:
    print("Please enter a valid number between 10 and 20.")
else:
    for i in range(size):
        num = int(input(f"Enter number {i + 1}: "))
        arr.append(num)

    print("Array before sort:", arr)
    insertsort(arr)
    print("Array after sort:", arr)
