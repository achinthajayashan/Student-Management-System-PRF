import java.util.*;
class CourseWork{
	
	static String [][] student = new String [0][2];
	static int [][] marks=new int[0][2];
	
	public static void main(String args[]){
		
		Scanner input = new Scanner (System.in);
		
		while(true){	
		System.out.println("                    ----------------------------------------------------------------------------");
		System.out.println("                    |                    WELCOME TO GDSE MARKS MANAGEMENT SYSTEM               |");
		System.out.println("                    ----------------------------------------------------------------------------");
		System.out.println();
		 
		System.out.println("		[1] Add New Student 				[2]  Add New Student with Marks");
		System.out.println("		[3] Add Marks 				    	[4]  Update Student Marks");
		System.out.println("		[5] Update Marks			        [6]  Delete Student");
		System.out.println("		[7] Print Student Details 	    		[8]  Print Student Ranks");
		System.out.println("		[9] Best In Programming Fundamentals 		[10] Best In Database Management System");
		
		System.out.println();
		
		System.out.print("Enter an option to continue > ");
		int option =input.nextInt();
		
		clearConsole();
		
		switch(option){
			
			case 1 :
				//method add new student
				addNewStudent();
				break;
				
			case 2 :
				//method add new student with marks
				addNewStudentWithMarks();
				break;
				
			case 3 :
				//method add marks
				AddMarks();
				break;
				
			case 4 :
				//method update student marks
				updateStudentDetails();
				break;
				
			case 5 :
				//method update marks
				updateMarks();
				break;
				
			case 6 :
				//method delete student
				deleteStudent();
				break;
				
			case 7 :
				//method print student details
				printStDetail();
				break;
				
			case 8 :
				//method print student ranks
				printStRank();
				break;
				
			case 9 :
				//method Best In Programming Fundamentals
				bestPrf();
				break;
				
			case 10 :
				//method Best In Database Management System
				bestDbms();
				break;
				
			default :
				System.out.println("Invalid option number");
				
			}
			
			
		}
		
	}
		
