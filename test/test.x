program teste {
	
	//declaração de variaveis

    int i;
    x = 2;
    double x;
    double y = 5;

    //ponteiros

    int* teste;

    // print

    print("teste 123");

    //array

    int teste[5];
    int teste[5][3];

    // while

    while(x > 6){
        x++;
        print(x);
    }

    // for

    for (int i = 0; i < 5; i++) {
        print(i);
    }

    for (int i = 0; i < 5; i = i + 1) {
        print(i);
    }

    // condicional

    if(x > 5) {
       print(x);
    } else {
        print(y);
    }

    if(x > 5 && y > 8) {
       print(x);
    } else {
        print(y);
    }

    if(x > 5) {
       print(x);
    } else if (x > 6) {
        print(y);
    }

    if(x > 5) {
       print("x > 5");
    } else if (x > 6) {
        print("x > 6");
    } else {
        print("NÃO");
    }

    // functions

    int soma(int a){
        print(a);
        return x;
    }

    int soma(int a, int b, int c){
        int c = a + b;
        return x;
    }

    int soma(int a, int b, int c){
        int c = a + b;
        return 5;
    }

   void soma(){
        print("teste");
    }
}