public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++){
                sum += arr[i];
            }
            System.out.println("Среднее арифмитеческое: " + sum / arr.length); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Ошибка: Выход за границы массива. - " + e);
        } catch (NumberFormatException e) {
            System.err.println("Ошибка: В массиве присутствуют не числовые данные. - " + e); 
        }
    }
}
