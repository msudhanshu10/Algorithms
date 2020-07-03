def root(i):
    while i!=id[i]:
        i=id[i]
    return i

def isConnected(p,q):
    return root(p)==root(q)

def Union(p,q):
    i=root(p)
    j=root(q)
    id[i]=j
    return id

N=int(input())
id=list()
for i in range(N):
    id.append(i)

id=Union(3,4)
id=Union(4,9)
id=Union(2,9)
id=Union(5,6)
print(id)

print(Union(3,5))
#print('Root of',3,'is',root(3))
