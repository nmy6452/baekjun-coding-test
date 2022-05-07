A, B  = map(int,input().split())
C = int(input())

M = (A*60) + B + C
H = M/60
if H>=24:
    H = H-24
    
M = M%60
print(int(H), M)