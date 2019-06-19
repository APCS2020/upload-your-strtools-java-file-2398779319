public class StrTools{
    /**
     * public 这是一个用来说明方法访问范围的关键字，public的方法 可以在client program里访问 
     * static：静态方法关键字，此方法可以
     * 直接用className.methodName()调用 Boolean：这是返回值类型return type ispali：MethodName
     * string str：parameter type
     */
    public static class str {
        public static boolean ispali(String str){
            String half = str.substring(0, str.length() / 2);
            String SecondHalf = "";
            if (str.length() % 2 == 0) {
                SecondHalf = str.substring(str.length() / 2, str.length());
            } else {
                SecondHalf = str.substring(str.length() / 2 + 1);
            }
            return reverseStr(SecondHalf).equals(half);// ture of false
        }
    }
    public static String changeFirstChar(String str){
        //String remainedstr =str.substring(1);
        //String firstChar =str.substring(0, 1);
        //return firstChar.toUpperCase() + remainedstr;
        return str.substring(0, 1).toUpperCase() +
               str.substring(1);
    }
    
    public static Object reverseStr(String secondHalf) {
        return null;
    }

    public static String addPeriod(String str) {
        return str + ".";
    }
    //replace a target word with a given word
    public static String replace(String str,String target, String repl){
        int firstIndex = str.indexOf(target);
        int secondIndex = firstIndex + target.length();
        String firstPart = str.substring(0,firstIndex);
        String secondPart =str.substring(secondIndex);  
        return firstPart + repl +secondPart;
    }
    //print single characterof a string
    //"abcd" return "a, b, c, d."
    public static String printSingleChar(String str){
        int index = 0;
        String tmp = "";
        while(index < str.length()-1){
        tmp += str.substring(0, 1);
        tmp += ",";
        tmp += " ";
        }
        return tmp + str.substring(str.length()-1) + ".";        
    }
    public static String reverse(String str){
        int index = str.length()-1;
        //index = str.length(),index 容易越界，因为substring可以在末尾越界，因为在这里
        String tmp = "";
        while(index > 0){
            tmp += str.substring(index,index+1);
            index --;
    }
    return tmp;
}
    public static String parliword(String str){
        return str + reverse(str); 
    }
    public static String parlidrom(String str){
        String tmp = "";
        if(str.length() % 2 ==0){
           tmp = str.substring(0,str.length()/2);
       }else{
           tmp = str.substring(0,str.length()/2+1); 
    }return tmp + reverse(tmp);
} 
    public static void main(String[] args) {        
        String str ="the dog is so cute";//change the first charator 't'
        String tmp =replace(str,"dog","cat");//tmp"The"
        System.out.println(tmp);
        }
}