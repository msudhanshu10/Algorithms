# O(log N) Algorithm.
A=list(map(int,input().split()))
key=int(input())

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
    print("Element is found at",index+1)
else:
    print("NOT found!")
