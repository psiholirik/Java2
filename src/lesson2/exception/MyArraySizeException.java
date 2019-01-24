package lesson2.exception;

class MyArraySizeException extends RuntimeException {
  MyArraySizeException(String message) {
    super(message);
  }
}