	public final static void clearConsole() { 
		try {
			final String os = System.getProperty("os.name"); 
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				} else {
				System.out.print("\033[H\033[2J"); 
				System.out.flush();
			}
		} catch (final Exception e) {
		e.printStackTrace();
		// Handle any exceptions.
		}
	}
		
	public static void addNewStudent(){
		Scanner input =new Scanner(System.in);
		
		char opt='y';
		while(opt=='y'){
			String[][] tempStudent=new String[student.length+1][2];
			int[][] tempMarks=new int[student.length+1][2];
			
			for(int i=0; i<student.length;i++){
				for(int j=0; j<student[i].length;j++){
				tempStudent[i][j]=student[i][j];
					}
				}
			
			for(int i=0; i<marks.length;i++){
				for(int j=0; j<marks[i].length;j++){
				tempMarks[i][j]=marks[i][j];
					}
				}
		
			student=tempStudent;
		    marks=tempMarks;
			
			
				clearConsole();
				System.out.println("                    ----------------------------------------------------------------------------");
				System.out.println("                    |                              ADD NEW STUDENT                             |");
				System.out.println("                    ----------------------------------------------------------------------------");
			while(true){	
				System.out.print("\nEnter Student ID : ");
				student[student.length-1][0]=input.next();
				
				int count=0;
				for(int i=0; i<student.length-1;i++){
					if(student[student.length-1][0] .equals (student[i][0])){
						count++;
						}
					}
					
				if(count==0){
					break;
				}else{
					System.out.println("The Student ID Already Exist!");
					}
				
				}
			
			System.out.print("Enter Student name : ");
			student[student.length-1][1]=input.next();
			System.out.println();
			
			System.out.print("Student has been added successfully.");
			
			while(true){
				System.out.print("Do you want to add new student(y/n) : ");
				opt=input.next().charAt (0);
				
				if(opt=='y' || opt=='n'){
					break;
				}else{
					System.out.print("Invalid Input. Try again!");
					}
				}
			
			if(opt=='n'){
				clearConsole();
				
				
				
				}	
				
			}
	    
		
		}
		
	public static void addNewStudentWithMarks(){
		Scanner input =new Scanner(System.in);
		
		char opt='y';
		while(opt=='y'){
			String[][] tempStudent=new String[student.length+1][2];
			int[][] tempMarks=new int[student.length+1][2];
			
			for(int i=0; i<student.length;i++){
				for(int j=0; j<student[i].length;j++){
				tempStudent[i][j]=student[i][j];
					}
				}
			
			for(int i=0; i<marks.length;i++){
				for(int j=0; j<marks[i].length;j++){
				tempMarks[i][j]=marks[i][j];
					}
				}
		
			student=tempStudent;
			marks=tempMarks;
			
			clearConsole();
			System.out.println("                    ----------------------------------------------------------------------------");
			System.out.println("                    |                          ADD NEW STUDENT WITH MARKS                      |");
			System.out.println("                    ----------------------------------------------------------------------------");
			
			while(true){
				
				System.out.print("\nEnter Student ID : ");
				student[student.length-1][0]=input.next();
				
				int count=0;
				for(int i=0; i<student.length-1;i++){
					if(student[student.length-1][0] .equals (student[i][0])){
						count++;
						}
					}
					
				if(count==0){
					break;
				}else{
					System.out.println("The Student ID Already Exist!");
					}
				
				}
			
			System.out.print("Enter Student name : ");
			student[student.length-1][1]=input.next();
			System.out.println();
			
			System.out.print("Student has been added successfully.");
			
			do{
			System.out.println();
			System.out.print("Programming Fundamental Marks : ");
			marks[marks.length-1][0]=input.nextInt();
			
			if(!(marks[marks.length-1][0] >=0 && marks[marks.length-1][0] <101)){
				System.out.println("Invalid Marks. Enter again");
				}
		    }while(!(marks[marks.length-1][0] >=0 && marks[marks.length-1][0] <101));
			
			do{
			System.out.println();
			System.out.print("Database Management Marks : ");
			marks[marks.length-1][1]=input.nextInt();
			
			if(!(marks[marks.length-1][1] >=0 && marks[marks.length-1][1] <101)){
				System.out.println("Invalid Marks. Enter again");
				}
		    }while(!(marks[marks.length-1][1] >=0 && marks[marks.length-1][1] <101));
			
			
			
			while(true){
				System.out.print("Do you want to add new student(y/n) : ");
				opt=input.next().charAt (0);
				
				if(opt=='y' || opt=='n'){
					break;
				}else{
					System.out.print("Invalid Input. Try again!");
					}
				}
			
			if(opt=='n'){
				clearConsole();
				}	
			}
			    
	    
		
		}
		
		
	public static void AddMarks(){
			
		Scanner input =new Scanner(System.in);
		clearConsole();
	
		char opt='y';
		while (opt=='y'){
		
		
			System.out.println("       ------------------------------------------------------------------------------------------------");
			System.out.println("       |                                        ADD MARKS                                             |");
			System.out.println("       ------------------------------------------------------------------------------------------------");	     
		     
			
			int idno=-1;
			char op1='y';
				
			while (true){
				System.out.print("Enter Student ID : ");
				String id=input.next();
		  
				for (int i = 0; i <student.length; i++){
					if (id.equals(student[i][0])){
							idno=i;
					}
				}
		  
				if (idno==-1){
					System.out.print("Invalid Student ID"); 
		  
		  
					while (true){
						System.out.print("\nDo you want to search again(y/n)? :");
						op1=input.next().charAt(0);
			  
						if (op1=='y' || op1=='n'){
							break;
						 }else{
							System.out.print("Invalid Option : ");
						}
					}
				}else{
					System.out.print("Student name "+student[idno][1]);
					break;
				}
				
				if (op1=='n'){
					break;
				}
	  
			}
		
	
		
		
			if (marks[idno][0]>0 || marks[idno][1]>0){
				System.out.println("This student's marks have been already added.\nIf you want to update the marks, please use [4] Update marks option.\n");
		
				}else{
		
		
		
					while(true){
						System.out.print("\n\nEnter programming fundamental marks :");
						marks[idno][0]=input.nextInt();
				  
						if (marks[idno][0]>0 && marks[idno][0] < 100){
							break;
						}else{
							System.out.println("invalid mark.re try");
						}		  
                    }
                    
                    	  
					while(true){
						System.out.print("Enter Database management System Marks : :");
						marks[idno][1]=input.nextInt();
				  
						if (marks[idno][1]>0 && marks[idno][1] < 100){
							break;
						}else{
							System.out.println("invalid mark.re try");
						}		  
					}
               
					System.out.print("Marks have been added. ");     
                    
			}
		
		
		
			while (true){
				System.out.print("Do you want to add marks for another student?(y/n)");
				opt=input.next().charAt(0);
	    
				if(opt =='y' ||opt =='n'){
						break;
					}else{
						System.out.print("Invalid option.");
						}
			}	
			
			clearConsole();
		} 
		     
		
	
     }
     
     public static void updateStudentDetails(){
		 Scanner input = new Scanner (System.in);
		 while(true){
		 clearConsole();
		 System.out.println("                    ----------------------------------------------------------------------------");
		 System.out.println("                    |                            UPDATE STUDENT DETAILS                        |");
		 System.out.println("                    ----------------------------------------------------------------------------");
		 
		 System.out.print("Enter Student ID  : ");
		 String checkID = input.next();
		 
		 for(int i=0; i<student.length; i++){
			 if(checkID .equals (student[i][0])){
				 System.out.println("Student Name : "+student[i][1]);
				 
				 System.out.print("Enter new Student name : ");
				 student[i][1]=input.next();
				 System.out.println("Student Details has been updated successfully. ");
				 }
				 
			
			 }
			 
			 
			 System.out.print("Do you want to add another student details ? (y/n) : ");
			 char opti=input.next().charAt(0);
			 
			 if(opti=='n'){
				 break;
				 }
		 }
		 clearConsole();
	 }
	 
	 public static void updateMarks(){
		 Scanner input = new Scanner(System.in);
		 while(true){
		 System.out.println("                    ----------------------------------------------------------------------------");
		 System.out.println("                    |                                  UPDATE MARKS                            |");
		 System.out.println("                    ----------------------------------------------------------------------------");
		 System.out.println();
		 System.out.print("Enter Student ID");
		 String udID =input.next();
		 
		 for(int i=0; i<student.length; i++){
			 if(udID .equals (student[i][0])){
				 System.out.println("Student name : "+student[i][1]);
				 System.out.println();
				 if(marks[i][0]==0 & marks[i][1]==0){
					 System.out.println("This student's marks yet to be added ");
					 }else{
						 System.out.println("Programming fundamentals Marks : "+marks[i][0]);
						 System.out.println("Database Management System Marks : "+marks[i][1]);
						 System.out.println();
						 
						 while(true){
						System.out.print("\n\nEnter New programming fundamental marks :");
						marks[i][0]=input.nextInt();
				  
						if (marks[i][0]>0 && marks[i][0] < 100){
							break;
						}else{
							System.out.println("invalid mark.re try");
						}		  
                    }
                    
                    	  
					while(true){
						System.out.print("Enter New Database management System Marks : :");
						marks[i][1]=input.nextInt();
				  
						if (marks[i][1]>0 && marks[i][1] < 100){
							break;
						}else{
							System.out.println("invalid mark.re try");
						}		  
					}
						 }
				 }
			 }
			 System.out.print("Do You want to update marks for another student ? (y/n)");
			 char opp= input.next().charAt(0);
			 
			 if(opp=='n'){
				 break;
				 }
				 clearConsole();
		 }
		 clearConsole();
	 }
	 
	public static void deleteStudent(){
	   Scanner input=new Scanner(System.in);
	   
	   char opt='y';
	   char opt1=' ';
	   
	   while (opt=='y'){
	         clearConsole();
		     System.out.println("       ------------------------------------------------------------------------------------------------");
		     System.out.println("       |                                   DELETE STUDENT                                             |");
		     System.out.println("       ------------------------------------------------------------------------------------------------");	  
      
			 int idNo=-1;
             
			 
			 while (true){
				System.out.print("Enter Student ID : ");
				String id=input.next();
		  
				for (int i = 0; i <student.length; i++){
					if (id.equals(student[i][0])){
						idNo=i;
					}
				}
		  
		  
				if(idNo==-1){
					System.out.print("Invalid ID.");
			 
					while (true){
						System.out.print("Do you want search again(y/n) ");
						opt1=input.next().charAt(0);
				 
						if (opt1=='y' || opt1=='n'){
							break;
						}else{
							System.out.print("Invalid Option.");
						}
					}
			 	 
			 	    if (opt1=='n'){
		                break;
	                }  
			   }else{
			        break;
			   }
		  
	 
			}
     
     
    
			for (int y =idNo; y <student.length-1; y++){
				for (int x =0; x < 2;x++){
					student[y][x]=student[y+1][x];
				}
				
	
				String [][] tempdelete1=new String [student.length-1][2];
				int [][] tempdelete2=new int [marks.length-1][2];
		
				for (int a = 0; a<student.length-1; a++){
					for (int b = 0; b < 2; b++){
						tempdelete1[a][b]=student[a][b];
						tempdelete2[a][b]=marks[a][b];
					}	
				}
				
				student=tempdelete1;
				marks=tempdelete2;
	  
			}
	 
			
     
			System.out.println("Student has been deleted succussfully.");
     
			while(true){ 
				System.out.print("do you want to delete another student(y/n).");
				opt=input.next().charAt(0);
     
				if (opt=='y' || opt=='n'){
					break;
				 }else{
					System.out.println("Invalid Option");
				}
			}
     
			if (opt=='n'){
				break;
			}
       
     
		}  
   
      clearConsole();  
    
	}  
		 
	public static int [][] rankStudent(){
	  
		int [][] rank=new int[marks.length][3];
	 
		for (int i = 0; i <marks.length; i++){
			rank[i][0]=i;
			rank[i][2]=marks[i][0]+marks[i][1];	 
		}
	 
		for (int x = 0; x <rank.length; x++){
			for (int i = 0; i <rank.length-1 ; i++){
			 
				int a=rank[i][2];
				int b=rank[i+1][2];
				
				if(a<b){
					rank[i+1][2]=a;
					rank[i][2]=b;
				 
					int c=rank[i][0];
					rank[i][0]=rank[i+1][0];
					rank[i+1][0]=c; 
				 }
			 }	 
		 }
		 
		for (int i = 0; i <rank.length; i++){
			rank[i][1]=i+1;
		}
	   
	   
	   
	   
	   for (int j = 0; j <rank.length-1 ; j++){
		   if (rank[j][2]==rank[j+1][2]){
			   rank[j+1][1]=rank[j][1];
		   }
	   }
	   
	   return rank;
		  
	 }
     
     
    public static void printStDetail(){
		Scanner input=new Scanner (System.in);  
		clearConsole();
	  
		char opt='y';
		while (opt=='y'){
			System.out.println("       ------------------------------------------------------------------------------------------------");
			System.out.println("       |                                  PRINT STUDENT DETAILS                                        |");
			System.out.println("       ------------------------------------------------------------------------------------------------");	  
      
			int addno=-1;
			char opt1='y';
	
			while (true){
				System.out.print("Enter Student ID : ");
				String id=input.next();
		
				for (int i = 0; i < student.length; i++){
					if (id.equals(student[i][0])){
						addno=i;
					}
				}
		
				if (addno==-1){
					System.out.print("Invalid ID.");
			
					while(true){
				
						System.out.print("Do you want search again(y/n)?");
						opt1=input.next().charAt(0);
				
						if (opt1=='y' || opt1=='n'){
							break;
						}else{
							System.out.print("Invalid option.");
						}
					}
		
				}else if(marks[addno][0]>0 && marks[addno][1]>0){
					System.out.println("Student name :"+student[addno][1]+"\n\n\n");
			
			
					int[][] rank = rankStudent();
			
					
				
					System.out.println("+==================================+========+");
					System.out.println("| Programmin fundamentel Marks     | "+marks[addno][0]+"     |");
					System.out.println("| Database Management System Marks | "+marks[addno][1]+"     |");
					System.out.println("| Total Marks                      | "+(marks[addno][0]+marks[addno][1])+"    |");
					System.out.println("| Avg.Mark                         | "+(marks[addno][0]+marks[addno][1])/2.0+"   |");
					System.out.println("| Rank                             | "+(rank[addno][1])+ "      |");
					System.out.println("+==================================+========+");
		
					break;			
				}else{
					System.out.println("Student name :"+student[addno][1]);
					System.out.println("\nMarks yet to be added.");
					break;
				}	
			
		
			}
	
			while(true){
				System.out.print("\n\nDo you want search another Student Details(y/n)?");
				opt=input.next().charAt(0);
		
				if (opt=='y' || opt=='n'){
					break;
				}else{
					System.out.println("Invalid option.");
				}
			}
		
			if (opt=='n'){
				break;
			}	
			
		
		}
		clearConsole();
	 }
	  
	public static void printStRank(){
		Scanner input=new Scanner(System.in);
	   
		int[][] rank = rankStudent();
		char opt;
		
		while(true){
		  
			clearConsole();	    
			System.out.println("       ------------------------------------------------------------------------------------------------");
			System.out.println("       |                                   PRINT STUDENTS RANKS                                       |");
			System.out.println("       ------------------------------------------------------------------------------------------------");
			System.out.println();
		  
		  
		  
	  
			System.out.println("+-----+------+--------+------------+----------+"); 
			System.out.println("|Rank |ID    |Name    |Total Marks |Avg. Marks|");  
			System.out.println("+-----+------+--------+------------+----------+"); 
	 
	 
			for (int i = 0; i <rank.length; i++){
	 
				System.out.println("|"+rank[i][1] +"    |"+student[i][0]+"  |"+student[i][1]+"    |        "+rank[i][2] +" |      "+((rank[i][2])/2.0)+"|");  
		 
			}
	 
			System.out.println("+-----+------+--------+------------+----------+"); 
	   
			while(true){ 
				System.out.print("\nDo you want to go back main menu(y/n)?");
				opt=input.next().charAt(0);  
	  
				if (opt=='y' || opt=='n'){
					break;
				}else{
					System.out.println("Invalid option");  
				}
			}
	   
			if (opt=='y'){
				break;
			}
		}
		clearConsole();  
	  }
	
	public static int [][] prfsort(int z){
	  
	  int [][] proSort=new int[marks.length][2];
	  
	  for (int i = 0; i <marks.length; i++){   
		  
		  proSort[i][0]=i;
		  proSort[i][1]=marks[i][z];
		  
	  }
	 
	  
	  for (int x = 0; x <proSort.length; x++){   
		  for (int j = 0; j <proSort.length-1; j++){
			  if (proSort[j][1]<proSort[j+1][1]){
				 int tempery=proSort[j][1];
				 proSort[j][1]=proSort[j+1][1];
				 proSort[j+1][1]=tempery;
				 
				 int c=proSort[j][0];
				 proSort[j][0]=proSort[j+1][0];
				 proSort[j+1][0]=c;
			  } 
		  }
		  
	  }
	  
	  return proSort;
	  
	  }
	  
	public static void bestPrf(){
		Scanner input = new Scanner(System.in);
		while(true){  
	 
			clearConsole();	    
			System.out.println("       ------------------------------------------------------------------------------------------------");
			System.out.println("       |                                 BEST IN PROGRAMMING FUNDAMENTAL                              |");
			System.out.println("       ------------------------------------------------------------------------------------------------");
			System.out.println();
		  	 
			int [][] prfst=prfsort(0);
			System.out.println(Arrays.deepToString(prfst));
	 
			System.out.println("+-----+-----------------+---------+----------+");
			System.out.printf("|ID   |Name             |PF Marks |BDMS Marks|"); 
			System.out.println("+-----+-----------------+---------+----------+");
	 
			for (int i = 0; i < prfst.length; i++){
		 
				int x=prfst[i][0];
	   
				System.out.println("|"+student[x][0]+" |"+student[x][1]+"    |"+prfst[i][1]+"     |"+marks[x][1]+"      |");
		 
			}
	 
			System.out.println("+-----+-----------------+---------+----------+");
	 
	  
			char opt=' ';
			
			while(true){ 
				System.out.print("\nDo you want to go back main menu(y/n)?");
				opt=input.next().charAt(0);  
	  
				if (opt=='y' || opt=='n'){
					break;
				}else{
					System.out.println("Invalid option");  
				}
			}
	   
			if (opt=='y'){
				break;
			} 
	  
		} 
		clearConsole();
	}
    public static void bestDbms(){
		Scanner input =new Scanner(System.in);
	
		while(true){  
	 
			clearConsole();	    
			System.out.println("       ------------------------------------------------------------------------------------------------");
			System.out.println("       |                              BEST IN DATABASE MANAGEMENT SYSTEM                              |");
			System.out.println("       ------------------------------------------------------------------------------------------------");
			System.out.println();
		  	 
			int [][] dbmst=prfsort(1);
			
	 
			System.out.println("+-----+-----------------+-----------+----------+");
			System.out.println("|ID   |Name             |DBMS Marks | PF Marks |"); 
			System.out.println("+-----+-----------------+-----------+----------+");
	 
			for (int i = 0; i < dbmst.length; i++){
		 
				int x=dbmst[i][0];
	   
				System.out.println("|"+student[x][0]+" |"+student[x][1]+"    |"+marks[x][0]+"     |"+ dbmst[i][1]+"      |");
		 
			}
	 
			System.out.println("+-----+-----------------+-----------+----------+");
	 
	  
			char opt=' ';
			
			while(true){ 
				System.out.print("\nDo you want to go back main menu(y/n)?");
				opt=input.next().charAt(0);  
	  
				if (opt=='y' || opt=='n'){
					break;
				}else{
					System.out.println("Invalid option");  
				}
			}
	   
			if (opt=='y'){
				break;
			} 
	  
		}
		clearConsole();   
	   
	 }	
}

