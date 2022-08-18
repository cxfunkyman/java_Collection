

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.shape.Line; 
import javafx.scene.shape.Circle; 
import javafx.stage.Stage;  

public class DrawingLine extends Application{

	public static float translateX(float x){
		return(x+10.f);
	} 

   @Override 
   public void start(Stage stage) { 
      //Creating a line object 
      Line line = new Line(); 
		Circle circle = new Circle(); 
         
      //Creating a Group 
      Group root = new Group(); 

	root.getChildren().addAll(line,circle);
         
      //Creating a Scene 
      Scene scene = new Scene(root, 600, 300); 
         
      //Setting title to the scene 
      stage.setTitle("Sample application"); 
         
      //Adding the scene to the stage 
      stage.setScene(scene); 

      //Setting the properties to a line 
      line.setStartX(300.0); 
      line.setStartY(150.0); 
      line.setEndX(translateX(350.f)); 
      line.setEndY(150-50.0); 

	for(int i=-5; i< 6; i++){
  	    Line vline = new Line(); 
     	    vline.setStartX(300.0+i*50); 
 	    vline.setStartY(200.0); 
	    vline.setEndX(300.0+i*50); 
  	    vline.setEndY(50.0);
	    root.getChildren().add(vline); 
}
         

//Exercise: draw the horizontal grid lines as well

      circle.setCenterX(300.0f); 
      circle.setCenterY(135.0f); 
      circle.setRadius(10.0f); 
  
       
      //Displaying the contents of a scene 
      stage.show(); 
   }      
   public static void main(String args[]){ 
      launch(args); 
   } 
} 