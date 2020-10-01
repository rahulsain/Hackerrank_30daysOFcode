// Declare second integer, double, and String variables.
   int j;
   double e;
   char t[1000];

   // Read and save an integer, double, and String to your variables.
   scanf("%d%lf", &j,&e);
   getchar();
   scanf("%[^\n]s", t);
   // Print the sum of both integer variables and double variables on a new line.
   printf("%d\n%.1lf\n",(i+j), (d+e));
   printf("%s%s", s,t);
