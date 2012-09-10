//code for Raja-Mantri-Chor-Sipahi game
public class RajaMantriChorSipahi extends Activity {
    
	
	@Override
	public void onbackpressed() {}

	@Override
	protected void onpostresume() {
		// TODO Auto-generated method stub
		super.onpostresume();
	}

	@Override
	public boolean onkeydown(int keyCode, KeyEvent event) {
		AlertDialog alertDialog = new AlertDialog.Builder(this).create();
		alertDialog.setTitle("Exit game!");
		alertDialog.setMessage("Are you sure you want to exit the game?");
		//Display exit dialogue box.
                alertDialog.setButton("Exit", new DialogInterface.OnClickListener() {
		
           //exit game on exit button click	
	public void onClick(DialogInterface alertDialog, int which) {
				
				finish();
				
			}
		});
	//cancel dialogue box on cancel button click
	alertDialog.setButton2("Cancel", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface alertDialog, int which) {
				
				alertDialog.dismiss();
				
			}
		});
		alertDialog.show();
		return super.onKeyDown(keyCode, event);
	}

	@Override
         //alert box displayed on low memory status
	public void onlowmemory() {
		AlertDialog alertDialog = new AlertDialog.Builder(this).create();
		alertDialog.setTitle("Low Memory!");
		alertDialog.setMessage("Too many apps open, kindly close some other apps and try again!");
		alertDialog.setButton("Exit", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface alertDialog, int which) {
				
				finish();
				
			}
		});
		
		alertDialog.show();

		super.onLowMemory();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	String[] solutionArray = { "RAJA", "MANTRI", "CHOR", "SIPAHI"};
	String[] playersArray = {"Player1", "Player2", "Player3", "Player4"};
	static String player1_name = "";
	static String player2_name = "";
	static String player3_name = "";
	static String player4_name = "";
	static String player1_role = "";
	static String player2_role = "";
	static String player3_role = "";
	static String player4_role = "";
        //to guess the role of the player
	static boolean guess = false;
	static String player1 = "";
	static String player2 = "";
	static String player3 = "";
	static String player4 = "";
        //to calculate the score of each player
	static int i=0,j=0,k=0,l=0;
	static int p1score = 0;
	static int p2score = 0;
	static int p3score = 0;
	static int p4score = 0;
	int count = 0;
	
	Button RajaMantri;
	Button Help;
	ImageView btn9;
	Button Play;
	static Button Pod1;
	static Button Pod2;
	static Button Pod3;
	static Button Pod4;
	Button ShowResult;
	Button Restart;
	Button Sign_in;
	Button Guess;
	EditText editTxtPlayer1;
	EditText editTxtPlayer2;
	EditText editTxtPlayer3;
	EditText editTxtPlayer4;
	EditText edit2;
	EditText edit3;
	EditText edit4;
	
	TextView lblPlayer1;
	TextView lblPlayer2;
	TextView lblPlayer3;
	TextView lblPlayer4;
	static TextView txtTurn;
	static TextView txtPlayer1;
	static TextView txtPlayer2;
	static TextView txtPlayer3;
	static TextView txtPlayer4;
	Bundle savedInstanceState2;
	Button MainMenu;
    
	String nextTurn = "";
	
	
    public void onRestart(){
    	
    	super.onRestart();
    }
    
    public void onResume(){
    	
    	super.onResume();
    }


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
      
        i = 0;
        j = 0;
        k = 0;
        l = 0;
        Help = (Button)findViewById(R.id.Help);
        Help.setOnClickListener(new OnClickListener(onClick()));
			//onClick function overriden 1
			public void onClick() {
				setContentView(R.layout.help);
				 // Create the adView
			    AdView adView = new AdView(RajaMantri.this, AdSize.BANNER, "a14e156523d01de");
			    // Lookup your LinearLayout assuming it’s been given
			    // the attribute android:id="@+id/mainLayout"
			    LinearLayout layout = (LinearLayout)findViewById(R.id.mainLayoutHelp);
			    // Add the adView to it
			    layout.addView(adView);
			    // Initiate a generic request to load it with an ad
			    adView.loadAd(new AdRequest());
                              //This text is viewed on click of Help button.
				TextView txtHelp = (TextView)findViewById(R.id.txtHelp);
				String text = "Welcome to Nostalgia! This is the paper free version of Raja Mantri Chor Sipahi.\n\nThe game involves bluffing with facial expressions and good guessing. This is a very popular childhood game in India played among kids often during their long summer vacations.\n\nThe game has 4 paper chits with Chor (thief), Sipahi (police), Raja (king) and Mantri (minister). The chits are folded at the start of the game and one of the 4 players will press SHUFFLE each one of the four players is supposed to secretly (by taking the phone and not letting the others see it)pick one chit by clicking on it, the player then clicks on the chit again to fold it back. All the players will then secretly open their chits and read what they have got. \n\nThe player who gets the chit with Raja written on it will say MERA MANTRI KAUN? (Who is my minister?). The player who got the chit with Mantri will say MEIN! (Me). The player who has the Raja chit will then say CHOR SIPAHI KA PATA LAGAO (find out who is the theif and who is the soldier). The player with the Mantri chit will then guess who is the Chor (Thief), if he/she is wrong then his points are deducted and if he is correct he gets more points and the points from the player who got Chor (Thief) chit are deducted.\n\nIf the guess is correct the Chor is wrapped on his wrist by the Mantri, and if the Mantri chit is wrong then Chor gets to hit his wrist.";
				txtHelp.setText(text);
}

				Button Back = (Button)findViewById(R.id.btnMainMenuHelp);
				Back.setOnClickListener(new OnClickListener(onClick(View v));
				//onClick function overriden 2	
					public void onClick(View v) {
						
						Intent i = new Intent(RajaMantri.this, RajaMantri.class);
						RajaMantri.this.startActivity(i);
						finish();
					}
					
        RajaMantri = (Button)findViewById(R.id.RajaMantri);
        RajaMantri.setOnClickListener(new OnClickListener() {
        	
 		public void onClick(View v) {
 			// TODO Auto-generated method stub
 		setContentView(R.layout.rmcsp);	
 		 // Create the adView
	    AdView adView = new AdView(RajaMantri.this, AdSize.BANNER, "a14e156523d01de");
	    // Lookup your LinearLayout assuming it’s been given
	    // the attribute android:id="@+id/mainLayout"
	    LinearLayout layout = (LinearLayout)findViewById(R.id.mainLayoutPlayer);
	    // Add the adView to it
	    layout.addView(adView);
	    // Initiate a generic request to load it with an ad
	    adView.loadAd(new AdRequest());
	    
 		editTxtPlayer1 = (EditText)findViewById(R.id.editTxtPlayer1);
 		editTxtPlayer2 = (EditText)findViewById(R.id.editTxtPlayer2);
 		editTxtPlayer3 = (EditText)findViewById(R.id.editTxtPlayer3);
 		editTxtPlayer4 = (EditText)findViewById(R.id.editTxtPlayer4);
 		
 		lblPlayer1 = (TextView) findViewById(R.id.lblPlayer1);
 		lblPlayer2 = (TextView) findViewById(R.id.lblPlayer2);
 		lblPlayer3 = (TextView) findViewById(R.id.lblPlayer3);
 		lblPlayer4 = (TextView) findViewById(R.id.lblPlayer4);
 		
 		Display display = getWindowManager().getDefaultDisplay(); 
 		int width = display.getWidth();
 		int height = display.getHeight();
 		
 		
 		
 		lblPlayer1.setGravity(Gravity.CENTER_HORIZONTAL);
 		lblPlayer2.setGravity(Gravity.CENTER_HORIZONTAL);
 		lblPlayer3.setGravity(Gravity.CENTER_HORIZONTAL);
 		lblPlayer4.setGravity(Gravity.CENTER_HORIZONTAL);
 		
 		
 		Log.v("AkandBakar", "Playernames:" + player1_name);
 		Log.v("AkandBakar", "Playernames:" + player2_name);
 		Log.v("AkandBakar", "Playernames:" + player3_name);
 		Log.v("AkandBakar", "Playernames:" + player4_name);
 		
 		MainMenu = (Button) findViewById(R.id.MainMenu);
 		MainMenu.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View v) {
				Intent i = new Intent(RajaMantri.this, RajaMantri.class);
				RajaMantri.this.startActivity(i);
				finish();
			}
		});
 		
 		Sign_in = (Button)findViewById(R.id.btnsignin);
 		Sign_in.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				player1_name = editTxtPlayer1.getText().toString();
		 		player2_name = editTxtPlayer2.getText().toString();
		 		player3_name = editTxtPlayer3.getText().toString();
		 		player4_name = editTxtPlayer4.getText().toString();
		 		
		 		
				if(player1_name.equals("")||player2_name.equals("")||player3_name.equals("")||player4_name.equals("")){
					
					Toast toast = Toast.makeText(getBaseContext(), "Enter player names!", 8000);
					toast.show();
					
				}else{
					setContentView(R.layout.rmcsgnew);	
					 // Create the adView
				    AdView adView = new AdView(RajaMantri.this, AdSize.BANNER, "a14e156523d01de");
				    // Lookup your LinearLayout assuming it’s been given
				    // the attribute android:id="@+id/mainLayout"
				    LinearLayout layout = (LinearLayout)findViewById(R.id.mainLayout);
				    // Add the adView to it
				    layout.addView(adView);
				    // Initiate a generic request to load it with an ad
				    adView.loadAd(new AdRequest());

					txtTurn = (TextView)findViewById(R.id.txtTurn);
					txtTurn.setText("Click on SHUFFLE!");
					playersArray[0] = player1_name;
			 		playersArray[1] = player2_name;
			 		playersArray[2] = player3_name;
			 		playersArray[3] = player4_name;
			 		
			 		txtPlayer1 = (TextView) findViewById(R.id.txtPlayer1);
					txtPlayer1.setText("1."+player1_name + " [" + p1score + "]");
					
					txtPlayer2 = (TextView) findViewById(R.id.txtPlayer2);
					txtPlayer2.setText("2."+player2_name+ " [" + p2score + "]");
					
					txtPlayer3 = (TextView) findViewById(R.id.txtPlayer3);
					txtPlayer3.setText("3."+player3_name+ " [" + p3score + "]");
					
					txtPlayer4 = (TextView) findViewById(R.id.txtPlayer4);
					txtPlayer4.setText("4."+player4_name+ " [" + p4score + "]");
					
				Play = (Button)findViewById(R.id.Play);
				
				Play.setOnClickListener(new OnClickListener() {
		 			
		 			public void onClick(View v) {
		 				// TODO Auto-generated method stub
		 				
		 				if(Play.getText().equals("SHUFFLE")){
		 				
		 					RajaMantri.this.shuffle();
		 					
		 				}else{
		 					
		 					
		 					RajaMantri.this.makeGuess();
										
		 					Log.v("RajaMantri", "########## Player Name:" + player1_name +" Role:" + player1_role);
		 					Log.v("RajaMantri", "########## Player Name:" + player2_name +" Role:" + player2_role);
		 					Log.v("RajaMantri", "########## Player Name:" + player3_name +" Role:" + player3_role);
		 					Log.v("RajaMantri", "########## Player Name:" + player4_name +" Role:" + player4_role);
						}
						
		 				
		 			}
		 		});
		         
		         }
		         
		     }
		     
		 	});
			}

		});
 		 
       }
    
    
    public void makeGuess(){
    	
    	Play.setText("SHUFFLE");
			count = 0;
			Play.setText("SHUFFLE");
			
			Pod1.setClickable(true);
			Pod2.setClickable(true);
			Pod3.setClickable(true);
			Pod4.setClickable(true);
			
		if(player1.equals("RAJA")){
			
			Pod1.setText("RAJA");
			Pod1.setBackgroundResource(R.drawable.podopen);
			Pod1.setClickable(false);
		}
		if(player2.equals("RAJA")){
			
			Pod2.setText("RAJA");
			Pod2.setBackgroundResource(R.drawable.podopen);
			Pod2.setClickable(false);
		}
		if(player3.equals("RAJA")){

			Pod3.setText("RAJA");
			Pod3.setBackgroundResource(R.drawable.podopen);
			Pod3.setClickable(false);
		}
		if(player4.equals("RAJA")){

			Pod4.setText("RAJA");
			Pod4.setBackgroundResource(R.drawable.podopen);
			Pod4.setClickable(false);
		}

		if(player1.equals("MANTRI")){
			
			Pod1.setText("MANTRI");
			Pod1.setBackgroundResource(R.drawable.podopen);
			Pod1.setClickable(false);
		}
		if(player2.equals("MANTRI")){
			
			Pod2.setText("MANTRI");
			Pod2.setBackgroundResource(R.drawable.podopen);
			Pod2.setClickable(false);
		}
		if(player3.equals("MANTRI")){

			Pod3.setText("MANTRI");
			Pod3.setBackgroundResource(R.drawable.podopen);
			Pod3.setClickable(false);
		}
		if(player4.equals("MANTRI")){

			Pod4.setText("MANTRI");
			Pod4.setBackgroundResource(R.drawable.podopen);
			Pod4.setClickable(false);
			
		}
		
		if(player1_role.equals("MANTRI")){
			txtTurn.setText(player1_name + " will find the CHOR!");
		}
		if(player2_role.equals("MANTRI")){
			txtTurn.setText(player2_name + " will find the CHOR!");
		}
		if(player3_role.equals("MANTRI")){
			txtTurn.setText(player3_name + " will find the CHOR!");
		}
		if(player4_role.equals("MANTRI")){
			txtTurn.setText(player4_name + " will find the CHOR!");
		}
		
		Log.v("AkhandBakar","#########" + Pod1.getText());
		
		if(Pod1.getText().equals("")){
			
			Pod1.setOnClickListener(new OnClickListener() {
				
			
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Log.v("AkhandBakar","#########" + player1);
					if(player1.equals("CHOR")){
					
						RajaMantri.guess = true;
						Pod1.setBackgroundResource(R.drawable.podopen);
						Pod1.setText("CHOR");
						
					}else{
						
						RajaMantri.guess = false;
						Pod1.setBackgroundResource(R.drawable.podopen);
						Pod1.setText("SIPAHI");
					}
					Pod1.setClickable(false);
					Pod2.setClickable(false);
					Pod3.setClickable(false);
					Pod4.setClickable(false);
					updateScore();
				}
			});
		}	
		
		
		Log.v("AkhandBakar","#########" + Pod2.getText());
		if(Pod2.getText().equals("")){
			
			Pod2.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Log.v("AkhandBakar","#########" + player2);
					if(player2.equals("CHOR")){
					
						RajaMantri.guess = true;
						Pod2.setBackgroundResource(R.drawable.podopen);
						Pod2.setText("CHOR");
					}else{
						
						RajaMantri.guess = false;
						Pod2.setBackgroundResource(R.drawable.podopen);
						Pod2.setText("SIPAHI");
						
					}
					Pod1.setClickable(false);
					Pod2.setClickable(false);
					Pod3.setClickable(false);
					Pod4.setClickable(false);
					updateScore();
				}
			});
		}	
    	
		Log.v("AkhandBakar","#########" + Pod3.getText());
		if(Pod3.getText().equals("")){
			
			Pod3.setOnClickListener(new OnClickListener() {
				
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Log.v("AkhandBakar","#########" + player3);
					if(player3.equals("CHOR")){
					
						RajaMantri.guess = true;
						Pod3.setBackgroundResource(R.drawable.podopen);
						Pod3.setText("CHOR");
					}else{
						
						RajaMantri.guess = false;
						Pod3.setBackgroundResource(R.drawable.podopen);
						Pod3.setText("SIPAHI");
						
					}
					Pod1.setClickable(false);
					Pod2.setClickable(false);
					Pod3.setClickable(false);
					Pod4.setClickable(false);
					updateScore();
				}
			});
		}
    	
		
		Log.v("AkhandBakar","#########" + Pod4.getText());
		if(Pod4.getText().equals("")){
			
			Pod4.setOnClickListener(new OnClickListener() {
				
			
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Log.v("AkhandBakar","#########" + player4);
					if(player4.equals("CHOR")){
					
						RajaMantri.guess = true;
						Pod4.setBackgroundResource(R.drawable.podopen);
						Pod4.setText("CHOR");
					}else{
						
						RajaMantri.guess = false;
						Pod4.setBackgroundResource(R.drawable.podopen);
						Pod4.setText("SIPAHI");
						
					}
					Pod1.setClickable(false);
					Pod2.setClickable(false);
					Pod3.setClickable(false);
					Pod4.setClickable(false);
					updateScore();
				}
			});
		}
		
    }
    
    
    public void shuffle(){
    	
    	Play.setText("Guess");
			Play.setClickable(false);
			shuffleArray(solutionArray);
			txtTurn.setText(player1_name + "'s" + " turn!");
			nextTurn = player2_name;
			Pod1 = (Button)findViewById(R.id.Pod1);
			Pod1.setBackgroundResource(R.drawable.podtlclosed);
			Pod1.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
					player1 = solutionArray[0];
					Pod1.setText(player1);
					Pod1.setBackgroundResource(R.drawable.podopen);
					Pod2.setClickable(false);
					Pod3.setClickable(false);
					Pod4.setClickable(false);
					if(txtTurn.getText().equals(player1_name + "'s" + " turn!")){
						
						if(player1.equals("MANTRI")){
							
							player1_role = "MANTRI";
						}
						if(player1.equals("RAJA")){
							
							player1_role = "RAJA";
						}
						if(player1.equals("SIPAHI")){

							player1_role = "SIPAHI";
						}
						if(player1.equals("CHOR")){
							
							player1_role = "CHOR";
						}
				    	

						nextTurn = player2_name + "'s" + " turn!";
						
					}
					if(txtTurn.getText().equals(player2_name + "'s" + " turn!")){
						
						if(player1.equals("MANTRI")){
							
							player2_role = "MANTRI";
						}
						if(player1.equals("RAJA")){
							
							player2_role = "RAJA";
						}
						if(player1.equals("SIPAHI")){

							player2_role = "SIPAHI";
						}
						if(player1.equals("CHOR")){
							
							player2_role = "CHOR";
						}
				    	
						nextTurn = player3_name + "'s" + " turn!";
						
					}
					if(txtTurn.getText().equals(player3_name + "'s" + " turn!")){
						
						if(player1.equals("MANTRI")){
							
							player3_role = "MANTRI";
						}
						if(player1.equals("RAJA")){
							
							player3_role = "RAJA";
						}
						if(player1.equals("SIPAHI")){

							player3_role = "SIPAHI";
						}
						if(player1.equals("CHOR")){
							
							player3_role = "CHOR";
						}
				    	
						nextTurn = player4_name + "'s" + " turn!";
						
					}
					
					if(txtTurn.getText().equals(player4_name + "'s" + " turn!")){
						
						if(player1.equals("MANTRI")){
							
							player4_role = "MANTRI";
						}
						if(player1.equals("RAJA")){
							
							player4_role = "RAJA";
						}
						if(player1.equals("SIPAHI")){

							player4_role = "SIPAHI";
						}
						if(player1.equals("CHOR")){
							
							player4_role = "CHOR";
						}
				    	
						
						nextTurn = "Click on Guess!";
						
					}
					
					txtTurn.setText("Click again to close the chit!");
				
					
					
					Pod1.setOnClickListener(new OnClickListener() {
						
						public void onClick(View v) {
							// TODO Auto-generated method stub
							Pod1.setClickable(false);
							count++;
							Pod1.setText("");
							Pod1.setBackgroundResource(R.drawable.podtlhalf);
							txtTurn.setText(nextTurn);
							Pod2.setClickable(true);
							Pod3.setClickable(true);
							Pod4.setClickable(true);
							if(count == 4){
								
								txtTurn.setText("Click on Guess!");
								Play.setClickable(true);
								count = 0;
								
							}
						}
					});
				}
			});
			
			Pod2 = (Button)findViewById(R.id.Pod2);
			Pod2.setBackgroundResource(R.drawable.podtrclosed);
			Pod2.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub
						player2 = solutionArray[1];
						Pod2.setText(player2);
						Pod2.setBackgroundResource(R.drawable.podopen);
						Pod1.setClickable(false);
						Pod3.setClickable(false);
						Pod4.setClickable(false);
						if(txtTurn.getText().equals(player1_name + "'s" + " turn!")){
							
							if(player2.equals("MANTRI")){
								
								player1_role = "MANTRI";
							}
							if(player2.equals("RAJA")){
								
								player1_role = "RAJA";
							}
							if(player2.equals("SIPAHI")){

								player1_role = "SIPAHI";
							}
							if(player2.equals("CHOR")){
								
								player1_role = "CHOR";
							}
					    	
							nextTurn = player2_name+ "'s" + " turn!";
							
						}
						if(txtTurn.getText().equals(player2_name + "'s" + " turn!")){
							
							if(player2.equals("MANTRI")){
								
								player2_role = "MANTRI";
							}
							if(player2.equals("RAJA")){
								
								player2_role = "RAJA";
							}
							if(player2.equals("SIPAHI")){

								player2_role = "SIPAHI";
							}
							if(player2.equals("CHOR")){
								
								player2_role = "CHOR";
							}
					    	
							nextTurn = player3_name+ "'s" + " turn!";
							
						}
						if(txtTurn.getText().equals(player3_name + "'s" + " turn!")){
							
							if(player2.equals("MANTRI")){
								
								player3_role = "MANTRI";
							}
							if(player2.equals("RAJA")){
								
								player3_role = "RAJA";
							}
							if(player2.equals("SIPAHI")){

								player3_role = "SIPAHI";
							}
							if(player2.equals("CHOR")){
								
								player3_role = "CHOR";
							}
					    	
							nextTurn = player4_name+ "'s" + " turn!";
							
						}
						if(txtTurn.getText().equals(player4_name + "'s" + " turn!")){
							
							if(player2.equals("MANTRI")){
								
								player4_role = "MANTRI";
							}
							if(player2.equals("RAJA")){
								
								player4_role = "RAJA";
							}
							if(player2.equals("SIPAHI")){

								player4_role = "SIPAHI";
							}
							if(player2.equals("CHOR")){
								
								player4_role = "CHOR";
							}
					    	
							nextTurn = "Click on Guess!";
							
						}
						txtTurn.setText("Click again to close the chit!");
						Pod2.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Pod2.setClickable(false);
								count++;
								Pod2.setText("");
								Pod2.setBackgroundResource(R.drawable.podtrhalf);
								txtTurn.setText(nextTurn);
								Pod1.setClickable(true);
								Pod3.setClickable(true);
								Pod4.setClickable(true);
								if(count == 4){
									
									txtTurn.setText("Click on Guess!");
									Play.setClickable(true);
									count = 0;
									
								}
							}
						});
					}
				});
		        
		        
			Pod3 = (Button)findViewById(R.id.Pod3);
			Pod3.setBackgroundResource(R.drawable.podblclosed);
			Pod3.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub
						player3 = solutionArray[2];
						Pod3.setText(player3);
						Pod3.setBackgroundResource(R.drawable.podopen);

						Pod2.setClickable(false);
						Pod1.setClickable(false);
						Pod4.setClickable(false);
						if(txtTurn.getText().equals(player1_name + "'s" + " turn!")){
							
							if(player3.equals("MANTRI")){
								
								player1_role = "MANTRI";
							}
							if(player3.equals("RAJA")){
								
								player1_role = "RAJA";
							}
							if(player3.equals("SIPAHI")){

								player1_role = "SIPAHI";
							}
							if(player3.equals("CHOR")){
								
								player1_role = "CHOR";
							}
					    	
							nextTurn = player2_name+ "'s" + " turn!";
							
						}
						if(txtTurn.getText().equals(player2_name + "'s" + " turn!")){
							
							if(player3.equals("MANTRI")){
								
								player2_role = "MANTRI";
							}
							if(player3.equals("RAJA")){
								
								player2_role = "RAJA";
							}
							if(player3.equals("SIPAHI")){

								player2_role = "SIPAHI";
							}
							if(player3.equals("CHOR")){
								
								player2_role = "CHOR";
							}
					    	
							nextTurn = player3_name+ "'s" + " turn!";
							
						}
						if(txtTurn.getText().equals(player3_name + "'s" + " turn!")){
							
							if(player3.equals("MANTRI")){
								
								player3_role = "MANTRI";
							}
							if(player3.equals("RAJA")){
								
								player3_role = "RAJA";
							}
							if(player3.equals("SIPAHI")){

								player3_role = "SIPAHI";
							}
							if(player3.equals("CHOR")){
								
								player3_role = "CHOR";
							}
							nextTurn = player4_name+ "'s" + " turn!";
							
						}
						if(txtTurn.getText().equals(player4_name + "'s" + " turn!")){
							
							if(player3.equals("MANTRI")){
								
								player4_role = "MANTRI";
							}
							if(player3.equals("RAJA")){
								
								player4_role = "RAJA";
							}
							if(player3.equals("SIPAHI")){

								player4_role = "SIPAHI";
							}
							if(player3.equals("CHOR")){
								
								player4_role = "CHOR";
							}
							nextTurn = "Click on Guess!";
							
						}

						txtTurn.setText("Click again to close the chit!");
						Pod3.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Pod3.setClickable(false);
								count++;
								Pod3.setText("");
								Pod3.setBackgroundResource(R.drawable.podblhalf);
								txtTurn.setText(nextTurn);
								Pod2.setClickable(true);
								Pod1.setClickable(true);
								Pod4.setClickable(true);
								if(count == 4){
									
									txtTurn.setText("Click on Guess!");
									Play.setClickable(true);
									count = 0;
									
								}
							}
						});
					}
				});
		     
			
			Pod4 = (Button)findViewById(R.id.Pod4);
			Pod4.setBackgroundResource(R.drawable.podbrclosed);
			
			Pod4.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub
						player4 = solutionArray[3];
						Pod4.setText(player4);
						Pod4.setBackgroundResource(R.drawable.podopen);
						

						Pod2.setClickable(false);
						Pod3.setClickable(false);
						Pod1.setClickable(false);
						if(txtTurn.getText().equals(player1_name + "'s" + " turn!")){
							
							if(player4.equals("MANTRI")){
								
								player1_role = "MANTRI";
							}
							if(player4.equals("RAJA")){
								
								player1_role = "RAJA";
							}
							if(player4.equals("SIPAHI")){

								player1_role = "SIPAHI";
							}
							if(player4.equals("CHOR")){
								
								player1_role = "CHOR";
							}
							nextTurn = player2_name+ "'s" + " turn!";
							
						}
						if(txtTurn.getText().equals(player2_name + "'s" + " turn!")){
							
							if(player4.equals("MANTRI")){
								
								player2_role = "MANTRI";
							}
							if(player4.equals("RAJA")){
								
								player2_role = "RAJA";
							}
							if(player4.equals("SIPAHI")){

								player2_role = "SIPAHI";
							}
							if(player4.equals("CHOR")){
								
								player2_role = "CHOR";
							}
							nextTurn = player3_name+ "'s" + " turn!";
							
						}
						if(txtTurn.getText().equals(player3_name + "'s" + " turn!")){
							
							if(player4.equals("MANTRI")){
								
								player3_role = "MANTRI";
							}
							if(player4.equals("RAJA")){
								
								player3_role = "RAJA";
							}
							if(player4.equals("SIPAHI")){

								player3_role = "SIPAHI";
							}
							if(player4.equals("CHOR")){
								
								player3_role = "CHOR";
							}
							nextTurn = player4_name+ "'s" + " turn!";
							
						}
						if(txtTurn.getText().equals(player4_name + "'s" + " turn!")){
							
							if(player4.equals("MANTRI")){
								
								player4_role = "MANTRI";
							}
							if(player4.equals("RAJA")){
								
								player4_role = "RAJA";
							}
							if(player4.equals("SIPAHI")){

								player4_role = "SIPAHI";
							}
							if(player4.equals("CHOR")){
								
								player4_role = "CHOR";
							}
							nextTurn = "Click on Guess!";
							
						}
						
						txtTurn.setText("Click again to close the chit!");
						Pod4.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Pod4.setClickable(false);
								count++;
								Pod4.setText("");
								Pod4.setBackgroundResource(R.drawable.podbrhalf);
								txtTurn.setText(nextTurn);
								Pod2.setClickable(true);
								Pod3.setClickable(true);
								Pod1.setClickable(true);
								if(count == 4){
									
									txtTurn.setText(nextTurn);
									Play.setClickable(true);
									count = 0;
									
								}
							}
						});
					}
				});    
			
			Pod1.setText("");
			Pod2.setText("");
			Pod3.setText("");
			Pod4.setText("");
    	
    	
    }
    
   //assigning role to player
    public void setRole(String role, String player){
    	
    	if(player1.equals("MANTRI")){
			
			player4_role = "MANTRI";
		}
		if(player1.equals("RAJA")){
			
			player4_role = "RAJA";
		}
		if(player1.equals("SIPAHI")){

			player4_role = "SIPAHI";
		}
		if(player1.equals("CHOR")){
			
			player4_role = "CHOR";
		}
    	
    	
    } 
    
    void shuffleArray(String[] solutionArray)
    {
    	Random rnd = new Random();
    	for (int i = solutionArray.length - 1; i >= 0; i--)
    		{
    			int index = rnd.nextInt(i + 1);
  
    			String a = solutionArray[index];
    			solutionArray[index] = solutionArray[i];
    			solutionArray[i] = a;
    		}
	}
    //method for score calculation and assignment
    static void updateScore(){
    	
    	Log.v("AkhandBakar", "##########"+ guess);
    	if(player1_role.equals("MANTRI"))
    	{
    		Log.v("AkhandBakar", "##########Mantri"+ player1_name);
    	if(guess)
    		{
    		i = i+80;
    		p1score=i;
    		txtTurn.setText(player1_name+" is right!");
    		Pod1.setText(player1);
			Pod2.setText(player2);
			Pod3.setText(player3);
			Pod4.setText(player4);
			Pod1.setBackgroundResource(R.drawable.podopen);
			Pod2.setBackgroundResource(R.drawable.podopen);
			Pod3.setBackgroundResource(R.drawable.podopen);
			Pod4.setBackgroundResource(R.drawable.podopen);
    		if(player2_role.equals("CHOR"))
    			{
    			p2score=j;
    			if(player3_role.equals("RAJA")){
    				
    				k = k+100;
    				l = l+50;
    				p3score=k;
    				p4score=l;
    			}else{
    				
    				l = l+100;
    				k = k+50;
    				p4score=l;
    				p3score=k;
    			}
    			}
    		if(player3_role.equals("CHOR"))
    			{
    			
    			p3score=k;
    			
    			
    			if(player2_role.equals("RAJA")){
    				
    				j = j+100;
    				l = l+50;
    				p2score=j;
    				p4score=l;
    			}else{
    				
    				l = l+100;
    				j = j+50;
    				p4score=l;
    				p2score=j;
    			}
    			}
    		if(player4_role.equals("CHOR"))
    			{
    			
    			p4score=l;
    			
    			if(player3_role.equals("RAJA")){
    				
    				k = k+100;
    				j = j+50;
    				p2score=j;
    				p3score=k;
    			}else{
    				
    				j = j+100;
    				k = k+50;
    				p3score=k;
    				p2score=j;
    			}
    			}
    		}
    	else
    		{
    		i=i-80;
    		p1score = i;
    		txtTurn.setText(player1_name+" is wrong!");
    		Pod1.setText(player1);
			Pod2.setText(player2);
			Pod3.setText(player3);
			Pod4.setText(player4);
			Pod1.setBackgroundResource(R.drawable.podopen);
			Pod2.setBackgroundResource(R.drawable.podopen);
			Pod3.setBackgroundResource(R.drawable.podopen);
			Pod4.setBackgroundResource(R.drawable.podopen);
			if(player2_role.equals("CHOR"))
			{
				j = j+25;
			p2score=j;
			if(player3_role.equals("RAJA")){
				
				k = k+100;
				l = l+50;
				p3score=k;
				p4score=l;
			}else{
				
				l = l+100;
				k = k+50;
				p4score=l;
				p3score=k;
			}
			}
		if(player3_role.equals("CHOR"))
			{
			k=k+25;
			p3score=k;
			
			
			if(player2_role.equals("RAJA")){
				
				j = j+100;
				l = l+50;
				p2score=j;
				p4score=l;
			}else{
				
				l = l+100;
				j = j+50;
				p4score=l;
				p2score=j;
			}
			}
		if(player4_role.equals("CHOR"))
			{
			l=l+25;
			p4score=l;
			
			if(player3_role.equals("RAJA")){
				
				k = k+100;
				j = j+50;
				p2score=j;
				p3score=k;
			}else{
				
				j = j+100;
				k = k+50;
				p3score=k;
				p2score=j;
			}
			}
    		}

    	}
    if(player2_role.equals("MANTRI"))
    	{
    	if(guess)
    		{
    		Log.v("AkhandBakar", "##########Mantri"+ player2_name);
    		j = j+80;
    		p2score=j;
    		txtTurn.setText(player2_name+" is right!");
    		Pod1.setText(player1);
			Pod2.setText(player2);
			Pod3.setText(player3);
			Pod4.setText(player4);
			Pod1.setBackgroundResource(R.drawable.podopen);
			Pod2.setBackgroundResource(R.drawable.podopen);
			Pod3.setBackgroundResource(R.drawable.podopen);
			Pod4.setBackgroundResource(R.drawable.podopen);
    		if(player1_role.equals("CHOR"))
    			{
    			p1score=i;
    			
    			if(player3_role.equals("RAJA")){
    			
    				k = k+100;
    				l = l+50;
    				p3score=k;
    				p4score=l;
    			
    			}else{
    				
    				l = l+100;
    				k = k+50;
    				p4score=l;
    				p3score=k;
    			}
    			
    			}
    		if(player3_role.equals("CHOR"))
    			{
    			
    			p3score=k;
    			
    			
    			if(player1_role.equals("RAJA")){
    				
    				i = i+100;
    				l = l+50;
    				p1score=i;
    				p4score=l;
    				
    			}else{
    				
    				l = l+100;
    				i = i+50;
    				p1score=i;
    				p4score=l;
    				
    			}
    			
    			}
    		if(player4_role.equals("CHOR"))
    			{
    			
    			p4score=l;
    			
    			if(player1_role.equals("RAJA")){
    				
    				i = i+100;
    				k = k+50;
    				p1score=i;
        			p3score=k;
    				
    			}else{
    				
    				k = k+100;
    				i = i+50;
    				p1score=i;
        			p3score=k;
    			
    			
    			}
    			
    			
    			}
    		}
    	else
    		{
    		 
    		j=j-80;
    		p2score = j;
    		txtTurn.setText(player2_name+" is wrong!");
    		Pod1.setText(player1);
			Pod2.setText(player2);
			Pod3.setText(player3);
			Pod4.setText(player4);
			Pod1.setBackgroundResource(R.drawable.podopen);
			Pod2.setBackgroundResource(R.drawable.podopen);
			Pod3.setBackgroundResource(R.drawable.podopen);
			Pod4.setBackgroundResource(R.drawable.podopen);
			if(player1_role.equals("CHOR"))
			{
				i = i+25;
			p1score=i;
			
			if(player3_role.equals("RAJA")){
			
				k = k+100;
				l = l+50;
				p3score=k;
				p4score=l;
			
			}else{
				
				l = l+100;
				k = k+50;
				p4score=l;
				p3score=k;
			}
			
			}
		if(player3_role.equals("CHOR"))
			{
			k = k+25;
			p3score=k;
			
			
			if(player1_role.equals("RAJA")){
				
				i = i+100;
				l = l+50;
				p1score=i;
				p4score=l;
				
			}else{
				
				l = l+100;
				i = i+50;
				p1score=i;
				p4score=l;
				
			}
			
			}
		if(player4_role.equals("CHOR"))
			{
			l = l+25;
			p4score=l;
			
			if(player1_role.equals("RAJA")){
				
				i = i+100;
				k = k+50;
				p1score=i;
    			p3score=k;
				
			}else{
				
				k = k+100;
				i = i+50;
				p1score=i;
    			p3score=k;
			
			
			}
			
			
			}
    		}

    	}
    if(player3_role.equals("MANTRI"))
    	{
    	Log.v("AkhandBakar", "##########Mantri"+ player3_name);
    	if(guess)
    		{
    		k = k+80;
    		p3score = k;
    		txtTurn.setText(player3_name+" is right!");
    		Pod1.setText(player1);
			Pod2.setText(player2);
			Pod3.setText(player3);
			Pod4.setText(player4);
			Pod1.setBackgroundResource(R.drawable.podopen);
			Pod2.setBackgroundResource(R.drawable.podopen);
			Pod3.setBackgroundResource(R.drawable.podopen);
			Pod4.setBackgroundResource(R.drawable.podopen);
    		if(player1_role.equals("CHOR"))
    			{
    			p1score=i;
    			
    			if(player2_role.equals("RAJA")){
    				
    				j = j+100;
    				l = l+50;
    				p2score=j;
        			p4score=l;
        			
    				
    			}else{
    				
    				l = l+100;
    				j = j+50;
    				p2score=j;
        			p4score=l;
    				
    				
    			}
    			
    			}
    		if(player2_role.equals("CHOR"))
    			{
    			
    			p2score=j;
    			
    			
    			if(player1_role.equals("RAJA")){
    				
    				i = i+100;
    				l = l+50;
    				p1score=i;
    				p4score=l;
    				
    			}else{
    				
    				i = i+50;
    				l = l+100;
    				p1score=i;
    				p4score=l;
    				
    			}
    			
    			}
    		if(player4_role.equals("CHOR"))
    			{
    			
    			p4score=l;
    			
    			if(player2_role.equals("RAJA")){
    				
    				j = j+100;
    				i = i+50;
    				p1score=i;
        			p2score=j;
    				
    			}else{
    				
    				j = j+50;
    				i = i+100;
    				p1score=i;
        			p2score=j;
    				
    			}
    			
    			
    			}
    		}
    	else
    		{
    		k = k-80;
    		p3score = k;
    		txtTurn.setText(player3_name+" is wrong!");
    		Pod1.setText(player1);
			Pod2.setText(player2);
			Pod3.setText(player3);
			Pod4.setText(player4);
			Pod1.setBackgroundResource(R.drawable.podopen);
			Pod2.setBackgroundResource(R.drawable.podopen);
			Pod3.setBackgroundResource(R.drawable.podopen);
			Pod4.setBackgroundResource(R.drawable.podopen);
			if(player1_role.equals("CHOR"))
			{
				i = i+25;
			p1score=i;
			
			if(player2_role.equals("RAJA")){
				
				j = j+100;
				l = l+50;
				p2score=j;
    			p4score=l;
    			
				
			}else{
				
				l = l+100;
				j = j+50;
				p2score=j;
    			p4score=l;
				
				
			}
			
			}
		if(player2_role.equals("CHOR"))
			{
			j = j+25;
			p2score=j;
			
			
			if(player1_role.equals("RAJA")){
				
				i = i+100;
				l = l+50;
				p1score=i;
				p4score=l;
				
			}else{
				
				i = i+50;
				l = l+100;
				p1score=i;
				p4score=l;
				
			}
			
			}
		if(player4_role.equals("CHOR"))
			{
			l = l+25;
			p4score=l;
			
			if(player2_role.equals("RAJA")){
				
				j = j+100;
				i = i+50;
				p1score=i;
    			p2score=j;
				
			}else{
				
				j = j+50;
				i = i+100;
				p1score=i;
    			p2score=j;
				
			}
			
			
			}
    		}

    	}
    if(player4_role.equals("MANTRI"))
    	{
    	Log.v("AkhandBakar", "##########Mantri"+ player4_name);
    	if(guess)
    		{
    		l = l+80;
    		p4score=l;
    		txtTurn.setText(player4_name+" is right!");
    		Pod1.setText(player1);
			Pod2.setText(player2);
			Pod3.setText(player3);
			Pod4.setText(player4);
			Pod1.setBackgroundResource(R.drawable.podopen);
			Pod2.setBackgroundResource(R.drawable.podopen);
			Pod3.setBackgroundResource(R.drawable.podopen);
			Pod4.setBackgroundResource(R.drawable.podopen);
    		if(player1_role.equals("CHOR"))
    			{
    			p1score=i;
    			
    			
    			if(player2_role.equals("RAJA")){
    				
    				j = j+100;
    				k = k+50;
    				p2score=j;
        			p3score=k;
    				
    			}else{
    				
    				j = j+50;
    				k = k+100;
    				p2score=j;
        			p3score=k;
    				
    			}
    			}
    		if(player2_role.equals("CHOR"))
    			{
    			
    			p2score=j;
    			
    			
    			if(player1_role.equals("RAJA")){
    				
    				i = i+100;
    				k = k+50;
    				p1score=i;
    				p3score=k;
    			}else{
    				
    				i = i+50;
    				k = k+100;
    				p1score=i;
    				p3score=k;
    				
    			}
    			
    			}
    		if(player3_role.equals("CHOR"))
    			{
    			
    			p3score=k;
    			
    			if(player1_role.equals("RAJA")){
    				
    				i = i+100;
    				j = j+50;
    				p1score=i;
        			p2score=j;
    			}else{
    				
    				i = i+50;
    				j = j+100;
    				p1score=i;
        			p2score=j;
    			    }
    			}
    		}
    	else
    		{
    		l = l-80;
    		p4score = l;
    		txtTurn.setText(player4_name+" is wrong!");
    		Pod1.setText(player1);
			Pod2.setText(player2);
			Pod3.setText(player3);
			Pod4.setText(player4);
			Pod1.setBackgroundResource(R.drawable.podopen);
			Pod2.setBackgroundResource(R.drawable.podopen);
			Pod3.setBackgroundResource(R.drawable.podopen);
			Pod4.setBackgroundResource(R.drawable.podopen);
			if(player1_role.equals("CHOR"))
			{
				i = i+25;
			p1score=i;
			
			
			if(player2_role.equals("RAJA")){
				
				j = j+100;
				k = k+50;
				p2score=j;
    			p3score=k;
				
			}else{
				
				j = j+50;
				k = k+100;
				p2score=j;
    			p3score=k;
				
			}
			}
		if(player2_role.equals("CHOR"))
			{
			j=j+25;
			p2score=j;
			
			
			if(player1_role.equals("RAJA")){
				
				i = i+100;
				k = k+50;
				p1score=i;
				p3score=k;
			}else{
				
				i = i+50;
				k = k+100;
				p1score=i;
				p3score=k;
				
			}
			
			}
		if(player3_role.equals("CHOR"))
			{
			k=k+25;
			p3score=k;
			
			if(player1_role.equals("RAJA")){
				
				i = i+100;
				j = j+50;
				p1score=i;
    			p2score=j;
			}else{
				
				i = i+50;
				j = j+100;
				p1score=i;
    			p2score=j;
				
			}
			
			
			}
    		}

    	}
    	
    
    Log.v("AkhandBakar", "##########Score "+ i);
	txtPlayer1.setText("1."+ player1_name + " [" + i + "]");
	Log.v("AkhandBakar", player1 + " [" + i + "]");
	
	txtPlayer2.setText("2." + player2_name+ " [" + j + "]");
	
	Log.v("AkhandBakar", player2 + " [" + p2score + "]");
	
	txtPlayer3.setText("3." + player3_name+ " [" + k + "]");
	Log.v("AkhandBakar", player3 + " [" + p3score + "]");
	
	txtPlayer4.setText("4."+player4_name+ " [" + l + "]");	
	Log.v("AkhandBakar", player4 + " [" + p4score + "]");
    }
}
