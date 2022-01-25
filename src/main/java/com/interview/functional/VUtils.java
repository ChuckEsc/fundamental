package com.interview.functional;

public class VUtils {

    static ThrowExceptionFunction isTrue(boolean b) {
        return (message -> {
            if (b) {
                throw new RuntimeException(message);
            }
        });
    }

    static BranchHandle isTureOrFalse(boolean flag) {
        return ((trueHandle, falseHandle) -> {
            if (flag) {
                trueHandle.run();
            } else
                falseHandle.run();
        });
    }

    /**
     * 参数为true或false时，分别进行不同的操作
     *
     * @param str
     * @return com.interview.functional.BranchHandle
     **/
    public static PresentOrElseHandler<?> isBlankOrNoBlank(String str){

        return (consumer, runnable) -> {
            if (str == null || str.length() == 0){
                runnable.run();
            } else {
                consumer.accept(str);
            }
        };
    }


    public static void main(String[] args) {
        isTrue(false).throwMessage("nothing message");
        isTureOrFalse(false).trueOrFalseHandle(() -> System.out.println("it's true"),
                () -> System.out.println("it's false"));
        isBlankOrNoBlank("not blank").presentOrElseHandle(System.out::println,
                () -> System.out.println("it's blank"));
        isTrue(true).throwMessage("NNP Exception");
    }


}
