n = 40
def sieve_of_erathosthenes(n):
    primes = [True]*(n+1)
    primes[0:2]=[False,False]
    i = 2
    for i in range(2,int(n**0.5)+1):
        if primes[i]:
            for j in range(i*2,n+1,i):
                primes[j]=False
    return [i for i,prime in enumerate(primes) if prime]
    
        
   # print(primes)

print(sieve_of_erathosthenes(n))
