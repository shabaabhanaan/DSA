


arr = []
size = int(input("Enter number:"))
if(size <10 or size > 20):
   print("Please enter a valid number")
else:
    for i in range(size):
        num = int(input("Enter number {}:".format(i+1)))
        arr.append(num)



    print("array before sort:",arr)
   
