// 1. Write a method that takes a positive integer n as input and returns
//an array containing the first n primes.
import java.util.Arrays;

class getPrimesBabyyyy
{
    public static int[] GetPrimes(int N)
    {
        int[] primes = {};
        int num = 2;
        while(primes.length != N)
        {
            boolean isPrime = true;

            for(int i = 2; i <= num/2; ++i)
            {
                if(num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
            {
                primes = Arrays.copyOf(primes, primes.length+1);
                primes[primes.length-1] = num;
            }

            num += 1;
        }

        return primes;
    }

    public static void main(String[] args)
    {
        int[] primes = GetPrimes(10);

        for(int num : primes)
        {
            System.out.print(num + " ");
        }
        System.out.print("\n");
    }
}