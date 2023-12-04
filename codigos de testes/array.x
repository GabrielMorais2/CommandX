program test_pointer {

   float x[5];

	x[0] = 3.5;
	x[1] = 33.5;
	x[2] = 233.5;
	x[3] = 255.5;
	x[4] = 213.5;
	
	int i;
	for (i = 0;i < 5; i++){
		print(x[i]);
	}

}