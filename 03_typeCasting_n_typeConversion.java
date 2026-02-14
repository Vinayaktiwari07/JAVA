class typeCasting_n_typeConversion {
    public static void main(String[] args){
        // byte b = 125;
        int a = 257;
        byte k = (byte) a; // jb bade data type ko chhote data type me convert krte hai then usko type casting bolte hai.
        System.out.println(k);

        float f = 5.6f;
        int t = (int)f;
        System.out.println(t);
        
        byte g = 23;
        int c = g; // jb chhote data type ko bade data type me convert krte hai usko type conversion bolte hai.
        System.out.println(c);

    }
    
}
