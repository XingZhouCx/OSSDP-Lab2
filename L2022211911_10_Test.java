public class L2022211911_10_Test {
    public static void main(String[] args) {
        Solution10 solution = new Solution10();
        String[] expressions = {
                "-1/2+1/2",
                "-1/2+1/2+1/3",
                "1/3-1/2",
                "5/3+1/3",
                "-2/3+1/3",
                "7/10-2/5+1/2"
        };
        for (String expression : expressions) {
            String result = solution.fractionAddition(expression);
            System.out.println("表达式: " + expression + " = " + result);
        }
    }
}
