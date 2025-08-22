def nt(n):
    res=1
    for i in range (1,n,1):
        res*=i
    return res
t=int (input())
for _ in range (t):
    n=input()
    sum=0
    for i in range (len(n)):
        sum+=nt(int(n[i]))
    if sum== int(n):
        print ('Yes') 
    else:
        print ('No')      
        
       