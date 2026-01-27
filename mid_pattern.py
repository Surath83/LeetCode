def pattern(num, repeat):
    matrix=[[" " for _ in range(num)] for _ in range(num)]
    n=num
    a=int(n/2)
    b=int(n/2)
    for i in range(n):
        for j in range(n):
            if(i==0 or i==n-1):
                matrix[i][j]="-"
            elif(j==0 or j==n-1):
                matrix[i][j]="|"
            
    for i in range(int(n/2)):
        matrix[i][a]="*"
        matrix[i][b]="*"
        a-=1
        b+=1

    for i in range(int(n/2),n):
        matrix[i][a]="*"
        matrix[i][b]="*"
        a+=1
        b-=1

    printpattern(matrix,repeat)
    return None

def printpattern(matrix,repeat):
    for i in range(matrix[0].__len__()):
        for _ in range(repeat):
            for j in range(matrix[0].__len__()):
                print(matrix[i][j],end=" ")
        print()
    return None

if __name__ == "__main__":
    pattern(5,1)
    pattern(7,4)
    pattern(9,2)