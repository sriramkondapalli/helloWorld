object HelloWorld{
def main(args: Array[String]){
println("Enter a Number:");
var num = Console.readInt;
var x =0;
while(num>0){
num = num/10;
x = x+1;
}
println("The number of digits is:" + x);
}
}

/*object HelloWorld {
   def main(args: Array[String]) {
      // Local variable declaration:
println("Enter a Number:");
      var a = Console.readInt;
      var b = 0;
 
      // while loop execution
      while( a > 0 ){
         a = a/10;
         b = b + 1;
      }
println( "Number of Digits: " + b );
   }
}*/