package app;

public class Main {
    public static void main(String[] args) {
        try {
            MethodInfo methodInfo = ArrayUtils.class.getDeclaredMethod("getLength", int[].class).getAnnotation(MethodInfo.class);
            Author author = ArrayUtils.class.getDeclaredMethod("getLength", int[].class).getAnnotation(Author.class);

            // Виведення інформації про метод
            System.out.println("Назва: " + methodInfo.name());
            System.out.println("Тип поверненого значення: " + methodInfo.returnType());
            System.out.println("Опис: " + methodInfo.description());
            System.out.println("Ім'я автора: " + author.firstName());
            System.out.println("Прізвище автора: " + author.lastName());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
