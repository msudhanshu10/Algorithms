#insertion sort Algorithm. Running time O(n^2).
#not a good algo because there is quadratic running time.

A=list(map(int,input().split()))
j=1
n=len(A)
while j<n:
    key=A[j]
    i=j-1
    while i>=0 and A[i]>key:
        A[i+1]=A[i]
        i=i-1

    A[i+1]=key
    j=j+1



print(A)
