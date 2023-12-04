program test_pointer {

     int* pointer_int;
     int x = 42;
     pointer_int = x;
     
     print("Pointer int value after manipulation: " + pointer_int);
     
     float* pointer_float;
     float y = 52.2;
     pointer_float = y;
     
     print("Pointer double value after manipulation: " + pointer_float);

}