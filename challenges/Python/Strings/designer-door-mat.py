# Enter your code here. Read input from STDIN. Print output to STDOUT
if __name__ == '__main__':
    x = input().split(' ')
    H = int(x[0])
    L = int(x[1])
    for i in range(H):
        if i == int((H+1)/2)-1:
            print('-'*(int((L-7)/2)) + 'WELCOME' + '-'*(int((L-7)/2)))
        if i < int((H+1)/2)-1:
            print('-'*(int((L-3)/2 - 3*i)) + '.|.'*(1+2*i) + '-'*(int((L-3)/2 - 3*i)))
        if i > int((H+1)/2)-1:
            X = H-i-1
            print( 
                ('-'*(int((L-3)/2 - 3*(X) ))) + 
                ('.|.'*(1+2*(X))) + 
                ('-'*(int((L-3)/2 - 3*(X)))) 
                )
            
