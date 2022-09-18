public class Factorial1 {
        public static int factorial(int n){
            if(n==0){
                return 1;
            }
            int x = factorial(n-1);
            return n*x;
        }
        public  static int fib(int n){
            if(n==0 ||n==1)
                return n;

            int x= fib(n-1);
            int y=fib(n-2);
            return x+y;
        }
        public static void printnum(int num){
            if(num==0){
                return;
            }
            else{

                printnum(num -1);
                System.out.println(num);
            }
        }
        public static int catEye(int cats){
            if(cats ==0){
                return 0;
            }else{
                return 2+ catEye(cats-1);
            }
        }
        public static int power(int base, int num){
            if(num ==1){
                return base;
            }
            else{
                return base*power(base,num -1);
            }
        }
        public static int speakerinmob(int mob){
            if(mob==0){
                return 0;
            }
            else if (mob% 2==0){
                return 2+speakerinmob(mob -1);
            }
            else{
                return 1 +speakerinmob(mob-1);
            }
        }
        public static int sum(int num){
            if(num <= 9){
                return 0;
            }
            else{
                int l = num%10;
                sum(num/10);
                int r =l+l;
                return r;
            }
        }
        public static int count5(int num) {
            int count = 0;
            if (num <= 10) {
                if (num == 5) {
                    return 1;
                } else {
                    return 0;
                }
            } else {

                if (num % 10 == 5) {
                    return 1 + count5(num / 10);
                } else {
                    return 0 + count5(num / 10);
                }
            }
        }
        public static int binarySearch(int[] array,int key, int start,int end){
            if(start <=end){
                int middle =start+end/2;
                if(array[middle]< key){
                    return binarySearch(array,key,middle+1,end);
                }else{
                    return middle;
                }
            }else{
                return -1;
            }
        }
        public static void main(String args[])
        {
            int result = factorial(4);
            System.out.println(result);
            int r =fib(6);
            System.out.println(r);
            printnum(5);
            System.out.println("cat eyes "+catEye(5));
            System.out.println("power "+power(3,2));
            System.out.println("number of speaker "+ speakerinmob(4));
            System.out.println("sum " +sum(123));
            System.out.println("number of 5 :"+ count5(15550));
            int []array ={11,12,33,88,66,77,33};
            System.out.println("BinarySearch "+binarySearch(array,33,0,array.length-1));
        }
    }


