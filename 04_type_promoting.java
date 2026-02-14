class type_promoting {
    public static void main(String[] args){
        byte a = 10;
        byte b = 30;

        int result = a*b; //ye value byte k liye out of range hai so compiler automatically data type ko promote kr dega integer type me.

        System.out.println(result);
    }
    
}
