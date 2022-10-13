import uulib.Console;

class Main {
    public static  void countdown(int num ){
    char[] chararr = {'C','O','D','E'};
   
    int arrayi = 0;

    while (num >0){                               //ensure number is not zero(end)
        System.out.print(num + " ");              //print the number+ space to seperate from char
        System.out.print(chararr[arrayi] + "\n"); // print char and a new line to seperate
        num = num - 1;                            //increment num counter - to get to zero
        arrayi = arrayi + 1;                      //increent array index - to work way through char 
        if (arrayi == chararr.length){            //ensure char array is not greater than length
            arrayi = 0;                           // if index is 4 reset index to 0 to start from 'c'
        }
    }
    }

    public static void main(String[] args) {
        countdown(Console.getInt("Enter number: "));
  }
}
