def isConnected(p,q,id):#function to check if p is connected with q
    if id[p]==id[q]:
        return True
    else :
        return False

def Union(p,q,id):
    p_id=id[p]
    q_id=id[q]
    for i in range(10):
        if(id[i]==p_id):
            id[i]=q_id
    return id

N=int(input())

if N!=-1:
    id=list()
    for i in range(N):
        id.append(i)
    print(id)

    id=Union(1,2,id)
    id=Union(4,7,id)
    id=Union(1,7,id)
    print(id)
    if isConnected(1,2,id):
        print("true")
