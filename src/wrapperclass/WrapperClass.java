package wrapperclass;

public class WrapperClass {
    public static void main(String[] args) {
        // Primitive data types
        int primitiveInt = 10;
        double primitiveDouble = 3.14;

        // Wrapper classes
        Integer wrapperInt = Integer.valueOf(primitiveInt);
        Double wrapperDouble = Double.valueOf(primitiveDouble);

        // Auto-boxing (automatic conversion from primitive to wrapper)
        Integer autoBoxedInt = primitiveInt; // Auto-boxing
        Double autoBoxedDouble = primitiveDouble; // Auto-boxing

        // Unboxing (automatic conversion from wrapper to primitive)
        int unboxedInt = wrapperInt; // Unboxing
        double unboxedDouble = wrapperDouble; // Unboxing

        // Displaying values
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Auto-boxed Integer: " + autoBoxedInt);
        System.out.println("Unboxed int: " + unboxedInt);

        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Wrapper Double: " + wrapperDouble);
        System.out.println("Auto-boxed Double: " + autoBoxedDouble);
        System.out.println("Unboxed double: " + unboxedDouble);
        
    }
}
