/**
 * 
 */
NoofQuestions =20;
Questions = Array(NoofQuestions);
Answers = new Array(NoofQuestions);
Choosed = false;
 
 for (var i=0; i < NoofQuestions; i++)
{
	Answers[i] =new Array(4);
}
CorrectAnswer = new Array(NoofQuestions);

Questionno=0;
Score=0;
OptionChossed =0;
Answer=0;

function AnswerChoosed(Ans){                                // get the value from html
	Answer=Ans;
	Choosed = true;                                            //radio button chossed
}
function load(){
	loadQuestion();
}

function loadQuestion(){
	document.getElementById("Question").innerHTML = "(" +(Questionno + 1) +") : " + Questions[Questionno];
	document.getElementById("Option0").innerHTML ="(i)" +  Answers[Questionno][0];               
	document.getElementById("Option1").innerHTML ="(ii)" +  Answers[Questionno][1];                
	document.getElementById("Option2").innerHTML ="(iii)" +  Answers[Questionno][2];
	document.getElementById("Option3").innerHTML ="(iv)" +  Answers[Questionno][3];
	document.getElementById("Optn1").checked = false;
	document.getElementById("Optn2").checked = false;
	document.getElementById("Optn3").checked = false;
	document.getElementById("Optn4").checked = false;
	Answer = 0;	
} 

function NextQuestion(){
	
	if(Answer == CorrectAnswer[Questionno]){
		Score++;
	}
	if(Choosed){
		if(Questionno < NoofQuestions - 1){
			Questionno++;
			loadQuestion();
		} 
		else
		{
			 alert("End of exam\n" + "Score is : " +Score+"")
		}
		Choosed = false;
		
	}else
	{
		alert("No answer selected")
	}
}


Questions[0]= "HTML stands for?";
Answers[0][0] = "Hyper Text Markup Language";                             //1..
Answers[0][1] = "High Text Markup Language";
Answers[0][2] = "Hyper Tabular Markup Language";
Answers[0][3] = "None of these";
CorrectAnswer[0] = 1;

Questions[1]= " Which of the following tag is used to mark a begining of paragraph ?";
Answers[1][0] = "TD";
Answers[1][1] = "br";
Answers[1][2] = "P";
Answers[1][3] = "TR";
CorrectAnswer[1] = 3;

Questions[2]= "Correct HTML tag for the largest heading is?";
Answers[2][0] = "head";
Answers[2][1] = "h6";
Answers[2][2] = "heading";
Answers[2][3] = "h1";
CorrectAnswer[2] = 4;


Questions[3]= "Web pages starts with which ofthe following tag??";
Answers[3][0] = "Body";
Answers[3][1] = "Title";
Answers[3][2] = "HTML";
Answers[3][3] = "Form";
CorrectAnswer[3] = 3;

Questions[4]= "Which of the following is a container?";
Answers[4][0] = "Body";
Answers[4][1] = "SELECT";
Answers[4][2] = "INPUT";
Answers[4][3] = "Both (a) and (b)";
CorrectAnswer[4] = 4;

Questions[5]= "INPUT is";
Answers[5][0] = "format tag";                             //1..
Answers[5][1] = "empty tag";
Answers[5][2] = "both a and b";
Answers[5][3] = "None of these";
CorrectAnswer[5] = 2;

Questions[6]= " Main container for TR, TD and TH is?";
Answers[6][0] = "Table";
Answers[6][1] = "Group";
Answers[6][2] = "Data";
Answers[6][3] = "All of these";
CorrectAnswer[6] = 1;

Questions[7]= "The body tag usually used after?";
Answers[7][0] = "title tag";
Answers[7][1] = "head tag";
Answers[7][2] = "EM tag";
Answers[7][3] = "Form tag";
CorrectAnswer[7] = 2;


Questions[8]= "Symbol used at the beginning of the HREF text is?";
Answers[8][0] = "#";
Answers[8][1] = "$";
Answers[8][2] = "&";
Answers[8][3] = "^";
CorrectAnswer[8] = 1;

Questions[9]= "What tag is used to display a picture in a HTML page?";
Answers[9][0] = "picture";
Answers[9][1] = "image";
Answers[9][2] = "img";
Answers[9][3] = "src";
CorrectAnswer[9] = 3;

Questions[10]= " Inside which HTML element do we put the JavaScript?";
Answers[10][0] = "script";
Answers[10][1] = "head";
Answers[10][2] = "meta";
Answers[10][3] = "style";
CorrectAnswer[10] = 1;

Questions[11]= "What are the types of Pop up boxes available in JavaScript?";
Answers[11][0] = "alert";
Answers[11][1] = "prompt";
Answers[11][2] = "confirm";
Answers[11][3] = "all of the above";
CorrectAnswer[11] = 1;

Questions[12]= "Javascript is _________ language.";
Answers[12][0] = "scripting";
Answers[12][1] = "programming";
Answers[12][2] = "application";
Answers[12][3] = "none of the above";
CorrectAnswer[12] = 1;

Questions[13]= "JavaScript Code is written inside file having extension ?";
Answers[13][0] = ".javascript";
Answers[13][1] = ".jsp";
Answers[13][2] = ".js";
Answers[13][3] = "none of the above";
CorrectAnswer[13] = 3;

Questions[14]= "JavaScript Statements are executed by?";
Answers[14][0] = "jvm";
Answers[14][1] = "compiler";
Answers[14][2] = "server";
Answers[14][3] = "browser";
CorrectAnswer[14] = 4;

Questions[15]= "Java Statement terminated by?";
Answers[15][0] = "cooma";
Answers[15][1] = "semicolon";
Answers[15][2] = "slash";
Answers[15][3] = "fullstop";
CorrectAnswer[15] = 2;

Questions[16]= "If we want define style for an unique element, then which css selector will we use ?";
Answers[16][0] = "id";
Answers[16][1] = "class";
Answers[16][2] = "text";
Answers[16][3] = "name";
CorrectAnswer[16] = 1;

Questions[17]= "What should be the first tag in any HTML document?";
Answers[17][0] = "head";
Answers[17][1] = "html";
Answers[17][2] = "title";
Answers[17][3] = "document";
CorrectAnswer[17] = 2;


Questions[18]= "HTML tags are surrounded by which type of brackets.";
Answers[18][0] = "curly";
Answers[18][1] = "square";
Answers[18][2] = "angle";
Answers[18][3] = "round";
CorrectAnswer[18] = 3;

Questions[19]= "JavaScript is designed for following purpose ?";
Answers[19][0] = "To Perform Server Side Scripting Opertion";
Answers[19][1] = "To Style HTML Pages";
Answers[19][2] = "To add interactivity to HTML Pages.";
Answers[19][3] = "none of the above";
CorrectAnswer[19] = 3;