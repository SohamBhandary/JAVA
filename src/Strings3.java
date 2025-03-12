class Strings3 {
    public static void main(String[] args)
    {
        StringBuffer sb= new StringBuffer("Soham");
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
        sb.append("Bhandary");
        System.out.println(sb);

//		String str=sb.toString();

//		sb.deleteCharAt(2);
//		sb.insert(0,"Java");
//		sb.insert(6,"java");
//		sb.setLength(30);
        sb.ensureCapacity(100);

        System.out.println(sb);

    }
}