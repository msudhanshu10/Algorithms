#This algorithm is of order N^2(log(N))
def binarySearch(key,A):
    print(key,end="  ")
    high=len(A)-1
    low=0
    flag=0
    index=0

    while low<=high:
        mid=int((high+low)/2)
        if key<A[mid]:
            high=mid-1
        elif key>A[mid]:
            low=mid+1
        else:
            flag=1
            index=mid
            break

    if flag==1:
        return True
    else:
        return False



A=list(map(int,input().split()))
A.sort()
print(A)

i=0
count=0
while i<(len(A)-1):
    j=i+1
    while j<len(A):
        if A[i]<A[j]:
            if binarySearch(-(A[i]+A[j]),A):
                count+=1

        j=j+1
    i=i+1

print(count)
