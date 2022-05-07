A, B, C  = map(int,input().split())

mul = 100
plus = 1000

if A == B == C:
    mul = 1000
    score = A
    plus = 10000
    
elif A == B or A == C:
    score = A
elif B == C:
    score = B
else:
    score = max(A,B,C)
    plus = 0
    
print(score*mul + plus)