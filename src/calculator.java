import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class calculator implements ActionListener{

//%%% Icons %%%
JPanel iconPanel = new JPanel();
JLabel iconLabel = new JLabel();

java.net.URL cubeURL = getClass().getResource("cube.png");
ImageIcon cube = new ImageIcon(cubeURL);
java.net.URL sphereURL = getClass().getResource("sphere.png");
ImageIcon sphere = new ImageIcon(sphereURL);
java.net.URL circleURL = getClass().getResource("circle.png");
ImageIcon circle = new ImageIcon(circleURL);
java.net.URL lengthURL = getClass().getResource("length.png");
ImageIcon length = new ImageIcon(lengthURL);
java.net.URL weightURL = getClass().getResource("weight.png");
ImageIcon weight = new ImageIcon(weightURL);
java.net.URL squareURL = getClass().getResource("square.png");
ImageIcon square = new ImageIcon(squareURL);
java.net.URL temperatureURL = getClass().getResource("temperature.png");
ImageIcon temperature = new ImageIcon(temperatureURL);
java.net.URL volumeURL = getClass().getResource("volume.png");
ImageIcon volume = new ImageIcon(volumeURL);
java.net.URL areaURL = getClass().getResource("area.png");
ImageIcon area = new ImageIcon(areaURL);
java.net.URL speedURL = getClass().getResource("speed.png");
ImageIcon speed = new ImageIcon(speedURL);
java.net.URL accelerationURL = getClass().getResource("acceleration.png");
ImageIcon acceleration = new ImageIcon(accelerationURL);
java.net.URL formatURL = getClass().getResource("format.png");
ImageIcon format = new ImageIcon(formatURL);
java.net.URL densityURL = getClass().getResource("density.png");
ImageIcon density = new ImageIcon(densityURL);
java.net.URL angleURL = getClass().getResource("angle.png");
ImageIcon angle = new ImageIcon(angleURL);
java.net.URL numberURL = getClass().getResource("number.png");
ImageIcon number = new ImageIcon(numberURL);
java.net.URL dataURL = getClass().getResource("data.png");
ImageIcon data = new ImageIcon(dataURL);
java.net.URL pixelURL = getClass().getResource("pixel.png");
ImageIcon pixel = new ImageIcon(pixelURL);
java.net.URL triangle_scaleneURL = getClass().getResource("triangle_scalene.png");
ImageIcon triangle_scalene = new ImageIcon(triangle_scaleneURL);
java.net.URL triangle_rightURL = getClass().getResource("triangle_right.png");
ImageIcon triangle_right = new ImageIcon(triangle_rightURL);


//%%% Notes %%%
JPanel notePanel1 = new JPanel();
JTextArea noteBox1 = new JTextArea(30, 24);
JScrollPane scrollablenoteBox1 = new JScrollPane(noteBox1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

JPanel notePanel2 = new JPanel();
JTextArea noteBox2 = new JTextArea(30, 24);
JScrollPane scrollablenoteBox2 = new JScrollPane(noteBox2, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

JPanel notePanel3 = new JPanel();
JTextArea noteBox3 = new JTextArea(30, 24);
JScrollPane scrollablenoteBox3 = new JScrollPane(noteBox3, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

JPanel notePanel4 = new JPanel();
JTextArea noteBox4 = new JTextArea(30, 24);
JScrollPane scrollablenoteBox4 = new JScrollPane(noteBox4, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

JPanel notePanel5 = new JPanel();
JTextArea noteBox5 = new JTextArea(30, 24);
JScrollPane scrollablenoteBox5 = new JScrollPane(noteBox5, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


//%%% Other %%%
JFrame frame = new JFrame();
Locale locale = new Locale("en", "UK");
DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(locale);


//%%% Selection %%%
JPanel selectionPanel = new JPanel();

JButton selectConvert = new JButton("Convert");
JPanel choosePanelConvert = new JPanel();

JButton select2D = new JButton("2D");
JPanel choosePanel2D= new JPanel();

JButton select3D = new JButton("3D");
JPanel choosePanel3D= new JPanel();

JButton choose3DSphere = new JButton("Sphere");
JButton choose3DCube = new JButton("Cube");

JButton choose2DSquare = new JButton("Square");
JButton choose2DCircle = new JButton("Circle");
JButton choose2DTriangle = new JButton("Triangle");

JPanel choosePanelTriangle = new JPanel();

JButton chooseTriangleAcute = new JButton("Acute");
JButton chooseTriangleEquilateral= new JButton("Equilateral");
JButton chooseTriangleIsosceles = new JButton("Isosceles");
JButton chooseTriangleObtuse = new JButton("Obtuse");
JButton chooseTriangleRight = new JButton("Right");
JButton chooseTriangleScalene = new JButton("Scalene");

JButton selectNotebox = new JButton("Notebox");
JPanel choosePanelNotebox = new JPanel();

JButton chooseNotebox1 = new JButton("Notebox 1");
JButton chooseNotebox2 = new JButton("Notebox 2");
JButton chooseNotebox3 = new JButton("Notebox 3");
JButton chooseNotebox4 = new JButton("Notebox 4");
JButton chooseNotebox5 = new JButton("Notebox 5");

JButton selectFormat = new JButton("Format");

JButton chooseConvertMetricImperial = new JButton("Length");
JButton chooseConvertTemperature = new JButton("Temperature");
JButton chooseConvertWeight = new JButton("Weight");
JButton chooseConvertVolume = new JButton("Volume");
JButton chooseConvertArea = new JButton("Area");
JButton chooseConvertSpeed = new JButton("Speed");
JButton chooseConvertAcceleration = new JButton("Acceleration");
JButton chooseConvertDensity = new JButton("Density");
JButton chooseConvertAngle = new JButton("Angle");
JButton chooseConvertNumber = new JButton("Number");
JButton chooseConvertData = new JButton("Data");
JButton chooseConvertPixel = new JButton("Pixel");


//&&& Triangle scalene &&&
JPanel panelTriangle1a = new JPanel();
JLabel labelTriangle1a = new JLabel("(a) Side 1:");

JPanel panelTriangle2a = new JPanel();
JLabel labelTriangle2a = new JLabel("(b) Side 2:");

JPanel panelTriangle3a = new JPanel();
JLabel labelTriangle3a = new JLabel("(c) Side 3:");

JPanel panelTriangle4a = new JPanel();
JTextField textFieldTriangle4a = new JTextField(11);
String stringTriangle4a; 
double doubleTriangle4a;

JPanel panelTriangle5a = new JPanel();
JTextField textFieldTriangle5a = new JTextField(11);
String stringTriangle5a;
double doubleTriangle5a;

JPanel panelTriangle6a = new JPanel();
JTextField textFieldTriangle6a = new JTextField(11);
String stringTriangle6a;
double doubleTriangle6a;

JPanel panelTriangle7a = new JPanel();
JButton buttonTriangle7a = new JButton("Side?");

JPanel panelTriangle8a = new JPanel();
JButton buttonTriangle8a = new JButton("Side?");

JPanel panelTriangle9a = new JPanel();
JButton buttonTriangle9a = new JButton("Side?");

JPanel panelTriangle10a = new JPanel();
JLabel labelTriangle10a = new JLabel("(α) Angle 1:");

JPanel panelTriangle11a = new JPanel();
JLabel labelTriangle11a = new JLabel("(β) Angle 2:");

JPanel panelTriangle12a = new JPanel();
JLabel labelTriangle12a = new JLabel("(γ) Angle 3:");

JPanel panelTriangle13a = new JPanel();
JTextField textFieldTriangle13a = new JTextField(11);
String stringTriangle13a;
double doubleTriangle13a;

JPanel panelTriangle14a = new JPanel();
JTextField textFieldTriangle14a = new JTextField(11);
String stringTriangle14a;
double doubleTriangle14a;

JPanel panelTriangle15a = new JPanel();
JTextField textFieldTriangle15a = new JTextField(11);
String stringTriangle15a;
double doubleTriangle15a;

JPanel panelTriangle16a = new JPanel();
JButton buttonTriangle16a = new JButton("Angle?");

JPanel panelTriangle17a = new JPanel();
JButton buttonTriangle17a = new JButton("Angle?");

JPanel panelTriangle18a = new JPanel();
JButton buttonTriangle18a = new JButton("Angle?");

JPanel panelTriangle19a = new JPanel();
JLabel labelTriangle19a = new JLabel("(ha) Height 1:");

JPanel panelTriangle20a = new JPanel();
JLabel labelTriangle20a = new JLabel("(hb) Height 2:");

JPanel panelTriangle21a = new JPanel();
JLabel labelTriangle21a = new JLabel("(hc) Height 3:");

JPanel panelTriangle22a = new JPanel();
JTextField textFieldTriangle22a = new JTextField(11);
String stringTriangle22a;
double doubleTriangle22a;

JPanel panelTriangle23a = new JPanel();
JTextField textFieldTriangle23a = new JTextField(11);
String stringTriangle23a;
double doubleTriangle23a;

JPanel panelTriangle24a = new JPanel();
JTextField textFieldTriangle24a = new JTextField(11);
String stringTriangle24a;
double doubleTriangle24a;

JPanel panelTriangle25a = new JPanel();
JButton buttonTriangle25a = new JButton("Height?");

JPanel panelTriangle26a = new JPanel();
JButton buttonTriangle26a = new JButton("Height?");

JPanel panelTriangle27a = new JPanel();
JButton buttonTriangle27a = new JButton("Height?");

JPanel panelTriangle28a = new JPanel();
JLabel labelTriangle28a = new JLabel("(A) Area (²):");

JPanel panelTriangle31a = new JPanel();
JTextField textFieldTriangle31a = new JTextField(11);
String stringTriangle31a;
double doubleTriangle31a;

JPanel panelTriangle34a = new JPanel();
JButton buttonTriangle34a = new JButton("Area?");

//&&& Cube &&&
JPanel panelCube1a = new JPanel();
JLabel labelCube1a = new JLabel("(a) Side:");

JPanel panelCube2a = new JPanel();
JLabel labelCube2a = new JLabel("(d) Diagonal:");

JPanel panelCube3a = new JPanel();
JTextField textFieldCube3a = new JTextField(11);
String stringCube3a; 
double doubleCube3a;

JPanel panelCube4a = new JPanel();
JTextField textFieldCube4a = new JTextField(11);
String stringCube4a;
double doubleCube4a;

JPanel panelCube5a = new JPanel();
JButton buttonCube5a = new JButton("Side to?");

JPanel panelCube6a = new JPanel();
JButton buttonCube6a = new JButton("Diagonal to?");

JPanel panelCube7a = new JPanel();
JLabel labelCube7a = new JLabel("(A) Area (²):");

JPanel panelCube8a = new JPanel();
JLabel labelCube8a = new JLabel("(V) Volume (³):");

JPanel panelCube9a = new JPanel();
JTextField textFieldCube9a = new JTextField(11);
String stringCube9a;
double doubleCube9a;

JPanel panelCube10a = new JPanel();
JTextField textFieldCube10a = new JTextField(11);
String stringCube10a;
double doubleCube10a;

JPanel panelCube11a = new JPanel();
JButton buttonCube11a = new JButton("Area to?");

JPanel panelCube12a = new JPanel();
JButton buttonCube12a = new JButton("Volume to?");

//&&& Sphere &&&
JPanel panelSphere1a = new JPanel();
JLabel labelSphere1a = new JLabel("(r) Radius:");

JPanel panelSphere2a = new JPanel();
JLabel labelSphere2a = new JLabel("(C) Circumference:");

JPanel panelSphere3a = new JPanel();
JTextField textFieldSphere3a = new JTextField(11);
String stringSphere3a; 
double doubleSphere3a;

JPanel panelSphere4a = new JPanel();
JTextField textFieldSphere4a = new JTextField(11);
String stringSphere4a;
double doubleSphere4a;

JPanel panelSphere5a = new JPanel();
JButton buttonSphere5a = new JButton("Radius to?");

JPanel panelSphere6a = new JPanel();
JButton buttonSphere6a = new JButton("Circumference to?");

JPanel panelSphere7a = new JPanel();
JLabel labelSphere7a = new JLabel("(A) Area (²):");

JPanel panelSphere8a = new JPanel();
JLabel labelSphere8a = new JLabel("(V) Volume (³):");

JPanel panelSphere9a = new JPanel();
JTextField textFieldSphere9a = new JTextField(11);
String stringSphere9a;
double doubleSphere9a;

JPanel panelSphere10a = new JPanel();
JTextField textFieldSphere10a = new JTextField(11);
String stringSphere10a;
double doubleSphere10a;

JPanel panelSphere11a = new JPanel();
JButton buttonSphere11a = new JButton("Area to?");

JPanel panelSphere12a = new JPanel();
JButton buttonSphere12a = new JButton("Volume to?");



//&&& Square &&&
JPanel panelSquare1a = new JPanel();
JLabel labelSquare1a = new JLabel("(a) Side:");

JPanel panelSquare2a = new JPanel();
JLabel labelSquare2a = new JLabel("(A) Area (²):");

JPanel panelSquare3a = new JPanel();
JTextField textFieldSquare3a = new JTextField(11);
String stringSquare3a; 
double doubleSquare3a;

JPanel panelSquare4a = new JPanel();
JTextField textFieldSquare4a = new JTextField(11);
String stringSquare4a;
double doubleSquare4a;

JPanel panelSquare5a = new JPanel();
JButton buttonSquare5a = new JButton("Side to?");

JPanel panelSquare6a = new JPanel();
JButton buttonSquare6a = new JButton("Area to?");

JPanel panelSquare7a = new JPanel();
JLabel labelSquare7a = new JLabel("(d) Diagonal:");

JPanel panelSquare9a = new JPanel();
JTextField textFieldSquare9a = new JTextField(11);
String stringSquare9a;
double doubleSquare9a;

JPanel panelSquare11a = new JPanel();
JButton buttonSquare11a = new JButton("Diagonal to?");

//&&& Circle &&&
JPanel panelCircle1b = new JPanel();
JLabel labelCircle1b = new JLabel("(r) Radius:");

JPanel panelCircle2b = new JPanel();
JLabel labelCircle2b = new JLabel("(A) Area:");

JPanel panelCircle3b = new JPanel();
JTextField textFieldCircle3b = new JTextField(11);
String stringCircle3b; 
double doubleCircle3b;

JPanel panelCircle4b = new JPanel();
JTextField textFieldCircle4b = new JTextField(11);
String stringCircle4b;
double doubleCircle4b;

JPanel panelCircle5b = new JPanel();
JButton buttonCircle5b = new JButton("Radius to?");

JPanel panelCircle6b = new JPanel();
JButton buttonCircle6b = new JButton("Area to?");

JPanel panelCircle7b = new JPanel();
JLabel labelCircle7b = new JLabel("(C) Circumference:");

JPanel panelCircle8b = new JPanel();
JLabel labelCircle8b = new JLabel("(d) Diameter:");

JPanel panelCircle9b = new JPanel();
JTextField textFieldCircle9b = new JTextField(11);
String stringCircle9b;
double doubleCircle9b;

JPanel panelCircle10b = new JPanel();
JTextField textFieldCircle10b = new JTextField(11);
String stringCircle10b;
double doubleCircle10b;

JPanel panelCircle11b = new JPanel();
JButton buttonCircle11b = new JButton("Circumference to?");

JPanel panelCircle12b = new JPanel();
JButton buttonCircle12b = new JButton("Diameter to?");

////############## Convert ##############

//&&& Convert a &&&
JPanel panelConvert2a = new JPanel();
JLabel labelConvert1a = new JLabel("Imperial:");

JLabel labelConvert2a = new JLabel("Metric:");
JPanel panelConvert1a = new JPanel();

JPanel panelConvert3a = new JPanel();
JRadioButton radioButtonConvert3a = new JRadioButton("Inches");

JPanel panelConvert4a = new JPanel();
JRadioButton radioButtonConvert4a = new JRadioButton("Millimetres");

JPanel panelConvert5a = new JPanel();
JRadioButton radioButtonConvert5a = new JRadioButton("Feet");

JPanel panelConvert6a = new JPanel();
JRadioButton radioButtonConvert6a = new JRadioButton("Centimetres");

JPanel panelConvert7a = new JPanel();
JRadioButton radioButtonConvert7a = new JRadioButton("Yards");

JPanel panelConvert8a = new JPanel();
JRadioButton radioButtonConvert8a = new JRadioButton("Metres");

JPanel panelConvert9a = new JPanel();
JRadioButton radioButtonConvert9a = new JRadioButton("Miles");

JPanel panelConvert10a = new JPanel();
JRadioButton radioButtonConvert10a = new JRadioButton("Kilometres");

JPanel panelConvert11a = new JPanel();
JTextField textFieldConvert11a = new JTextField(11);
String stringConvert11a; 
double doubleConvert11a; 

JPanel panelConvert12a = new JPanel();
JTextField textFieldConvert12a = new JTextField(11);
String stringConvert12a;
double doubleConvert12a;

JPanel panelConvert13a = new JPanel();
JButton buttonConvert13a = new JButton("Metric?");

JPanel panelConvert14a = new JPanel();
JButton buttonConvert14a = new JButton("Imperial?");

ButtonGroup radioButtonGroupConvertImperial = new ButtonGroup();
ButtonGroup radioButtonGroupConvertMetric = new ButtonGroup();

int intImperialPickeda = -1;
int intMetricPickeda = -1;


//&&& Convert b &&&
JPanel panelConvert1b = new JPanel();
JLabel labelConvert1b = new JLabel("Imperial:");

JPanel panelConvert2b = new JPanel();
JLabel labelConvert2b = new JLabel("Metric:");

JPanel panelConvert3b = new JPanel();
JRadioButton radioButtonConvert3b = new JRadioButton("Pints");

JPanel panelConvert4b = new JPanel();
JRadioButton radioButtonConvert4b = new JRadioButton("Millilitres");

JPanel panelConvert5b = new JPanel();
JRadioButton radioButtonConvert5b = new JRadioButton("Quarts");

JPanel panelConvert6b = new JPanel();
JRadioButton radioButtonConvert6b = new JRadioButton("Litres");

JPanel panelConvert7b = new JPanel();
JRadioButton radioButtonConvert7b = new JRadioButton("Pecks");

JPanel panelConvert8b = new JPanel();
JRadioButton radioButtonConvert8b = new JRadioButton("Kilolitres");

JPanel panelConvert9b = new JPanel();
JRadioButton radioButtonConvert9b = new JRadioButton("Bushels");

JPanel panelConvert11b = new JPanel();
JTextField textFieldConvert11b = new JTextField(11);
String stringConvert11b; 
double doubleConvert11b; 

JPanel panelConvert12b = new JPanel();
JTextField textFieldConvert12b = new JTextField(11);
String stringConvert12b;
double doubleConvert12b;

JPanel panelConvert13b = new JPanel();
JButton buttonConvert13b = new JButton("Metric?");

JPanel panelConvert14b = new JPanel();
JButton buttonConvert14b = new JButton("Imperial?");

ButtonGroup radioButtonGroupConvertImperialb = new ButtonGroup();
ButtonGroup radioButtonGroupConvertMetricb = new ButtonGroup();

int intImperialPickedb = -1;
int intMetricPickedb = -1;


//&&& Convert c &&&
JPanel panelConvert1c = new JPanel();
JLabel labelConvert1c = new JLabel("Imperial:");

JPanel panelConvert2c = new JPanel();
JLabel labelConvert2c = new JLabel("Metric:");

JPanel panelConvert3c = new JPanel();
JRadioButton radioButtonConvert5c = new JRadioButton("Acres");

JPanel panelConvert4c = new JPanel();
JRadioButton radioButtonConvert6c = new JRadioButton("Hectares");

JPanel panelConvert5c = new JPanel();
JRadioButton radioButtonConvert3c = new JRadioButton("Feet²");

JPanel panelConvert6c = new JPanel();
JRadioButton radioButtonConvert4c = new JRadioButton("Metres²");

JPanel panelConvert7c = new JPanel();
JRadioButton radioButtonConvert7c = new JRadioButton("Miles²");

JPanel panelConvert8c = new JPanel();
JRadioButton radioButtonConvert8c = new JRadioButton("Kilometres²");

JPanel panelConvert9c = new JPanel();
JTextField textFieldConvert9c = new JTextField(11);
String stringConvert9c; 
double doubleConvert9c; 

JPanel panelConvert10c = new JPanel();
JTextField textFieldConvert10c = new JTextField(11);
String stringConvert10c;
double doubleConvert10c;

JPanel panelConvert11c = new JPanel();
JButton buttonConvert11c = new JButton("Metric?");

JPanel panelConvert12c = new JPanel();
JButton buttonConvert12c = new JButton("Imperial?");

ButtonGroup radioButtonGroupConvertImperialc = new ButtonGroup();
ButtonGroup radioButtonGroupConvertMetricc = new ButtonGroup();

int intImperialPickedc = -1;
int intMetricPickedc = -1;


//&&& Convert d &&&
JPanel panelConvert1d = new JPanel();
JLabel labelConvert1d = new JLabel("Farenheit:");

JPanel panelConvert2d = new JPanel();
JLabel labelConvert2d = new JLabel("Kelvin:");

JPanel panelConvert3d = new JPanel();
JTextField textFieldConvert3d = new JTextField(11);
String stringConvertTemperature3d; 
double doubleConvertTemperature3d;

JPanel panelConvert4d = new JPanel();
JTextField textFieldConvert4d = new JTextField(11);
String stringConvertTemperature4d;
double doubleConvertTemperature4d;

JPanel panelConvert5d = new JPanel();
JButton buttonConvert5d = new JButton("Fahrenheit to?");

JPanel panelConvert6d = new JPanel();
JButton buttonConvert6d = new JButton("Kelvin to?");

JPanel panelConvert7d = new JPanel();
JLabel labelConvert7d = new JLabel("Celsius:");

JPanel panelConvert9d = new JPanel();
JTextField textFieldConvert9d = new JTextField(11);
String stringConvertTemperature9d;
double doubleConvertTemperature9d;

JPanel panelConvert11d = new JPanel();
JButton buttonConvert11d = new JButton("Celsius to?");


//&&& Convert e &&&
JPanel panelConvert1e = new JPanel();
JLabel labelConvert1e = new JLabel("Imperial:");

JPanel panelConvert2e = new JPanel();
JLabel labelConvert2e = new JLabel("Metric:");

JPanel panelConvert3e = new JPanel();
JRadioButton radioButtonConvert3e = new JRadioButton("Ounces");

JPanel panelConvert4e = new JPanel();
JRadioButton radioButtonConvert4e = new JRadioButton("Milligrams");

JPanel panelConvert5e = new JPanel();
JRadioButton radioButtonConvert5e = new JRadioButton("Pounds");

JPanel panelConvert6e = new JPanel();
JRadioButton radioButtonConvert6e = new JRadioButton("Grams");

JPanel panelConvert7e = new JPanel();
JRadioButton radioButtonConvert7e = new JRadioButton("Stones");

JPanel panelConvert8e = new JPanel();
JRadioButton radioButtonConvert8e = new JRadioButton("Kilograms");

JPanel panelConvert9e = new JPanel();
JRadioButton radioButtonConvert9e = new JRadioButton("Short tons");

JPanel panelConvert10e = new JPanel();
JRadioButton radioButtonConvert10e = new JRadioButton("Tonnes");

JPanel panelConvert11e = new JPanel();
JTextField textFieldConvert11e = new JTextField(11);
String stringConvert11e; 
double doubleConvert11e; 

JPanel panelConvert12e = new JPanel();
JTextField textFieldConvert12e = new JTextField(11);
String stringConvert12e;
double doubleConvert12e;

JPanel panelConvert13e = new JPanel();
JButton buttonConvert13e = new JButton("Metric?");

JPanel panelConvert14e = new JPanel();
JButton buttonConvert14e = new JButton("Imperial?");

ButtonGroup radioButtonGroupConvertImperiale = new ButtonGroup();
ButtonGroup radioButtonGroupConvertMetrice = new ButtonGroup();

int intImperialPickede = -1;
int intMetricPickede = -1;

//&&& Convert f &&&
JPanel panelConvert1f = new JPanel();
JLabel labelConvert1f = new JLabel("Imperial:");

JPanel panelConvert2f = new JPanel();
JLabel labelConvert2f = new JLabel("Metric:");

JPanel panelConvert3f = new JPanel();
JRadioButton radioButtonConvert3f = new JRadioButton("Feet/s");

JPanel panelConvert4f = new JPanel();
JRadioButton radioButtonConvert4f = new JRadioButton("Metres/s");

JPanel panelConvert5f = new JPanel();
JRadioButton radioButtonConvert5f = new JRadioButton("Miles/h");

JPanel panelConvert6f = new JPanel();
JRadioButton radioButtonConvert6f = new JRadioButton("Kilometres/h");

JPanel panelConvert7f = new JPanel();
JRadioButton radioButtonConvert7f = new JRadioButton("Miles/s");

JPanel panelConvert8f = new JPanel();
JRadioButton radioButtonConvert8f = new JRadioButton("Kilometres/s");

JPanel panelConvert9f = new JPanel();
JTextField textFieldConvert9f = new JTextField(11);
String stringConvert9f; 
double doubleConvert9f; 

JPanel panelConvert10f = new JPanel();
JTextField textFieldConvert10f = new JTextField(11);
String stringConvert10f;
double doubleConvert10f;

JPanel panelConvert11f = new JPanel();
JButton buttonConvert11f = new JButton("Metric?");

JPanel panelConvert12f = new JPanel();
JButton buttonConvert12f = new JButton("Imperial?");

ButtonGroup radioButtonGroupConvertImperialf = new ButtonGroup();
ButtonGroup radioButtonGroupConvertMetricf = new ButtonGroup();

int intImperialPickedf = -1;
int intMetricPickedf = -1;


//&&& Convert g &&&
JPanel panelConvert1g = new JPanel();
JLabel labelConvert1g = new JLabel("Imperial:");

JPanel panelConvert2g = new JPanel();
JLabel labelConvert2g = new JLabel("Metric:");

JPanel panelConvert3g = new JPanel();
JRadioButton radioButtonConvert3g = new JRadioButton("Feet/s²");

JPanel panelConvert4g = new JPanel();
JRadioButton radioButtonConvert4g = new JRadioButton("Metres/s²");

JPanel panelConvert5g = new JPanel();
JRadioButton radioButtonConvert5g = new JRadioButton("Miles/(h*s)");

JPanel panelConvert6g = new JPanel();
JRadioButton radioButtonConvert6g = new JRadioButton("Kilometres/(h*s)");

JPanel panelConvert7g = new JPanel();
JTextField textFieldConvert7g = new JTextField(11);
String stringConvert7g; 
double doubleConvert7g; 

JPanel panelConvert8g = new JPanel();
JTextField textFieldConvert8g = new JTextField(11);
String stringConvert8g;
double doubleConvert8g;

JPanel panelConvert9g = new JPanel();
JButton buttonConvert9g = new JButton("Metric?");

JPanel panelConvert10g = new JPanel();
JButton buttonConvert10g = new JButton("Imperial?");

ButtonGroup radioButtonGroupConvertImperialg = new ButtonGroup();
ButtonGroup radioButtonGroupConvertMetricg = new ButtonGroup();

int intImperialPickedg = -1;
int intMetricPickedg = -1;

//&&& Convert h &&&
JPanel panelConvert1h = new JPanel();
JLabel labelConvert1h = new JLabel("Imperial:");

JPanel panelConvert2h = new JPanel();
JLabel labelConvert2h = new JLabel("Metric:");

JPanel panelConvert3h = new JPanel();
JRadioButton radioButtonConvert3h = new JRadioButton("Oz/in³");

JPanel panelConvert4h = new JPanel();
JRadioButton radioButtonConvert4h = new JRadioButton("Grams/cm³");

JPanel panelConvert5h = new JPanel();
JRadioButton radioButtonConvert5h = new JRadioButton("Pounds/in³");

JPanel panelConvert6h = new JPanel();
JRadioButton radioButtonConvert6h = new JRadioButton("Kilograms/m³");

JPanel panelConvert7h = new JPanel();
JRadioButton radioButtonConvert7h = new JRadioButton("Slug/ft³");

JPanel panelConvert9h = new JPanel();
JRadioButton radioButtonConvert9h = new JRadioButton("Pounds/gal");

JPanel panelConvert11h = new JPanel();
JRadioButton radioButtonConvert11h = new JRadioButton("Pound/ft³");

JPanel panelConvert13h = new JPanel();
JTextField textFieldConvert13h = new JTextField(11);
String stringConvert13h; 
double doubleConvert13h; 

JPanel panelConvert14h = new JPanel();
JTextField textFieldConvert14h = new JTextField(11);
String stringConvert14h;
double doubleConvert14h;

JPanel panelConvert15h = new JPanel();
JButton buttonConvert15h = new JButton("Metric?");

JPanel panelConvert16h = new JPanel();
JButton buttonConvert16h = new JButton("Imperial?");

ButtonGroup radioButtonGroupConvertImperialh = new ButtonGroup();
ButtonGroup radioButtonGroupConvertMetrich = new ButtonGroup();

int intImperialPickedh = -1;
int intMetricPickedh = -1;


//&&& Convert i &&&
JPanel panelConvert1i = new JPanel();
JLabel labelConvert1i = new JLabel("Angle:");

JPanel panelConvert3i = new JPanel();
JRadioButton radioButtonConvert3i = new JRadioButton("Seconds");

JPanel panelConvert4i = new JPanel();
JRadioButton radioButtonConvert4i = new JRadioButton("Seconds");

JPanel panelConvert5i = new JPanel();
JRadioButton radioButtonConvert5i = new JRadioButton("Minutes");

JPanel panelConvert6i = new JPanel();
JRadioButton radioButtonConvert6i = new JRadioButton("Minutes");

JPanel panelConvert7i = new JPanel();
JRadioButton radioButtonConvert7i = new JRadioButton("Degrees");

JPanel panelConvert8i = new JPanel();
JRadioButton radioButtonConvert8i = new JRadioButton("Degrees");

JPanel panelConvert9i = new JPanel();
JRadioButton radioButtonConvert9i = new JRadioButton("Radians");

JPanel panelConvert10i = new JPanel();
JRadioButton radioButtonConvert10i = new JRadioButton("Radians");

JPanel panelConvert11i = new JPanel();
JRadioButton radioButtonConvert11i = new JRadioButton("Revolutions");

JPanel panelConvert12i = new JPanel();
JRadioButton radioButtonConvert12i = new JRadioButton("Revolutions");

JPanel panelConvert13i = new JPanel();
JTextField textFieldConvert13i = new JTextField(11);
String stringConvert13i; 
double doubleConvert13i; 

JPanel panelConvert14i = new JPanel();
JTextField textFieldConvert14i = new JTextField(11);
String stringConvert14i;
double doubleConvert14i;

JPanel panelConvert15i = new JPanel();
JButton buttonConvert15i = new JButton("Angle?");

ButtonGroup radioButtonGroupConvertMetricFirsti = new ButtonGroup();
ButtonGroup radioButtonGroupConvertMetricSecondi = new ButtonGroup();

int intMetricPickedFirsti = -1;
int intMetricPickedSecondi = -1;


//&&& Convert j &&&
JPanel panelConvert1j = new JPanel();
JLabel labelConvert1j = new JLabel("Number:");

JPanel panelConvert3j = new JPanel();
JRadioButton radioButtonConvert3j = new JRadioButton("Binary");

JPanel panelConvert4j = new JPanel();
JRadioButton radioButtonConvert4j = new JRadioButton("Binary");

JPanel panelConvert5j = new JPanel();
JRadioButton radioButtonConvert5j = new JRadioButton("Octal");

JPanel panelConvert6j = new JPanel();
JRadioButton radioButtonConvert6j = new JRadioButton("Octal");

JPanel panelConvert7j = new JPanel();
JRadioButton radioButtonConvert7j = new JRadioButton("Decimal");

JPanel panelConvert8j = new JPanel();
JRadioButton radioButtonConvert8j = new JRadioButton("Decimal");

JPanel panelConvert9j = new JPanel();
JRadioButton radioButtonConvert9j = new JRadioButton("Hexadecimal");

JPanel panelConvert10j = new JPanel();
JRadioButton radioButtonConvert10j = new JRadioButton("Hexadecimal");

JPanel panelConvert11j = new JPanel();
JTextField textFieldConvert11j = new JTextField(11);
String stringConvert11j; 
int intConvert11j; 

JPanel panelConvert12j = new JPanel();
JTextField textFieldConvert12j = new JTextField(11);
String stringConvert12j;
int intConvert12j;

JPanel panelConvert13j = new JPanel();
JButton buttonConvert13j = new JButton("Number?");

ButtonGroup radioButtonGroupConvertMetricFirstj = new ButtonGroup();
ButtonGroup radioButtonGroupConvertMetricSecondj = new ButtonGroup();

int intMetricPickedFirstj = -1;
int intMetricPickedSecondj = -1;


//&&& Convert k &&&
JPanel panelConvert1k = new JPanel();
JLabel labelConvert1k = new JLabel("Data:");

JPanel panelConvert3k = new JPanel();
JRadioButton radioButtonConvert3k = new JRadioButton("Bits");

JPanel panelConvert4k = new JPanel();
JRadioButton radioButtonConvert4k = new JRadioButton("Bits");

JPanel panelConvert5k = new JPanel();
JRadioButton radioButtonConvert5k = new JRadioButton("Bytes");

JPanel panelConvert6k = new JPanel();
JRadioButton radioButtonConvert6k = new JRadioButton("Bytes");

JPanel panelConvert7k = new JPanel();
JRadioButton radioButtonConvert7k = new JRadioButton("Kilobytes");

JPanel panelConvert8k = new JPanel();
JRadioButton radioButtonConvert8k = new JRadioButton("Kilobytes");

JPanel panelConvert9k = new JPanel();
JRadioButton radioButtonConvert9k = new JRadioButton("Megabytes");

JPanel panelConvert10k = new JPanel();
JRadioButton radioButtonConvert10k = new JRadioButton("Megabytes");

JPanel panelConvert11k = new JPanel();
JRadioButton radioButtonConvert11k = new JRadioButton("Gigabytes");

JPanel panelConvert12k = new JPanel();
JRadioButton radioButtonConvert12k = new JRadioButton("Gigabytes");

JPanel panelConvert13k = new JPanel();
JRadioButton radioButtonConvert13k = new JRadioButton("Terabytes");

JPanel panelConvert14k = new JPanel();
JRadioButton radioButtonConvert14k = new JRadioButton("Terabytes");

JPanel panelConvert15k = new JPanel();
JTextField textFieldConvert15k = new JTextField(11);
String stringConvert15k; 
double doubleConvert15k; 

JPanel panelConvert16k = new JPanel();
JTextField textFieldConvert16k = new JTextField(11);
String stringConvert16k;
double doubleConvert16k;

JPanel panelConvert17k = new JPanel();
JButton buttonConvert17k = new JButton("Data?");

ButtonGroup radioButtonGroupConvertMetricFirstk = new ButtonGroup();
ButtonGroup radioButtonGroupConvertMetricSecondk = new ButtonGroup();

int intMetricPickedFirstk = -1;
int intMetricPickedSecondk = -1;


//&&& Convert L &&&
JPanel panelConvert1l = new JPanel();
JLabel labelConvert1l = new JLabel("Length:");

JPanel panelConvert2l = new JPanel();
JLabel labelConvert2l = new JLabel("Pixels:");

JPanel panelConvert3l = new JPanel();
JRadioButton radioButtonConvert3l = new JRadioButton("Centimetres");

JPanel panelConvert4l = new JPanel();
JRadioButton radioButtonConvert4l = new JRadioButton("Pixels");

JPanel panelConvert5l = new JPanel();
JRadioButton radioButtonConvert5l = new JRadioButton("Millimetres");

JPanel panelConvert6l = new JPanel();
JLabel labelConvert6l = new JLabel("DPI:");

JPanel panelConvert7l = new JPanel();
JRadioButton radioButtonConvert7l = new JRadioButton("Inches");

JPanel panelConvert8l = new JPanel();
JTextField textFieldConvert8l = new JTextField(11);
String stringConvert8l;
double doubleConvert8l = 96;

JPanel panelConvert9l = new JPanel();
JRadioButton radioButtonConvert9l = new JRadioButton("Twips");

JPanel panelConvert11l = new JPanel();
JTextField textFieldConvert11l = new JTextField(11);
String stringConvert11l; 
double doubleConvert11l; 

JPanel panelConvert12l = new JPanel();
JTextField textFieldConvert12l = new JTextField(11);
String stringConvert12l;
double doubleConvert12l;

JPanel panelConvert13l = new JPanel();
JButton buttonConvert13l = new JButton("Pixels?");

JPanel panelConvert14l = new JPanel();
JButton buttonConvert14l = new JButton("Length?");

ButtonGroup radioButtonGroupConvertUnitl = new ButtonGroup();

int intUnitPickedl = -1;


//&&& Format &&&
JPanel panelFormat1 = new JPanel();
JLabel labelFormat1 = new JLabel("Format:");

JPanel panelFormat3 = new JPanel();
JTextField textFieldFormat3 = new JTextField(24);
String stringFormat3;

JPanel panelFormat5 = new JPanel();
JButton buttonFormat5 = new JButton("Set Format");

JPanel panelFormat7 = new JPanel();
JLabel labelFormat7 = new JLabel("Suffix:");

JPanel panelFormat9 = new JPanel();
JRadioButton radioButtonFormat9 = new JRadioButton("None");

JPanel panelFormat11 = new JPanel();
JRadioButton radioButtonFormat11 = new JRadioButton("Variant 1");

JPanel panelFormat13 = new JPanel();
JRadioButton radioButtonFormat13 = new JRadioButton("Variant 2");

ButtonGroup radioButtonGroupFormat = new ButtonGroup();

String userFormat;

String suffixMm = "";
String suffixCm = "";
String suffixM = "";
String suffixKm = "";
String suffixIn = "";
String suffixFt  = "";
String suffixYd  = "";
String suffixMi  = "";
String suffixC  = "";
String suffixK  = "";
String suffixF  = "";
String suffixAc = "";
String suffixBu  = "";
String suffixFtSSqr = "";
String suffixFtS  = "";
String suffixFtSqr = "";
String suffixG  = "";
String suffixGCmSqr3 = "";
String suffixHa = "";
String suffixKg = "";
String suffixKgMSqr3  = "";
String suffixKl  = "";
String suffixKmH = "";
String suffixKmHS = "";
String suffixKmS  = "";
String suffixKmSqr = "";
String suffixLb  = "";
String suffixLbFtSqr3 = "";
String suffixLbGal  = "";
String suffixLbInSqr3 = ""; 
String suffixL  = "";
String suffixMg = "";
String suffixMiH = "";
String suffixMiHS = "";
String suffixMiS = "";
String suffixMiSqr = "";
String suffixMl = "";
String suffixMS = "";
String suffixMSqr = "";
String suffixMSSqr = "";
String suffixOz = "";
String suffixOzFtSqr3 = "";
String suffixOzInSqr3 = "";
String suffixPk = "";
String suffixPt = "";
String suffixQt = "";
String suffixSt = "";
String suffixT = "";
String suffixTn = "";
String suffixR = "";
String suffixRev = "";
String suffixTB = "";
String suffixPx = "";
String suffixArcmin = "";
String suffixArcsec = "";
String suffixB = "";
String suffixBin = "";
String suffixBy = "";
String suffixDec = "";
String suffixDeg = "";
String suffixGB = "";
String suffixHex = "";
String suffixKB = "";
String suffixMB = "";
String suffixOct = "";
String suffixTwip = "";


public calculator() { 

//%%% Frame %%%
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);
frame.setSize(800, 535);
frame.setVisible(true);
frame.setTitle("DMCalculator");
frame.setResizable(false);

//%%% Icons %%%
iconPanel.setBounds(250, 250, 250, 250);
frame.add(iconPanel);
iconPanel.add(iconLabel);

//%%% Notes %%%
notePanel1.setBounds(500, 0, 310, 500);
notePanel1.add(scrollablenoteBox1);
frame.add(notePanel1);

notePanel2.setBounds(500, 0, 310, 500);
notePanel2.add(scrollablenoteBox2);
frame.add(notePanel2);
notePanel2.setVisible(false);

notePanel3.setBounds(500, 0, 310, 500);
notePanel3.add(scrollablenoteBox3);
frame.add(notePanel3);
notePanel3.setVisible(false);

notePanel4.setBounds(500, 0, 310, 500);
notePanel4.add(scrollablenoteBox4);
frame.add(notePanel4);
notePanel4.setVisible(false);

notePanel5.setBounds(500, 0, 310, 500);
notePanel5.add(scrollablenoteBox5);
frame.add(notePanel5);
notePanel5.setVisible(false);


//%%% Other %%%
decimalFormat.applyPattern("0.##");


//&&& Selection &&&
selectionPanel.setBounds(10, 10, 230, 235);
selectionPanel.setBackground(Color.LIGHT_GRAY);
selectionPanel.add(selectConvert);
selectConvert.addActionListener(this);
selectionPanel.add(select2D);
select2D.addActionListener(this);
selectionPanel.add(select3D);
select3D.addActionListener(this);
selectionPanel.add(selectNotebox);
selectNotebox.addActionListener(this);
selectionPanel.add(selectFormat);
selectFormat.addActionListener(this);
frame.add(selectionPanel);

choosePanel2D.setBounds(10, 255, 230, 235);
choosePanel2D.setBackground(Color.LIGHT_GRAY);
choosePanel2D.add(choose2DCircle);
choose2DCircle.addActionListener(this);
choosePanel2D.add(choose2DTriangle);
choose2DTriangle.addActionListener(this);
choosePanel2D.add(choose2DSquare);
choose2DSquare.addActionListener(this);
frame.add(choosePanel2D);
choosePanel2D.setVisible(false);

choosePanel3D.setBounds(10, 255, 230, 235);
choosePanel3D.setBackground(Color.LIGHT_GRAY);
choosePanel3D.add(choose3DSphere);
choose3DSphere.addActionListener(this);
choosePanel3D.add(choose3DCube);
choose3DCube.addActionListener(this);
frame.add(choosePanel3D);
choosePanel3D.setVisible(false);

choosePanelTriangle.setBounds(10, 255, 230, 235);
choosePanelTriangle.setBackground(Color.LIGHT_GRAY);
choosePanelTriangle.add(chooseTriangleScalene);
chooseTriangleScalene.addActionListener(this);
choosePanelTriangle.add(chooseTriangleRight);
chooseTriangleRight.addActionListener(this);
choosePanelTriangle.add(chooseTriangleEquilateral);
chooseTriangleEquilateral.addActionListener(this);
choosePanelTriangle.add(chooseTriangleIsosceles);
chooseTriangleIsosceles.addActionListener(this);
choosePanelTriangle.add(chooseTriangleObtuse);
chooseTriangleObtuse.addActionListener(this);
choosePanelTriangle.add(chooseTriangleAcute);
chooseTriangleAcute.addActionListener(this);
frame.add(choosePanelTriangle);
choosePanelTriangle.setVisible(false);

choosePanelNotebox.setBounds(10, 255, 230, 235);
choosePanelNotebox.setBackground(Color.LIGHT_GRAY);
frame.add(choosePanelNotebox);
choosePanelNotebox.setVisible(false);

choosePanelNotebox.add(chooseNotebox1);
chooseNotebox1.addActionListener(this);
choosePanelNotebox.add(chooseNotebox2);
chooseNotebox2.addActionListener(this);
choosePanelNotebox.add(chooseNotebox3);
chooseNotebox3.addActionListener(this);
choosePanelNotebox.add(chooseNotebox4);
chooseNotebox4.addActionListener(this);
choosePanelNotebox.add(chooseNotebox5);
chooseNotebox5.addActionListener(this);

choosePanelConvert.setBounds(10, 255, 230, 235);
choosePanelConvert.setBackground(Color.LIGHT_GRAY);

chooseConvertMetricImperial.addActionListener(this);
choosePanelConvert.add(chooseConvertMetricImperial);

chooseConvertTemperature.addActionListener(this);
choosePanelConvert.add(chooseConvertTemperature);

chooseConvertWeight.addActionListener(this);
choosePanelConvert.add(chooseConvertWeight);

chooseConvertVolume.addActionListener(this);
choosePanelConvert.add(chooseConvertVolume);

chooseConvertArea.addActionListener(this);
choosePanelConvert.add(chooseConvertArea);

chooseConvertSpeed.addActionListener(this);
choosePanelConvert.add(chooseConvertSpeed);

chooseConvertAcceleration.addActionListener(this);
choosePanelConvert.add(chooseConvertAcceleration);

chooseConvertDensity.addActionListener(this);
choosePanelConvert.add(chooseConvertDensity);

chooseConvertAngle.addActionListener(this);
choosePanelConvert.add(chooseConvertAngle);

chooseConvertNumber.addActionListener(this);
choosePanelConvert.add(chooseConvertNumber);

chooseConvertData.addActionListener(this);
choosePanelConvert.add(chooseConvertData);

chooseConvertPixel.addActionListener(this);
choosePanelConvert.add(chooseConvertPixel);

frame.add(choosePanelConvert);
choosePanelConvert.setVisible(false);


//############## 2D ##############

//&&& Triangle scalene &&&
panelTriangle1a.setBounds(250, 0, 125, 30);
panelTriangle1a.setLayout(new BorderLayout());
panelTriangle1a.add(labelTriangle1a);
frame.add(panelTriangle1a);
panelTriangle1a.setVisible(false);

panelTriangle2a.setBounds(375, 0, 125, 30);
panelTriangle2a.setLayout(new BorderLayout());
panelTriangle2a.add(labelTriangle2a);
frame.add(panelTriangle2a);
panelTriangle2a.setVisible(false);

panelTriangle3a.setBounds(500, 0, 125, 30);
panelTriangle3a.setLayout(new BorderLayout());
panelTriangle3a.add(labelTriangle3a);
frame.add(panelTriangle3a);
panelTriangle3a.setVisible(false);

panelTriangle4a.setBounds(245, 30, 125, 30);
panelTriangle4a.add(textFieldTriangle4a);
frame.add(panelTriangle4a);
panelTriangle4a.setVisible(false);

panelTriangle5a.setBounds(370, 30, 125, 30);
panelTriangle5a.add(textFieldTriangle5a);
frame.add(panelTriangle5a);
panelTriangle5a.setVisible(false);

panelTriangle6a.setBounds(495, 30, 125, 30);
panelTriangle6a.add(textFieldTriangle6a);
frame.add(panelTriangle6a);
panelTriangle6a.setVisible(false);

panelTriangle7a.setBounds(245, 60, 125, 30);
buttonTriangle7a.addActionListener(this);
panelTriangle7a.add(buttonTriangle7a);
frame.add(panelTriangle7a);
panelTriangle7a.setVisible(false);

panelTriangle8a.setBounds(370, 60, 125, 30);
buttonTriangle8a.addActionListener(this);
panelTriangle8a.add(buttonTriangle8a);
frame.add(panelTriangle8a);
panelTriangle8a.setVisible(false);

panelTriangle9a.setBounds(495, 60, 125, 30);
buttonTriangle9a.addActionListener(this);
panelTriangle9a.add(buttonTriangle9a);
frame.add(panelTriangle9a);
panelTriangle9a.setVisible(false);

panelTriangle10a.setBounds(250, 90, 125, 30);
panelTriangle10a.setLayout(new BorderLayout());
panelTriangle10a.add(labelTriangle10a);
frame.add(panelTriangle10a);
panelTriangle10a.setVisible(false);

panelTriangle11a.setBounds(375, 90, 125, 30);
panelTriangle11a.setLayout(new BorderLayout());
panelTriangle11a.add(labelTriangle11a);
frame.add(panelTriangle11a);
panelTriangle11a.setVisible(false);

panelTriangle12a.setBounds(500, 90, 125, 30);
panelTriangle12a.setLayout(new BorderLayout());
panelTriangle12a.add(labelTriangle12a);
frame.add(panelTriangle12a);
panelTriangle12a.setVisible(false);

panelTriangle13a.setBounds(245, 120, 125, 30);
panelTriangle13a.add(textFieldTriangle13a);
frame.add(panelTriangle13a);
panelTriangle13a.setVisible(false);

panelTriangle14a.setBounds(370, 120, 125, 30);
panelTriangle14a.add(textFieldTriangle14a);
frame.add(panelTriangle14a);
panelTriangle14a.setVisible(false);

panelTriangle15a.setBounds(495, 120, 125, 30);
panelTriangle15a.add(textFieldTriangle15a);
frame.add(panelTriangle15a);
panelTriangle15a.setVisible(false);

panelTriangle16a.setBounds(245, 150, 125, 30);
buttonTriangle16a.addActionListener(this);
panelTriangle16a.add(buttonTriangle16a);
frame.add(panelTriangle16a);
panelTriangle16a.setVisible(false);

panelTriangle17a.setBounds(370, 150, 125, 30);
buttonTriangle17a.addActionListener(this);
panelTriangle17a.add(buttonTriangle17a);
frame.add(panelTriangle17a);
panelTriangle17a.setVisible(false);

panelTriangle18a.setBounds(495, 150, 125, 30);
buttonTriangle18a.addActionListener(this);
panelTriangle18a.add(buttonTriangle18a);
frame.add(panelTriangle18a);
panelTriangle18a.setVisible(false);

panelTriangle19a.setBounds(250, 180, 125, 30);
panelTriangle19a.setLayout(new BorderLayout());
panelTriangle19a.add(labelTriangle19a);
frame.add(panelTriangle19a);
panelTriangle19a.setVisible(false);

panelTriangle20a.setBounds(375, 180, 125, 30);
panelTriangle20a.setLayout(new BorderLayout());
panelTriangle20a.add(labelTriangle20a);
frame.add(panelTriangle20a);
panelTriangle20a.setVisible(false);

panelTriangle21a.setBounds(500, 180, 125, 30);
panelTriangle21a.setLayout(new BorderLayout());
panelTriangle21a.add(labelTriangle21a);
frame.add(panelTriangle21a);
panelTriangle21a.setVisible(false);

panelTriangle22a.setBounds(245, 210, 125, 30);
panelTriangle22a.add(textFieldTriangle22a);
frame.add(panelTriangle22a);
panelTriangle22a.setVisible(false);

panelTriangle23a.setBounds(370, 210, 125, 30);
panelTriangle23a.add(textFieldTriangle23a);
frame.add(panelTriangle23a);
panelTriangle23a.setVisible(false);

panelTriangle24a.setBounds(495, 210, 125, 30);
panelTriangle24a.add(textFieldTriangle24a);
frame.add(panelTriangle24a);
panelTriangle24a.setVisible(false);

panelTriangle25a.setBounds(245, 240, 125, 30);
buttonTriangle25a.addActionListener(this);
panelTriangle25a.add(buttonTriangle25a);
frame.add(panelTriangle25a);
panelTriangle25a.setVisible(false);

panelTriangle26a.setBounds(370, 240, 125, 30);
buttonTriangle26a.addActionListener(this);
panelTriangle26a.add(buttonTriangle26a);
frame.add(panelTriangle26a);
panelTriangle26a.setVisible(false);

panelTriangle27a.setBounds(495, 240, 125, 30);
buttonTriangle27a.addActionListener(this);
panelTriangle27a.add(buttonTriangle27a);
frame.add(panelTriangle27a);
panelTriangle27a.setVisible(false);

panelTriangle28a.setBounds(500, 270, 125, 30);
panelTriangle28a.setLayout(new BorderLayout());
panelTriangle28a.add(labelTriangle28a);
frame.add(panelTriangle28a);
panelTriangle28a.setVisible(false);

panelTriangle31a.setBounds(495, 300, 125, 30);
panelTriangle31a.add(textFieldTriangle31a);
frame.add(panelTriangle31a);
panelTriangle31a.setVisible(false);

panelTriangle34a.setBounds(495, 330, 125, 30);
buttonTriangle34a.addActionListener(this);
panelTriangle34a.add(buttonTriangle34a);
frame.add(panelTriangle34a);
panelTriangle34a.setVisible(false);

//############## 3D ##############

//&&& Cube &&&
panelCube1a.setBounds(250, 0, 125, 30);
panelCube1a.setLayout(new BorderLayout());
panelCube1a.add(labelCube1a);
frame.add(panelCube1a);
panelCube1a.setVisible(false);

panelCube2a.setBounds(375, 0, 125, 30);
panelCube2a.setLayout(new BorderLayout());
panelCube2a.add(labelCube2a);
frame.add(panelCube2a);
panelCube2a.setVisible(false);

panelCube3a.setBounds(245, 30, 125, 30);
panelCube3a.add(textFieldCube3a);
frame.add(panelCube3a);
panelCube3a.setVisible(false);

panelCube4a.setBounds(370, 30, 125, 30);
panelCube4a.add(textFieldCube4a);
frame.add(panelCube4a);
panelCube4a.setVisible(false);

panelCube5a.setBounds(245, 60, 125, 30);
buttonCube5a.addActionListener(this);
panelCube5a.add(buttonCube5a);
frame.add(panelCube5a);
panelCube5a.setVisible(false);

panelCube6a.setBounds(370, 60, 125, 30);
buttonCube6a.addActionListener(this);
panelCube6a.add(buttonCube6a);
frame.add(panelCube6a);
panelCube6a.setVisible(false);

panelCube7a.setBounds(250, 90, 125, 30);
panelCube7a.setLayout(new BorderLayout());
panelCube7a.add(labelCube7a);
frame.add(panelCube7a);
panelCube7a.setVisible(false);

panelCube8a.setBounds(375, 90, 125, 30);
panelCube8a.setLayout(new BorderLayout());
panelCube8a.add(labelCube8a);
frame.add(panelCube8a);
panelCube8a.setVisible(false);

panelCube9a.setBounds(245, 120, 125, 30);
panelCube9a.add(textFieldCube9a);
frame.add(panelCube9a);
panelCube9a.setVisible(false);

panelCube10a.setBounds(370, 120, 125, 30);
panelCube10a.add(textFieldCube10a);
frame.add(panelCube10a);
panelCube10a.setVisible(false);

panelCube11a.setBounds(245, 150, 125, 30);
buttonCube11a.addActionListener(this);
panelCube11a.add(buttonCube11a);
frame.add(panelCube11a);
panelCube11a.setVisible(false);

panelCube12a.setBounds(370, 150, 125, 30);
buttonCube12a.addActionListener(this);
panelCube12a.add(buttonCube12a);
frame.add(panelCube12a);
panelCube12a.setVisible(false);

//&&& Sphere &&&
panelSphere1a.setBounds(250, 0, 125, 30);
panelSphere1a.setLayout(new BorderLayout());
panelSphere1a.add(labelSphere1a);
frame.add(panelSphere1a);
panelSphere1a.setVisible(false);

panelSphere2a.setBounds(375, 0, 125, 30);
panelSphere2a.setLayout(new BorderLayout());
panelSphere2a.add(labelSphere2a);
frame.add(panelSphere2a);
panelSphere2a.setVisible(false);

panelSphere3a.setBounds(245, 30, 125, 30);
panelSphere3a.add(textFieldSphere3a);
frame.add(panelSphere3a);
panelSphere3a.setVisible(false);

panelSphere4a.setBounds(370, 30, 125, 30);
panelSphere4a.add(textFieldSphere4a);
frame.add(panelSphere4a);
panelSphere4a.setVisible(false);

panelSphere5a.setBounds(245, 60, 125, 30);
buttonSphere5a.addActionListener(this);
panelSphere5a.add(buttonSphere5a);
frame.add(panelSphere5a);
panelSphere5a.setVisible(false);

panelSphere6a.setBounds(370, 60, 125, 30);
buttonSphere6a.addActionListener(this);
panelSphere6a.add(buttonSphere6a);
frame.add(panelSphere6a);
panelSphere6a.setVisible(false);

panelSphere7a.setBounds(250, 90, 125, 30);
panelSphere7a.setLayout(new BorderLayout());
panelSphere7a.add(labelSphere7a);
frame.add(panelSphere7a);
panelSphere7a.setVisible(false);

panelSphere8a.setBounds(375, 90, 125, 30);
panelSphere8a.setLayout(new BorderLayout());
panelSphere8a.add(labelSphere8a);
frame.add(panelSphere8a);
panelSphere8a.setVisible(false);

panelSphere9a.setBounds(245, 120, 125, 30);
panelSphere9a.add(textFieldSphere9a);
frame.add(panelSphere9a);
panelSphere9a.setVisible(false);

panelSphere10a.setBounds(370, 120, 125, 30);
panelSphere10a.add(textFieldSphere10a);
frame.add(panelSphere10a);
panelSphere10a.setVisible(false);

panelSphere11a.setBounds(245, 150, 125, 30);
buttonSphere11a.addActionListener(this);
panelSphere11a.add(buttonSphere11a);
frame.add(panelSphere11a);
panelSphere11a.setVisible(false);

panelSphere12a.setBounds(370, 150, 125, 30);
buttonSphere12a.addActionListener(this);
panelSphere12a.add(buttonSphere12a);
frame.add(panelSphere12a);
panelSphere12a.setVisible(false);


//&&& Square &&&
panelSquare1a.setBounds(250, 0, 125, 30);
panelSquare1a.setLayout(new BorderLayout());
panelSquare1a.add(labelSquare1a);
frame.add(panelSquare1a);
panelSquare1a.setVisible(false);

panelSquare2a.setBounds(375, 0, 125, 30);
panelSquare2a.setLayout(new BorderLayout());
panelSquare2a.add(labelSquare2a);
frame.add(panelSquare2a);
panelSquare2a.setVisible(false);

panelSquare3a.setBounds(245, 30, 125, 30);
panelSquare3a.add(textFieldSquare3a);
frame.add(panelSquare3a);
panelSquare3a.setVisible(false);

panelSquare4a.setBounds(370, 30, 125, 30);
panelSquare4a.add(textFieldSquare4a);
frame.add(panelSquare4a);
panelSquare4a.setVisible(false);

panelSquare5a.setBounds(245, 60, 125, 30);
buttonSquare5a.addActionListener(this);
panelSquare5a.add(buttonSquare5a);
frame.add(panelSquare5a);
panelSquare5a.setVisible(false);

panelSquare6a.setBounds(370, 60, 125, 30);
buttonSquare6a.addActionListener(this);
panelSquare6a.add(buttonSquare6a);
frame.add(panelSquare6a);
panelSquare6a.setVisible(false);

panelSquare7a.setBounds(250, 90, 125, 30);
panelSquare7a.setLayout(new BorderLayout());
panelSquare7a.add(labelSquare7a);
frame.add(panelSquare7a);
panelSquare7a.setVisible(false);

panelSquare9a.setBounds(245, 120, 125, 30);
panelSquare9a.add(textFieldSquare9a);
frame.add(panelSquare9a);
panelSquare9a.setVisible(false);

panelSquare11a.setBounds(245, 150, 125, 30);
buttonSquare11a.addActionListener(this);
panelSquare11a.add(buttonSquare11a);
frame.add(panelSquare11a);
panelSquare11a.setVisible(false);


//&&& Circle &&&
panelCircle1b.setBounds(250, 0, 125, 30);
panelCircle1b.setLayout(new BorderLayout());
panelCircle1b.add(labelCircle1b);
frame.add(panelCircle1b);
panelCircle1b.setVisible(false);

panelCircle2b.setBounds(375, 0, 125, 30);
panelCircle2b.setLayout(new BorderLayout());
panelCircle2b.add(labelCircle2b);
frame.add(panelCircle2b);
panelCircle2b.setVisible(false);

panelCircle3b.setBounds(245, 30, 125, 30);
panelCircle3b.add(textFieldCircle3b);
frame.add(panelCircle3b);
panelCircle3b.setVisible(false);

panelCircle4b.setBounds(370, 30, 125, 30);
panelCircle4b.add(textFieldCircle4b);
frame.add(panelCircle4b);
panelCircle4b.setVisible(false);

panelCircle5b.setBounds(245, 60, 125, 30);
buttonCircle5b.addActionListener(this);
panelCircle5b.add(buttonCircle5b);
frame.add(panelCircle5b);
panelCircle5b.setVisible(false);

panelCircle6b.setBounds(370, 60, 125, 30);
buttonCircle6b.addActionListener(this);
panelCircle6b.add(buttonCircle6b);
frame.add(panelCircle6b);
panelCircle6b.setVisible(false);

panelCircle7b.setBounds(250, 90, 125, 30);
panelCircle7b.setLayout(new BorderLayout());
panelCircle7b.add(labelCircle7b);
frame.add(panelCircle7b);
panelCircle7b.setVisible(false);

panelCircle8b.setBounds(375, 90, 125, 30);
panelCircle8b.setLayout(new BorderLayout());
panelCircle8b.add(labelCircle8b);
frame.add(panelCircle8b);
panelCircle8b.setVisible(false);

panelCircle9b.setBounds(245, 120, 125, 30);
panelCircle9b.add(textFieldCircle9b);
frame.add(panelCircle9b);
panelCircle9b.setVisible(false);

panelCircle10b.setBounds(370, 120, 125, 30);
panelCircle10b.add(textFieldCircle10b);
frame.add(panelCircle10b);
panelCircle10b.setVisible(false);

panelCircle11b.setBounds(245, 150, 125, 30);
buttonCircle11b.addActionListener(this);
panelCircle11b.add(buttonCircle11b);
frame.add(panelCircle11b);
panelCircle11b.setVisible(false);

panelCircle12b.setBounds(370, 150, 125, 30);
buttonCircle12b.addActionListener(this);
panelCircle12b.add(buttonCircle12b);
frame.add(panelCircle12b);
panelCircle12b.setVisible(false);


//############## Convert ##############

//&&& Convert a &&&
panelConvert1a.setBounds(250, 0, 125, 30);
panelConvert1a.setLayout(new BorderLayout());
panelConvert1a.add(labelConvert1a);
frame.add(panelConvert1a);
panelConvert1a.setVisible(false);

panelConvert2a.setBounds(375, 0, 125, 30);
panelConvert2a.setLayout(new BorderLayout());
panelConvert2a.add(labelConvert2a);
frame.add(panelConvert2a);
panelConvert2a.setVisible(false);

panelConvert3a.setBounds(245, 30, 125, 30);
panelConvert3a.setLayout(new BorderLayout());
radioButtonConvert3a.addActionListener(this);
panelConvert3a.add(radioButtonConvert3a);
radioButtonGroupConvertImperial.add(radioButtonConvert3a);
frame.add(panelConvert3a);
panelConvert3a.setVisible(false);

panelConvert4a.setBounds(370, 30, 125, 30);
panelConvert4a.setLayout(new BorderLayout());
radioButtonConvert4a.addActionListener(this);
panelConvert4a.add(radioButtonConvert4a);
radioButtonGroupConvertMetric.add(radioButtonConvert4a);
frame.add(panelConvert4a);
panelConvert4a.setVisible(false);

panelConvert5a.setBounds(245, 60, 125, 30);
panelConvert5a.setLayout(new BorderLayout());
radioButtonConvert5a.addActionListener(this);
panelConvert5a.add(radioButtonConvert5a);
radioButtonGroupConvertImperial.add(radioButtonConvert5a);
frame.add(panelConvert5a);
panelConvert5a.setVisible(false);

panelConvert6a.setBounds(370, 60, 125, 30);
panelConvert6a.setLayout(new BorderLayout());
radioButtonConvert6a.addActionListener(this);
panelConvert6a.add(radioButtonConvert6a);
radioButtonGroupConvertMetric.add(radioButtonConvert6a);
frame.add(panelConvert6a);
panelConvert6a.setVisible(false);

panelConvert7a.setBounds(245, 90, 125, 30);
panelConvert7a.setLayout(new BorderLayout());
radioButtonConvert7a.addActionListener(this);
panelConvert7a.add(radioButtonConvert7a);
radioButtonGroupConvertImperial.add(radioButtonConvert7a);
frame.add(panelConvert7a);
panelConvert7a.setVisible(false);

panelConvert8a.setBounds(370, 90, 125, 30);
panelConvert8a.setLayout(new BorderLayout());
radioButtonConvert8a.addActionListener(this);
panelConvert8a.add(radioButtonConvert8a);
radioButtonGroupConvertMetric.add(radioButtonConvert8a);
frame.add(panelConvert8a);
panelConvert8a.setVisible(false);

panelConvert9a.setBounds(245, 120, 125, 30);
panelConvert9a.setLayout(new BorderLayout());
radioButtonConvert9a.addActionListener(this);
panelConvert9a.add(radioButtonConvert9a);
radioButtonGroupConvertImperial.add(radioButtonConvert9a);
frame.add(panelConvert9a);
panelConvert9a.setVisible(false);

panelConvert10a.setBounds(370, 120, 125, 30);
panelConvert10a.setLayout(new BorderLayout());
radioButtonConvert10a.addActionListener(this);
panelConvert10a.add(radioButtonConvert10a);
radioButtonGroupConvertMetric.add(radioButtonConvert10a);
frame.add(panelConvert10a);
panelConvert10a.setVisible(false);

panelConvert11a.setBounds(245, 150, 125, 30);
panelConvert11a.add(textFieldConvert11a);
frame.add(panelConvert11a);
panelConvert11a.setVisible(false);

panelConvert12a.setBounds(370, 150, 125, 30);
panelConvert12a.add(textFieldConvert12a);
frame.add(panelConvert12a);
panelConvert12a.setVisible(false);

panelConvert13a.setBounds(245, 180, 125, 30);
buttonConvert13a.addActionListener(this);
panelConvert13a.add(buttonConvert13a);
frame.add(panelConvert13a);
panelConvert13a.setVisible(false);

panelConvert14a.setBounds(370, 180, 125, 30);
buttonConvert14a.addActionListener(this);
panelConvert14a.add(buttonConvert14a);
frame.add(panelConvert14a);
panelConvert14a.setVisible(false);

//&&& Convert b &&&
panelConvert1b.setBounds(250, 0, 125, 30);
panelConvert1b.setLayout(new BorderLayout());
panelConvert1b.add(labelConvert1b);
frame.add(panelConvert1b);
panelConvert1b.setVisible(false);

panelConvert2b.setBounds(375, 0, 125, 30);
panelConvert2b.setLayout(new BorderLayout());
panelConvert2b.add(labelConvert2b);
frame.add(panelConvert2b);
panelConvert2b.setVisible(false);

panelConvert3b.setBounds(245, 30, 125, 30);
panelConvert3b.setLayout(new BorderLayout());
radioButtonConvert3b.addActionListener(this);
panelConvert3b.add(radioButtonConvert3b);
radioButtonGroupConvertImperialb.add(radioButtonConvert3b);
frame.add(panelConvert3b);
panelConvert3b.setVisible(false);

panelConvert4b.setBounds(370, 30, 125, 30);
panelConvert4b.setLayout(new BorderLayout());
radioButtonConvert4b.addActionListener(this);
panelConvert4b.add(radioButtonConvert4b);
radioButtonGroupConvertMetricb.add(radioButtonConvert4b);
frame.add(panelConvert4b);
panelConvert4b.setVisible(false);

panelConvert5b.setBounds(245, 60, 125, 30);
panelConvert5b.setLayout(new BorderLayout());
radioButtonConvert5b.addActionListener(this);
panelConvert5b.add(radioButtonConvert5b);
radioButtonGroupConvertImperialb.add(radioButtonConvert5b);
frame.add(panelConvert5b);
panelConvert5b.setVisible(false);

panelConvert6b.setBounds(370, 60, 125, 30);
panelConvert6b.setLayout(new BorderLayout());
radioButtonConvert6b.addActionListener(this);
panelConvert6b.add(radioButtonConvert6b);
radioButtonGroupConvertMetricb.add(radioButtonConvert6b);
frame.add(panelConvert6b);
panelConvert6b.setVisible(false);

panelConvert7b.setBounds(245, 90, 125, 30);
panelConvert7b.setLayout(new BorderLayout());
radioButtonConvert7b.addActionListener(this);
panelConvert7b.add(radioButtonConvert7b);
radioButtonGroupConvertImperialb.add(radioButtonConvert7b);
frame.add(panelConvert7b);
panelConvert7b.setVisible(false);

panelConvert8b.setBounds(370, 90, 125, 30);
panelConvert8b.setLayout(new BorderLayout());
radioButtonConvert8b.addActionListener(this);
panelConvert8b.add(radioButtonConvert8b);
radioButtonGroupConvertMetricb.add(radioButtonConvert8b);
frame.add(panelConvert8b);
panelConvert8b.setVisible(false);

panelConvert9b.setBounds(245, 120, 125, 30);
panelConvert9b.setLayout(new BorderLayout());
radioButtonConvert9b.addActionListener(this);
panelConvert9b.add(radioButtonConvert9b);
radioButtonGroupConvertImperialb.add(radioButtonConvert9b);
frame.add(panelConvert9b);
panelConvert9b.setVisible(false);

panelConvert11b.setBounds(245, 150, 125, 30);
panelConvert11b.add(textFieldConvert11b);
frame.add(panelConvert11b);
panelConvert11b.setVisible(false);

panelConvert12b.setBounds(370, 150, 125, 30);
panelConvert12b.add(textFieldConvert12b);
frame.add(panelConvert12b);
panelConvert12b.setVisible(false);

panelConvert13b.setBounds(245, 180, 125, 30);
buttonConvert13b.addActionListener(this);
panelConvert13b.add(buttonConvert13b);
frame.add(panelConvert13b);
panelConvert13b.setVisible(false);

panelConvert14b.setBounds(370, 180, 125, 30);
buttonConvert14b.addActionListener(this);
panelConvert14b.add(buttonConvert14b);
frame.add(panelConvert14b);
panelConvert14b.setVisible(false);


//&&& Convert c &&&
panelConvert1c.setBounds(250, 0, 125, 30);
panelConvert1c.setLayout(new BorderLayout());
panelConvert1c.add(labelConvert1c);
frame.add(panelConvert1c);
panelConvert1c.setVisible(false);

panelConvert2c.setBounds(375, 0, 125, 30);
panelConvert2c.setLayout(new BorderLayout());
panelConvert2c.add(labelConvert2c);
frame.add(panelConvert2c);
panelConvert2c.setVisible(false);

panelConvert3c.setBounds(245, 30, 125, 30);
panelConvert3c.setLayout(new BorderLayout());
radioButtonConvert3c.addActionListener(this);
panelConvert3c.add(radioButtonConvert3c);
radioButtonGroupConvertImperialc.add(radioButtonConvert3c);
frame.add(panelConvert3c);
panelConvert3c.setVisible(false);

panelConvert4c.setBounds(370, 30, 125, 30);
panelConvert4c.setLayout(new BorderLayout());
radioButtonConvert4c.addActionListener(this);
panelConvert4c.add(radioButtonConvert4c);
radioButtonGroupConvertMetricc.add(radioButtonConvert4c);
frame.add(panelConvert4c);
panelConvert4c.setVisible(false);

panelConvert5c.setBounds(245, 60, 125, 30);
panelConvert5c.setLayout(new BorderLayout());
radioButtonConvert5c.addActionListener(this);
panelConvert5c.add(radioButtonConvert5c);
radioButtonGroupConvertImperialc.add(radioButtonConvert5c);
frame.add(panelConvert5c);
panelConvert5c.setVisible(false);

panelConvert6c.setBounds(370, 60, 125, 30);
panelConvert6c.setLayout(new BorderLayout());
radioButtonConvert6c.addActionListener(this);
panelConvert6c.add(radioButtonConvert6c);
radioButtonGroupConvertMetricc.add(radioButtonConvert6c);
frame.add(panelConvert6c);
panelConvert6c.setVisible(false);

panelConvert7c.setBounds(245, 90, 125, 30);
panelConvert7c.setLayout(new BorderLayout());
radioButtonConvert7c.addActionListener(this);
panelConvert7c.add(radioButtonConvert7c);
radioButtonGroupConvertImperialc.add(radioButtonConvert7c);
frame.add(panelConvert7c);
panelConvert7c.setVisible(false);

panelConvert8c.setBounds(370, 90, 125, 30);
panelConvert8c.setLayout(new BorderLayout());
radioButtonConvert8c.addActionListener(this);
panelConvert8c.add(radioButtonConvert8c);
radioButtonGroupConvertMetricc.add(radioButtonConvert8c);
frame.add(panelConvert8c);
panelConvert8c.setVisible(false);

panelConvert9c.setBounds(245, 120, 125, 30);
panelConvert9c.add(textFieldConvert9c);
frame.add(panelConvert9c);
panelConvert9c.setVisible(false);

panelConvert10c.setBounds(370, 120, 125, 30);
panelConvert10c.add(textFieldConvert10c);
frame.add(panelConvert10c);
panelConvert10c.setVisible(false);

panelConvert11c.setBounds(245, 150, 125, 30);
buttonConvert11c.addActionListener(this);
panelConvert11c.add(buttonConvert11c);
frame.add(panelConvert11c);
panelConvert11c.setVisible(false);

panelConvert12c.setBounds(375, 150, 125, 30);
buttonConvert12c.addActionListener(this);
panelConvert12c.add(buttonConvert12c);
frame.add(panelConvert12c);
panelConvert12c.setVisible(false);



//&&& Convert d &&&
panelConvert1d.setBounds(250, 0, 125, 30);
panelConvert1d.setLayout(new BorderLayout());
panelConvert1d.add(labelConvert1d);
frame.add(panelConvert1d);
panelConvert1d.setVisible(false);

panelConvert2d.setBounds(375, 0, 125, 30);
panelConvert2d.setLayout(new BorderLayout());
panelConvert2d.add(labelConvert2d);
frame.add(panelConvert2d);
panelConvert2d.setVisible(false);

panelConvert3d.setBounds(245, 30, 125, 30);
panelConvert3d.add(textFieldConvert3d);
frame.add(panelConvert3d);
panelConvert3d.setVisible(false);

panelConvert4d.setBounds(370, 30, 125, 30);
panelConvert4d.add(textFieldConvert4d);
frame.add(panelConvert4d);
panelConvert4d.setVisible(false);

panelConvert5d.setBounds(245, 60, 125, 30);
buttonConvert5d.addActionListener(this);
panelConvert5d.add(buttonConvert5d);
frame.add(panelConvert5d);
panelConvert5d.setVisible(false);

panelConvert6d.setBounds(370, 60, 125, 30);
buttonConvert6d.addActionListener(this);
panelConvert6d.add(buttonConvert6d);
frame.add(panelConvert6d);
panelConvert6d.setVisible(false);

panelConvert7d.setBounds(250, 90, 125, 30);
panelConvert7d.setLayout(new BorderLayout());
panelConvert7d.add(labelConvert7d);
frame.add(panelConvert7d);
panelConvert7d.setVisible(false);

panelConvert9d.setBounds(245, 120, 125, 30);
panelConvert9d.add(textFieldConvert9d);
frame.add(panelConvert9d);
panelConvert9d.setVisible(false);

panelConvert11d.setBounds(245, 150, 125, 30);
buttonConvert11d.addActionListener(this);
panelConvert11d.add(buttonConvert11d);
frame.add(panelConvert11d);
panelConvert11d.setVisible(false);

//&&& Convert e &&&
panelConvert1e.setBounds(250, 0, 125, 30);
panelConvert1e.setLayout(new BorderLayout());
panelConvert1e.add(labelConvert1e);
frame.add(panelConvert1e);
panelConvert1e.setVisible(false);

panelConvert2e.setBounds(375, 0, 125, 30);
panelConvert2e.setLayout(new BorderLayout());
panelConvert2e.add(labelConvert2e);
frame.add(panelConvert2e);
panelConvert2e.setVisible(false);

panelConvert3e.setBounds(245, 30, 125, 30);
panelConvert3e.setLayout(new BorderLayout());
radioButtonConvert3e.addActionListener(this);
panelConvert3e.add(radioButtonConvert3e);
radioButtonGroupConvertImperiale.add(radioButtonConvert3e);
frame.add(panelConvert3e);
panelConvert3e.setVisible(false);

panelConvert4e.setBounds(370, 30, 125, 30);
panelConvert4e.setLayout(new BorderLayout());
radioButtonConvert4e.addActionListener(this);
panelConvert4e.add(radioButtonConvert4e);
radioButtonGroupConvertMetrice.add(radioButtonConvert4e);
frame.add(panelConvert4e);
panelConvert4e.setVisible(false);

panelConvert5e.setBounds(245, 60, 125, 30);
panelConvert5e.setLayout(new BorderLayout());
radioButtonConvert5e.addActionListener(this);
panelConvert5e.add(radioButtonConvert5e);
radioButtonGroupConvertImperiale.add(radioButtonConvert5e);
frame.add(panelConvert5e);
panelConvert5e.setVisible(false);

panelConvert6e.setBounds(370, 60, 125, 30);
panelConvert6e.setLayout(new BorderLayout());
radioButtonConvert6e.addActionListener(this);
panelConvert6e.add(radioButtonConvert6e);
radioButtonGroupConvertMetrice.add(radioButtonConvert6e);
frame.add(panelConvert6e);
panelConvert6e.setVisible(false);

panelConvert7e.setBounds(245, 90, 125, 30);
panelConvert7e.setLayout(new BorderLayout());
radioButtonConvert7e.addActionListener(this);
panelConvert7e.add(radioButtonConvert7e);
radioButtonGroupConvertImperiale.add(radioButtonConvert7e);
frame.add(panelConvert7e);
panelConvert7e.setVisible(false);

panelConvert8e.setBounds(370, 90, 125, 30);
panelConvert8e.setLayout(new BorderLayout());
radioButtonConvert8e.addActionListener(this);
panelConvert8e.add(radioButtonConvert8e);
radioButtonGroupConvertMetrice.add(radioButtonConvert8e);
frame.add(panelConvert8e);
panelConvert8e.setVisible(false);

panelConvert9e.setBounds(245, 120, 125, 30);
panelConvert9e.setLayout(new BorderLayout());
radioButtonConvert9e.addActionListener(this);
panelConvert9e.add(radioButtonConvert9e);
radioButtonGroupConvertImperiale.add(radioButtonConvert9e);
frame.add(panelConvert9e);
panelConvert9e.setVisible(false);

panelConvert10e.setBounds(370, 120, 125, 30);
panelConvert10e.setLayout(new BorderLayout());
radioButtonConvert10e.addActionListener(this);
panelConvert10e.add(radioButtonConvert10e);
radioButtonGroupConvertMetrice.add(radioButtonConvert10e);
frame.add(panelConvert10e);
panelConvert10e.setVisible(false);

panelConvert11e.setBounds(245, 150, 125, 30);
panelConvert11e.add(textFieldConvert11e);
frame.add(panelConvert11e);
panelConvert11e.setVisible(false);

panelConvert12e.setBounds(370, 150, 125, 30);
panelConvert12e.add(textFieldConvert12e);
frame.add(panelConvert12e);
panelConvert12e.setVisible(false);

panelConvert13e.setBounds(245, 180, 125, 30);
buttonConvert13e.addActionListener(this);
panelConvert13e.add(buttonConvert13e);
frame.add(panelConvert13e);
panelConvert13e.setVisible(false);

panelConvert14e.setBounds(370, 180, 125, 30);
buttonConvert14e.addActionListener(this);
panelConvert14e.add(buttonConvert14e);
frame.add(panelConvert14e);
panelConvert14e.setVisible(false);

//&&& Convert f &&&
panelConvert1f.setBounds(250, 0, 125, 30);
panelConvert1f.setLayout(new BorderLayout());
panelConvert1f.add(labelConvert1f);
frame.add(panelConvert1f);
panelConvert1f.setVisible(false);

panelConvert2f.setBounds(375, 0, 125, 30);
panelConvert2f.setLayout(new BorderLayout());
panelConvert2f.add(labelConvert2f);
frame.add(panelConvert2f);
panelConvert2f.setVisible(false);

panelConvert3f.setBounds(245, 30, 125, 30);
panelConvert3f.setLayout(new BorderLayout());
radioButtonConvert3f.addActionListener(this);
panelConvert3f.add(radioButtonConvert3f);
radioButtonGroupConvertImperialf.add(radioButtonConvert3f);
frame.add(panelConvert3f);
panelConvert3f.setVisible(false);

panelConvert4f.setBounds(370, 30, 125, 30);
panelConvert4f.setLayout(new BorderLayout());
radioButtonConvert4f.addActionListener(this);
panelConvert4f.add(radioButtonConvert4f);
radioButtonGroupConvertMetricf.add(radioButtonConvert4f);
frame.add(panelConvert4f);
panelConvert4f.setVisible(false);

panelConvert5f.setBounds(245, 60, 125, 30);
panelConvert5f.setLayout(new BorderLayout());
radioButtonConvert5f.addActionListener(this);
panelConvert5f.add(radioButtonConvert5f);
radioButtonGroupConvertImperialf.add(radioButtonConvert5f);
frame.add(panelConvert5f);
panelConvert5f.setVisible(false);

panelConvert6f.setBounds(370, 60, 125, 30);
panelConvert6f.setLayout(new BorderLayout());
radioButtonConvert6f.addActionListener(this);
panelConvert6f.add(radioButtonConvert6f);
radioButtonGroupConvertMetricf.add(radioButtonConvert6f);
frame.add(panelConvert6f);
panelConvert6f.setVisible(false);

panelConvert7f.setBounds(245, 90, 125, 30);
panelConvert7f.setLayout(new BorderLayout());
radioButtonConvert7f.addActionListener(this);
panelConvert7f.add(radioButtonConvert7f);
radioButtonGroupConvertImperialf.add(radioButtonConvert7f);
frame.add(panelConvert7f);
panelConvert7f.setVisible(false);

panelConvert8f.setBounds(370, 90, 125, 30);
panelConvert8f.setLayout(new BorderLayout());
radioButtonConvert8f.addActionListener(this);
panelConvert8f.add(radioButtonConvert8f);
radioButtonGroupConvertMetricf.add(radioButtonConvert8f);
frame.add(panelConvert8f);
panelConvert8f.setVisible(false);

panelConvert9f.setBounds(245, 120, 125, 30);
panelConvert9f.add(textFieldConvert9f);
frame.add(panelConvert9f);
panelConvert9f.setVisible(false);

panelConvert10f.setBounds(370, 120, 125, 30);
panelConvert10f.add(textFieldConvert10f);
frame.add(panelConvert10f);
panelConvert10f.setVisible(false);

panelConvert11f.setBounds(245, 150, 125, 30);
buttonConvert11f.addActionListener(this);
panelConvert11f.add(buttonConvert11f);
frame.add(panelConvert11f);
panelConvert11f.setVisible(false);

panelConvert12f.setBounds(375, 150, 125, 30);
buttonConvert12f.addActionListener(this);
panelConvert12f.add(buttonConvert12f);
frame.add(panelConvert12f);
panelConvert12f.setVisible(false);

//&&& Convert g &&&
panelConvert1g.setBounds(250, 0, 125, 30);
panelConvert1g.setLayout(new BorderLayout());
panelConvert1g.add(labelConvert1g);
frame.add(panelConvert1g);
panelConvert1g.setVisible(false);

panelConvert2g.setBounds(375, 0, 125, 30);
panelConvert2g.setLayout(new BorderLayout());
panelConvert2g.add(labelConvert2g);
frame.add(panelConvert2g);
panelConvert2g.setVisible(false);

panelConvert3g.setBounds(245, 30, 125, 30);
panelConvert3g.setLayout(new BorderLayout());
radioButtonConvert3g.addActionListener(this);
panelConvert3g.add(radioButtonConvert3g);
radioButtonGroupConvertImperialg.add(radioButtonConvert3g);
frame.add(panelConvert3g);
panelConvert3g.setVisible(false);

panelConvert4g.setBounds(370, 30, 125, 30);
panelConvert4g.setLayout(new BorderLayout());
radioButtonConvert4g.addActionListener(this);
panelConvert4g.add(radioButtonConvert4g);
radioButtonGroupConvertMetricg.add(radioButtonConvert4g);
frame.add(panelConvert4g);
panelConvert4g.setVisible(false);

panelConvert5g.setBounds(245, 60, 125, 30);
panelConvert5g.setLayout(new BorderLayout());
radioButtonConvert5g.addActionListener(this);
panelConvert5g.add(radioButtonConvert5g);
radioButtonGroupConvertImperialg.add(radioButtonConvert5g);
frame.add(panelConvert5g);
panelConvert5g.setVisible(false);

panelConvert6g.setBounds(370, 60, 125, 30);
panelConvert6g.setLayout(new BorderLayout());
radioButtonConvert6g.addActionListener(this);
panelConvert6g.add(radioButtonConvert6g);
radioButtonGroupConvertMetricg.add(radioButtonConvert6g);
frame.add(panelConvert6g);
panelConvert6g.setVisible(false);

panelConvert7g.setBounds(245, 90, 125, 30);
panelConvert7g.add(textFieldConvert7g);
frame.add(panelConvert7g);
panelConvert7g.setVisible(false);

panelConvert8g.setBounds(370, 90, 125, 30);
panelConvert8g.add(textFieldConvert8g);
frame.add(panelConvert8g);
panelConvert8g.setVisible(false);

panelConvert9g.setBounds(245, 120, 125, 30);
buttonConvert9g.addActionListener(this);
panelConvert9g.add(buttonConvert9g);
frame.add(panelConvert9g);
panelConvert9g.setVisible(false);

panelConvert10g.setBounds(375, 120, 125, 30);
buttonConvert10g.addActionListener(this);
panelConvert10g.add(buttonConvert10g);
frame.add(panelConvert10g);
panelConvert10g.setVisible(false);

//&&& Convert h &&&
panelConvert1h.setBounds(250, 0, 125, 30);
panelConvert1h.setLayout(new BorderLayout());
panelConvert1h.add(labelConvert1h);
frame.add(panelConvert1h);
panelConvert1h.setVisible(false);

panelConvert2h.setBounds(375, 0, 125, 30);
panelConvert2h.setLayout(new BorderLayout());
panelConvert2h.add(labelConvert2h);
frame.add(panelConvert2h);
panelConvert2h.setVisible(false);

panelConvert3h.setBounds(245, 30, 125, 30);
panelConvert3h.setLayout(new BorderLayout());
radioButtonConvert3h.addActionListener(this);
panelConvert3h.add(radioButtonConvert3h);
radioButtonGroupConvertImperialh.add(radioButtonConvert3h);
frame.add(panelConvert3h);
panelConvert3h.setVisible(false);

panelConvert4h.setBounds(370, 30, 125, 30);
panelConvert4h.setLayout(new BorderLayout());
radioButtonConvert4h.addActionListener(this);
panelConvert4h.add(radioButtonConvert4h);
radioButtonGroupConvertMetrich.add(radioButtonConvert4h);
frame.add(panelConvert4h);
panelConvert4h.setVisible(false);

panelConvert5h.setBounds(245, 60, 125, 30);
panelConvert5h.setLayout(new BorderLayout());
radioButtonConvert5h.addActionListener(this);
panelConvert5h.add(radioButtonConvert5h);
radioButtonGroupConvertImperialh.add(radioButtonConvert5h);
frame.add(panelConvert5h);
panelConvert5h.setVisible(false); 

panelConvert6h.setBounds(370, 60, 125, 30);
panelConvert6h.setLayout(new BorderLayout());
radioButtonConvert6h.addActionListener(this);
panelConvert6h.add(radioButtonConvert6h);
radioButtonGroupConvertMetrich.add(radioButtonConvert6h);
frame.add(panelConvert6h);
panelConvert6h.setVisible(false);

panelConvert7h.setBounds(245, 90, 125, 30);
panelConvert7h.setLayout(new BorderLayout());
radioButtonConvert7h.addActionListener(this);
panelConvert7h.add(radioButtonConvert7h);
radioButtonGroupConvertImperialh.add(radioButtonConvert7h);
frame.add(panelConvert7h);
panelConvert7h.setVisible(false);

panelConvert9h.setBounds(245, 120, 125, 30);
panelConvert9h.setLayout(new BorderLayout());
radioButtonConvert9h.addActionListener(this);
panelConvert9h.add(radioButtonConvert9h);
radioButtonGroupConvertImperialh.add(radioButtonConvert9h);
frame.add(panelConvert9h);
panelConvert9h.setVisible(false);

panelConvert11h.setBounds(245, 150, 125, 30);
panelConvert11h.setLayout(new BorderLayout());
radioButtonConvert11h.addActionListener(this);
panelConvert11h.add(radioButtonConvert11h);
radioButtonGroupConvertImperialh.add(radioButtonConvert11h);
frame.add(panelConvert11h);
panelConvert11h.setVisible(false);

panelConvert13h.setBounds(245, 180, 125, 30);
panelConvert13h.add(textFieldConvert13h);
frame.add(panelConvert13h);
panelConvert13h.setVisible(false);

panelConvert14h.setBounds(370, 180, 125, 30);
panelConvert14h.add(textFieldConvert14h);
frame.add(panelConvert14h);
panelConvert14h.setVisible(false);

panelConvert15h.setBounds(245, 210, 125, 30);
buttonConvert15h.addActionListener(this);
panelConvert15h.add(buttonConvert15h);
frame.add(panelConvert15h);
panelConvert15h.setVisible(false);

panelConvert16h.setBounds(375, 210, 125, 30);
buttonConvert16h.addActionListener(this);
panelConvert16h.add(buttonConvert16h);
frame.add(panelConvert16h);
panelConvert16h.setVisible(false);

//&&& Convert i &&&
panelConvert1i.setBounds(250, 0, 125, 30);
panelConvert1i.setLayout(new BorderLayout());
panelConvert1i.add(labelConvert1i);
frame.add(panelConvert1i);
panelConvert1i.setVisible(false);

panelConvert3i.setBounds(245, 30, 125, 30);
panelConvert3i.setLayout(new BorderLayout());
radioButtonConvert3i.addActionListener(this);
panelConvert3i.add(radioButtonConvert3i);
radioButtonGroupConvertMetricFirsti.add(radioButtonConvert3i);
frame.add(panelConvert3i);
panelConvert3i.setVisible(false);

panelConvert4i.setBounds(370, 30, 125, 30);
panelConvert4i.setLayout(new BorderLayout());
radioButtonConvert4i.addActionListener(this);
panelConvert4i.add(radioButtonConvert4i);
radioButtonGroupConvertMetricSecondi.add(radioButtonConvert4i);
frame.add(panelConvert4i);
panelConvert4i.setVisible(false);

panelConvert5i.setBounds(245, 60, 125, 30);
panelConvert5i.setLayout(new BorderLayout());
radioButtonConvert5i.addActionListener(this);
panelConvert5i.add(radioButtonConvert5i);
radioButtonGroupConvertMetricFirsti.add(radioButtonConvert5i);
frame.add(panelConvert5i);
panelConvert5i.setVisible(false); 

panelConvert6i.setBounds(370, 60, 125, 30);
panelConvert6i.setLayout(new BorderLayout());
radioButtonConvert6i.addActionListener(this);
panelConvert6i.add(radioButtonConvert6i);
radioButtonGroupConvertMetricSecondi.add(radioButtonConvert6i);
frame.add(panelConvert6i);
panelConvert6i.setVisible(false);

panelConvert7i.setBounds(245, 90, 125, 30);
panelConvert7i.setLayout(new BorderLayout());
radioButtonConvert7i.addActionListener(this);
panelConvert7i.add(radioButtonConvert7i);
radioButtonGroupConvertMetricFirsti.add(radioButtonConvert7i);
frame.add(panelConvert7i);
panelConvert7i.setVisible(false);

panelConvert8i.setBounds(370, 90, 125, 30);
panelConvert8i.setLayout(new BorderLayout());
radioButtonConvert8i.addActionListener(this);
panelConvert8i.add(radioButtonConvert8i);
radioButtonGroupConvertMetricSecondi.add(radioButtonConvert8i);
frame.add(panelConvert8i);
panelConvert8i.setVisible(false);

panelConvert9i.setBounds(245, 120, 125, 30);
panelConvert9i.setLayout(new BorderLayout());
radioButtonConvert9i.addActionListener(this);
panelConvert9i.add(radioButtonConvert9i);
radioButtonGroupConvertMetricFirsti.add(radioButtonConvert9i);
frame.add(panelConvert9i);
panelConvert9i.setVisible(false);

panelConvert10i.setBounds(370, 120, 125, 30);
panelConvert10i.setLayout(new BorderLayout());
radioButtonConvert10i.addActionListener(this);
panelConvert10i.add(radioButtonConvert10i);
radioButtonGroupConvertMetricSecondi.add(radioButtonConvert10i);
frame.add(panelConvert10i);
panelConvert10i.setVisible(false);

panelConvert11i.setBounds(245, 150, 125, 30);
panelConvert11i.setLayout(new BorderLayout());
radioButtonConvert11i.addActionListener(this);
panelConvert11i.add(radioButtonConvert11i);
radioButtonGroupConvertMetricFirsti.add(radioButtonConvert11i);
frame.add(panelConvert11i);
panelConvert11i.setVisible(false);

panelConvert12i.setBounds(370, 150, 125, 30);
panelConvert12i.setLayout(new BorderLayout());
radioButtonConvert12i.addActionListener(this);
panelConvert12i.add(radioButtonConvert12i);
radioButtonGroupConvertMetricSecondi.add(radioButtonConvert12i);
frame.add(panelConvert12i);
panelConvert12i.setVisible(false);

panelConvert13i.setBounds(245, 180, 125, 30);
panelConvert13i.add(textFieldConvert13i);
frame.add(panelConvert13i);
panelConvert13i.setVisible(false);

panelConvert14i.setBounds(370, 180, 125, 30);
panelConvert14i.add(textFieldConvert14i);
frame.add(panelConvert14i);
panelConvert14i.setVisible(false);

panelConvert15i.setBounds(245, 210, 125, 30);
buttonConvert15i.addActionListener(this);
panelConvert15i.add(buttonConvert15i);
frame.add(panelConvert15i);
panelConvert15i.setVisible(false);

//&&& Convert j &&&
panelConvert1j.setBounds(250, 0, 125, 30);
panelConvert1j.setLayout(new BorderLayout());
panelConvert1j.add(labelConvert1j);
frame.add(panelConvert1j);
panelConvert1j.setVisible(false);

panelConvert3j.setBounds(245, 30, 125, 30);
panelConvert3j.setLayout(new BorderLayout());
radioButtonConvert3j.addActionListener(this);
panelConvert3j.add(radioButtonConvert3j);
radioButtonGroupConvertMetricFirstj.add(radioButtonConvert3j);
frame.add(panelConvert3j);
panelConvert3j.setVisible(false);

panelConvert4j.setBounds(370, 30, 125, 30);
panelConvert4j.setLayout(new BorderLayout());
radioButtonConvert4j.addActionListener(this);
panelConvert4j.add(radioButtonConvert4j);
radioButtonGroupConvertMetricSecondj.add(radioButtonConvert4j);
frame.add(panelConvert4j);
panelConvert4j.setVisible(false);

panelConvert5j.setBounds(245, 60, 125, 30);
panelConvert5j.setLayout(new BorderLayout());
radioButtonConvert5j.addActionListener(this);
panelConvert5j.add(radioButtonConvert5j);
radioButtonGroupConvertMetricFirstj.add(radioButtonConvert5j);
frame.add(panelConvert5j);
panelConvert5j.setVisible(false); 

panelConvert6j.setBounds(370, 60, 125, 30);
panelConvert6j.setLayout(new BorderLayout());
radioButtonConvert6j.addActionListener(this);
panelConvert6j.add(radioButtonConvert6j);
radioButtonGroupConvertMetricSecondj.add(radioButtonConvert6j);
frame.add(panelConvert6j);
panelConvert6j.setVisible(false);

panelConvert7j.setBounds(245, 90, 125, 30);
panelConvert7j.setLayout(new BorderLayout());
radioButtonConvert7j.addActionListener(this);
panelConvert7j.add(radioButtonConvert7j);
radioButtonGroupConvertMetricFirstj.add(radioButtonConvert7j);
frame.add(panelConvert7j);
panelConvert7j.setVisible(false);

panelConvert8j.setBounds(370, 90, 125, 30);
panelConvert8j.setLayout(new BorderLayout());
radioButtonConvert8j.addActionListener(this);
panelConvert8j.add(radioButtonConvert8j);
radioButtonGroupConvertMetricSecondj.add(radioButtonConvert8j);
frame.add(panelConvert8j);
panelConvert8j.setVisible(false);

panelConvert9j.setBounds(245, 120, 125, 30);
panelConvert9j.setLayout(new BorderLayout());
radioButtonConvert9j.addActionListener(this);
panelConvert9j.add(radioButtonConvert9j);
radioButtonGroupConvertMetricFirstj.add(radioButtonConvert9j);
frame.add(panelConvert9j);
panelConvert9j.setVisible(false);

panelConvert10j.setBounds(370, 120, 125, 30);
panelConvert10j.setLayout(new BorderLayout());
radioButtonConvert10j.addActionListener(this);
panelConvert10j.add(radioButtonConvert10j);
radioButtonGroupConvertMetricSecondj.add(radioButtonConvert10j);
frame.add(panelConvert10j);
panelConvert10j.setVisible(false);

panelConvert11j.setBounds(245, 150, 125, 30);
panelConvert11j.add(textFieldConvert11j);
frame.add(panelConvert11j);
panelConvert11j.setVisible(false);

panelConvert12j.setBounds(370, 150, 125, 30);
panelConvert12j.add(textFieldConvert12j);
frame.add(panelConvert12j);
panelConvert12j.setVisible(false);

panelConvert13j.setBounds(245, 180, 125, 30);
buttonConvert13j.addActionListener(this);
panelConvert13j.add(buttonConvert13j);
frame.add(panelConvert13j);
panelConvert13j.setVisible(false);

//&&& Format &&&
panelFormat1.setBounds(250, 0, 125, 30);
panelFormat1.setLayout(new BorderLayout());
panelFormat1.add(labelFormat1);
frame.add(panelFormat1);
panelFormat1.setVisible(false);

panelFormat3.setBounds(120, 30, 500, 30);
panelFormat3.add(textFieldFormat3);
frame.add(panelFormat3);
textFieldFormat3.setText("0.##");
panelFormat3.setVisible(false);

panelFormat5.setBounds(245, 60, 125, 30);
buttonFormat5.addActionListener(this);
panelFormat5.add(buttonFormat5);
frame.add(panelFormat5);
panelFormat5.setVisible(false);panelFormat7.setVisible(false);panelFormat9.setVisible(false);panelFormat11.setVisible(false);panelFormat13.setVisible(false);

panelFormat7.setBounds(250, 90, 125, 30);
panelFormat7.setLayout(new BorderLayout());
panelFormat7.add(labelFormat7);
frame.add(panelFormat7);
panelFormat7.setVisible(false);

panelFormat9.setBounds(245, 120, 125, 30);
panelFormat9.setLayout(new BorderLayout());
radioButtonFormat9.addActionListener(this);
panelFormat9.add(radioButtonFormat9);
radioButtonGroupFormat.add(radioButtonFormat9);
frame.add(panelFormat9);
radioButtonFormat9.setSelected(true);
panelFormat9.setVisible(false);

panelFormat11.setBounds(245, 150, 125, 30);
panelFormat11.setLayout(new BorderLayout());
radioButtonFormat11.addActionListener(this);
panelFormat11.add(radioButtonFormat11);
radioButtonGroupFormat.add(radioButtonFormat11);
frame.add(panelFormat11);
panelFormat11.setVisible(false);

panelFormat13.setBounds(245, 180, 125, 30);
panelFormat13.setLayout(new BorderLayout());
radioButtonFormat13.addActionListener(this);
panelFormat13.add(radioButtonFormat13);
radioButtonGroupFormat.add(radioButtonFormat13);
frame.add(panelFormat13);
panelFormat13.setVisible(false);


//&&& Convert k &&&
panelConvert1k.setBounds(250, 0, 125, 30);
panelConvert1k.setLayout(new BorderLayout());
panelConvert1k.add(labelConvert1k);
frame.add(panelConvert1k);
panelConvert1k.setVisible(false);

panelConvert3k.setBounds(245, 30, 125, 30);
panelConvert3k.setLayout(new BorderLayout());
radioButtonConvert3k.addActionListener(this);
panelConvert3k.add(radioButtonConvert3k);
radioButtonGroupConvertMetricFirstk.add(radioButtonConvert3k);
frame.add(panelConvert3k);
panelConvert3k.setVisible(false);

panelConvert4k.setBounds(370, 30, 125, 30);
panelConvert4k.setLayout(new BorderLayout());
radioButtonConvert4k.addActionListener(this);
panelConvert4k.add(radioButtonConvert4k);
radioButtonGroupConvertMetricSecondk.add(radioButtonConvert4k);
frame.add(panelConvert4k);
panelConvert4k.setVisible(false);

panelConvert5k.setBounds(245, 60, 125, 30);
panelConvert5k.setLayout(new BorderLayout());
radioButtonConvert5k.addActionListener(this);
panelConvert5k.add(radioButtonConvert5k);
radioButtonGroupConvertMetricFirstk.add(radioButtonConvert5k);
frame.add(panelConvert5k);
panelConvert5k.setVisible(false); 

panelConvert6k.setBounds(370, 60, 125, 30);
panelConvert6k.setLayout(new BorderLayout());
radioButtonConvert6k.addActionListener(this);
panelConvert6k.add(radioButtonConvert6k);
radioButtonGroupConvertMetricSecondk.add(radioButtonConvert6k);
frame.add(panelConvert6k);
panelConvert6k.setVisible(false);

panelConvert7k.setBounds(245, 90, 125, 30);
panelConvert7k.setLayout(new BorderLayout());
radioButtonConvert7k.addActionListener(this);
panelConvert7k.add(radioButtonConvert7k);
radioButtonGroupConvertMetricFirstk.add(radioButtonConvert7k);
frame.add(panelConvert7k);
panelConvert7k.setVisible(false);

panelConvert8k.setBounds(370, 90, 125, 30);
panelConvert8k.setLayout(new BorderLayout());
radioButtonConvert8k.addActionListener(this);
panelConvert8k.add(radioButtonConvert8k);
radioButtonGroupConvertMetricSecondk.add(radioButtonConvert8k);
frame.add(panelConvert8k);
panelConvert8k.setVisible(false);

panelConvert9k.setBounds(245, 120, 125, 30);
panelConvert9k.setLayout(new BorderLayout());
radioButtonConvert9k.addActionListener(this);
panelConvert9k.add(radioButtonConvert9k);
radioButtonGroupConvertMetricFirstk.add(radioButtonConvert9k);
frame.add(panelConvert9k);
panelConvert9k.setVisible(false);

panelConvert10k.setBounds(370, 120, 125, 30);
panelConvert10k.setLayout(new BorderLayout());
radioButtonConvert10k.addActionListener(this);
panelConvert10k.add(radioButtonConvert10k);
radioButtonGroupConvertMetricSecondk.add(radioButtonConvert10k);
frame.add(panelConvert10k);
panelConvert10k.setVisible(false);

panelConvert11k.setBounds(245, 150, 125, 30);
panelConvert11k.setLayout(new BorderLayout());
radioButtonConvert11k.addActionListener(this);
panelConvert11k.add(radioButtonConvert11k);
radioButtonGroupConvertMetricFirstk.add(radioButtonConvert11k);
frame.add(panelConvert11k);
panelConvert11k.setVisible(false);

panelConvert12k.setBounds(370, 150, 125, 30);
panelConvert12k.setLayout(new BorderLayout());
radioButtonConvert12k.addActionListener(this);
panelConvert12k.add(radioButtonConvert12k);
radioButtonGroupConvertMetricSecondk.add(radioButtonConvert12k);
frame.add(panelConvert12k);
panelConvert12k.setVisible(false);

panelConvert13k.setBounds(245, 180, 125, 30);
panelConvert13k.setLayout(new BorderLayout());
radioButtonConvert13k.addActionListener(this);
panelConvert13k.add(radioButtonConvert13k);
radioButtonGroupConvertMetricFirstk.add(radioButtonConvert13k);
frame.add(panelConvert13k);
panelConvert13k.setVisible(false);

panelConvert14k.setBounds(370, 180, 125, 30);
panelConvert14k.setLayout(new BorderLayout());
radioButtonConvert14k.addActionListener(this);
panelConvert14k.add(radioButtonConvert14k);
radioButtonGroupConvertMetricSecondk.add(radioButtonConvert14k);
frame.add(panelConvert14k);
panelConvert14k.setVisible(false);

panelConvert15k.setBounds(245, 210, 125, 30);
panelConvert15k.add(textFieldConvert15k);
frame.add(panelConvert15k);
panelConvert15k.setVisible(false);

panelConvert16k.setBounds(370, 210, 125, 30);
panelConvert16k.add(textFieldConvert16k);
frame.add(panelConvert16k);
panelConvert16k.setVisible(false);

panelConvert17k.setBounds(245, 240, 125, 30);
buttonConvert17k.addActionListener(this);
panelConvert17k.add(buttonConvert17k);
frame.add(panelConvert17k);
panelConvert17k.setVisible(false);


//&&& Convert L &&&
panelConvert1l.setBounds(250, 0, 125, 30);
panelConvert1l.setLayout(new BorderLayout());
panelConvert1l.add(labelConvert1l);
frame.add(panelConvert1l);
panelConvert1l.setVisible(false);

panelConvert2l.setBounds(375, 0, 125, 30);
panelConvert2l.setLayout(new BorderLayout());
panelConvert2l.add(labelConvert2l);
frame.add(panelConvert2l);
panelConvert2l.setVisible(false);

panelConvert3l.setBounds(245, 30, 125, 30);
panelConvert3l.setLayout(new BorderLayout());
radioButtonConvert3l.addActionListener(this);
panelConvert3l.add(radioButtonConvert3l);
radioButtonGroupConvertUnitl.add(radioButtonConvert3l);
frame.add(panelConvert3l);
panelConvert3l.setVisible(false);

panelConvert4l.setBounds(370, 30, 125, 30);
panelConvert4l.setLayout(new BorderLayout());
radioButtonConvert4l.addActionListener(this);
panelConvert4l.add(radioButtonConvert4l);
frame.add(panelConvert4l);
radioButtonConvert4l.setSelected(true);
panelConvert4l.setVisible(false);

panelConvert5l.setBounds(245, 60, 125, 30);
panelConvert5l.setLayout(new BorderLayout());
radioButtonConvert5l.addActionListener(this);
panelConvert5l.add(radioButtonConvert5l);
radioButtonGroupConvertUnitl.add(radioButtonConvert5l);
frame.add(panelConvert5l);
panelConvert5l.setVisible(false);

panelConvert6l.setBounds(375, 60, 125, 30);
panelConvert6l.setLayout(new BorderLayout());
panelConvert6l.add(labelConvert6l);
frame.add(panelConvert6l);
panelConvert6l.setVisible(false);

panelConvert7l.setBounds(245, 90, 125, 30);
panelConvert7l.setLayout(new BorderLayout());
radioButtonConvert7l.addActionListener(this);
panelConvert7l.add(radioButtonConvert7l);
radioButtonGroupConvertUnitl.add(radioButtonConvert7l);
frame.add(panelConvert7l);
panelConvert7l.setVisible(false);

panelConvert8l.setBounds(370, 90, 125, 30);
panelConvert8l.add(textFieldConvert8l);
frame.add(panelConvert8l);
textFieldConvert8l.setText("96");
panelConvert8l.setVisible(false);

panelConvert9l.setBounds(245, 120, 125, 30);
panelConvert9l.setLayout(new BorderLayout());
radioButtonConvert9l.addActionListener(this);
panelConvert9l.add(radioButtonConvert9l);
radioButtonGroupConvertUnitl.add(radioButtonConvert9l);
frame.add(panelConvert9l);
panelConvert9l.setVisible(false);

panelConvert11l.setBounds(245, 150, 125, 30);
panelConvert11l.add(textFieldConvert11l);
frame.add(panelConvert11l);
panelConvert11l.setVisible(false);

panelConvert12l.setBounds(370, 150, 125, 30);
panelConvert12l.add(textFieldConvert12l);
frame.add(panelConvert12l);
panelConvert12l.setVisible(false);

panelConvert13l.setBounds(245, 180, 125, 30);
buttonConvert13l.addActionListener(this);
panelConvert13l.add(buttonConvert13l);
frame.add(panelConvert13l);
panelConvert13l.setVisible(false);

panelConvert14l.setBounds(375, 180, 125, 30);
buttonConvert14l.addActionListener(this);
panelConvert14l.add(buttonConvert14l);
frame.add(panelConvert14l);
panelConvert14l.setVisible(false);
}


//Main
public static void main(String[] args) {
new calculator();
}


//Event handler
@Override
public void actionPerformed(ActionEvent e) {

//$$$ Select square $$$
if (e.getSource() == select2D) {
//Vis on
choosePanel2D.setVisible(true);

//Vis off
choosePanelConvert.setVisible(false);
choosePanelNotebox.setVisible(false);
choosePanel3D.setVisible(false);
}

if (e.getSource() == select3D) {
//Vis on
choosePanel3D.setVisible(true);

//Vis off
choosePanelConvert.setVisible(false);
choosePanelNotebox.setVisible(false);
choosePanel2D.setVisible(false);
}

//$$$ Select convert $$$
if (e.getSource() == selectConvert) {
//Vis on
choosePanelConvert.setVisible(true);

//Vis off
choosePanel2D.setVisible(false);
choosePanelNotebox.setVisible(false);
choosePanelTriangle.setVisible(false);
choosePanel3D.setVisible(false);
}

//$$$ Select Notebox $$$
if (e.getSource() == selectNotebox) {
//Vis on
choosePanelNotebox.setVisible(true);

//Vis off
choosePanel2D.setVisible(false);
choosePanelConvert.setVisible(false);
choosePanel3D.setVisible(false);
}

//$$$$$$$$ Choose notebox 1-5 $$$$$$$$
if (e.getSource() == chooseNotebox1) {
//Vis on
notePanel1.setVisible(true);

//Vis off
notePanel2.setVisible(false);
notePanel3.setVisible(false);
notePanel4.setVisible(false);
notePanel5.setVisible(false);
}
if (e.getSource() == chooseNotebox2) {
//Vis on
notePanel2.setVisible(true);

//Vis off
notePanel1.setVisible(false);
notePanel3.setVisible(false);
notePanel4.setVisible(false);
notePanel5.setVisible(false);
}
if (e.getSource() == chooseNotebox3) {
//Vis on
notePanel3.setVisible(true);

//Vis off
notePanel1.setVisible(false);
notePanel2.setVisible(false);
notePanel4.setVisible(false);
notePanel5.setVisible(false);
}
if (e.getSource() == chooseNotebox4) {
//Vis on
notePanel4.setVisible(true);

//Vis off
notePanel1.setVisible(false);
notePanel2.setVisible(false);
notePanel3.setVisible(false);
notePanel5.setVisible(false);
}
if (e.getSource() == chooseNotebox5) {
//Vis on
notePanel5.setVisible(true);

//Vis off
notePanel1.setVisible(false);
notePanel2.setVisible(false);
notePanel3.setVisible(false);
notePanel4.setVisible(false);
}


//################ Calculate triangle scalene area ################
if (e.getSource() == buttonTriangle34a) {
//Sides
stringTriangle4a = textFieldTriangle4a.getText();
if (!textFieldTriangle4a.getText().isEmpty()) doubleTriangle4a = Double.parseDouble(stringTriangle4a);
stringTriangle5a = textFieldTriangle5a.getText();
if (!textFieldTriangle5a.getText().isEmpty()) doubleTriangle5a = Double.parseDouble(stringTriangle5a);
stringTriangle6a = textFieldTriangle6a.getText();
if (!textFieldTriangle6a.getText().isEmpty()) doubleTriangle6a = Double.parseDouble(stringTriangle6a);

//Angles
stringTriangle13a = textFieldTriangle13a.getText();
if (!textFieldTriangle13a.getText().isEmpty()) doubleTriangle13a = Double.parseDouble(stringTriangle13a);
stringTriangle14a = textFieldTriangle14a.getText();
if (!textFieldTriangle14a.getText().isEmpty()) doubleTriangle14a = Double.parseDouble(stringTriangle14a);
stringTriangle15a = textFieldTriangle15a.getText();
if (!textFieldTriangle15a.getText().isEmpty()) doubleTriangle15a = Double.parseDouble(stringTriangle15a);

//Heights
stringTriangle22a = textFieldTriangle22a.getText();
if (!textFieldTriangle22a.getText().isEmpty()) doubleTriangle22a = Double.parseDouble(stringTriangle22a);
stringTriangle23a = textFieldTriangle23a.getText();
if (!textFieldTriangle23a.getText().isEmpty()) doubleTriangle23a = Double.parseDouble(stringTriangle23a);
stringTriangle24a = textFieldTriangle24a.getText();
if (!textFieldTriangle24a.getText().isEmpty()) doubleTriangle24a = Double.parseDouble(stringTriangle24a);

//Calculation

//Knowing all sides
if (!textFieldTriangle4a.getText().isEmpty() && !textFieldTriangle5a.getText().isEmpty() && !textFieldTriangle6a.getText().isEmpty()) {
doubleTriangle31a = 0.25 * Math.sqrt((doubleTriangle4a + doubleTriangle5a + doubleTriangle6a) * (-doubleTriangle4a + doubleTriangle5a + doubleTriangle6a) * (doubleTriangle4a - doubleTriangle5a + doubleTriangle6a) * (doubleTriangle4a + doubleTriangle5a - doubleTriangle6a));
textFieldTriangle31a.setText(String.valueOf(decimalFormat.format(doubleTriangle31a)));
}

//Knowing base and height
else if (!textFieldTriangle4a.getText().isEmpty() && !textFieldTriangle22a.getText().isEmpty()) {
doubleTriangle31a = 0.5 * doubleTriangle4a * doubleTriangle22a;
textFieldTriangle31a.setText(String.valueOf(decimalFormat.format(doubleTriangle31a)));}
else if (!textFieldTriangle5a.getText().isEmpty() && !textFieldTriangle23a.getText().isEmpty()) {
doubleTriangle31a = 0.5 * doubleTriangle5a * doubleTriangle23a;
textFieldTriangle31a.setText(String.valueOf(decimalFormat.format(doubleTriangle31a)));}
else if (!textFieldTriangle6a.getText().isEmpty() && !textFieldTriangle24a.getText().isEmpty()) {
doubleTriangle31a = 0.5 * doubleTriangle6a * doubleTriangle24a;
textFieldTriangle31a.setText(String.valueOf(decimalFormat.format(doubleTriangle31a)));
}

//Knowing 2 sides and angle between
else if (!textFieldTriangle4a.getText().isEmpty() && !textFieldTriangle5a.getText().isEmpty()&& !textFieldTriangle15a.getText().isEmpty()) {
doubleTriangle31a = 0.5 * doubleTriangle4a * doubleTriangle5a * Math.sin(Math.toRadians(doubleTriangle15a));
textFieldTriangle31a.setText(String.valueOf(decimalFormat.format(doubleTriangle31a)));
} else if (!textFieldTriangle5a.getText().isEmpty() && !textFieldTriangle6a.getText().isEmpty()&& !textFieldTriangle13a.getText().isEmpty()) {
doubleTriangle31a = 0.5 * doubleTriangle5a * doubleTriangle6a * Math.sin(Math.toRadians(doubleTriangle13a));
textFieldTriangle31a.setText(String.valueOf(decimalFormat.format(doubleTriangle31a)));
} else if (!textFieldTriangle4a.getText().isEmpty() && !textFieldTriangle5a.getText().isEmpty()&& !textFieldTriangle14a.getText().isEmpty()) {
doubleTriangle31a = 0.5 * doubleTriangle4a * doubleTriangle5a * Math.sin(Math.toRadians(doubleTriangle14a));
textFieldTriangle31a.setText(String.valueOf(decimalFormat.format(doubleTriangle31a)));
}

//Knowing 2 sides and angle between
else if (!textFieldTriangle4a.getText().isEmpty() && !textFieldTriangle14a.getText().isEmpty() && !textFieldTriangle15a.getText().isEmpty()) {
doubleTriangle31a = doubleTriangle4a * doubleTriangle4a * Math.sin(Math.toRadians(doubleTriangle14a)) * Math.sin(Math.toRadians(doubleTriangle15a)) / (2 * Math.sin(Math.toRadians(doubleTriangle14a + doubleTriangle15a)));
textFieldTriangle31a.setText(String.valueOf(decimalFormat.format(doubleTriangle31a)));
}
else if (!textFieldTriangle5a.getText().isEmpty() && !textFieldTriangle15a.getText().isEmpty() && !textFieldTriangle13a.getText().isEmpty()) {
doubleTriangle31a = doubleTriangle5a * doubleTriangle5a * Math.sin(Math.toRadians(doubleTriangle15a)) * Math.sin(Math.toRadians(doubleTriangle13a)) / (2 * Math.sin(Math.toRadians(doubleTriangle15a + doubleTriangle13a)));
textFieldTriangle31a.setText(String.valueOf(decimalFormat.format(doubleTriangle31a)));
}
else if (!textFieldTriangle6a.getText().isEmpty() && !textFieldTriangle14a.getText().isEmpty() && !textFieldTriangle15a.getText().isEmpty()) {
doubleTriangle31a = doubleTriangle6a * doubleTriangle6a * Math.sin(Math.toRadians(doubleTriangle14a)) * Math.sin(Math.toRadians(doubleTriangle15a)) / (2 * Math.sin(Math.toRadians(doubleTriangle14a + doubleTriangle15a)));
textFieldTriangle31a.setText(String.valueOf(decimalFormat.format(doubleTriangle31a)));
}

//If an angle is right knowing 2 sides
else if (!textFieldTriangle4a.getText().isEmpty() &&  !textFieldTriangle5a.getText().isEmpty() && (doubleTriangle15a == 90)) {
doubleTriangle31a = 0.5 * doubleTriangle4a * doubleTriangle5a;
textFieldTriangle31a.setText(String.valueOf(decimalFormat.format(doubleTriangle31a)));
}
else if (!textFieldTriangle5a.getText().isEmpty() &&  !textFieldTriangle6a.getText().isEmpty() && (doubleTriangle13a == 90)) {
doubleTriangle31a = 0.5 * doubleTriangle5a * doubleTriangle6a;
textFieldTriangle31a.setText(String.valueOf(decimalFormat.format(doubleTriangle31a)));
}
else if (!textFieldTriangle4a.getText().isEmpty() &&  !textFieldTriangle6a.getText().isEmpty() && (doubleTriangle14a == 90)) {
doubleTriangle31a = 0.5 * doubleTriangle4a * doubleTriangle6a;
textFieldTriangle31a.setText(String.valueOf(decimalFormat.format(doubleTriangle31a)));
}

//If an angle is right knowing 1 side and hypotenuse
else if (!textFieldTriangle5a.getText().isEmpty() &&  !textFieldTriangle6a.getText().isEmpty() && (doubleTriangle15a == 90)) {
doubleTriangle31a = 0.5 * doubleTriangle5a * Math.sqrt((doubleTriangle6a * doubleTriangle6a) - (doubleTriangle5a * doubleTriangle5a));
textFieldTriangle31a.setText(String.valueOf(decimalFormat.format(doubleTriangle31a)));
}
else if (!textFieldTriangle6a.getText().isEmpty() &&  !textFieldTriangle4a.getText().isEmpty() && (doubleTriangle15a == 90)) {
doubleTriangle31a = 0.5 * doubleTriangle6a * Math.sqrt((doubleTriangle4a * doubleTriangle4a) - (doubleTriangle6a * doubleTriangle6a));
textFieldTriangle31a.setText(String.valueOf(decimalFormat.format(doubleTriangle31a)));
}
else if (!textFieldTriangle4a.getText().isEmpty() &&  !textFieldTriangle5a.getText().isEmpty() && (doubleTriangle14a == 90)) {
doubleTriangle31a = 0.5 * doubleTriangle4a * Math.sqrt((doubleTriangle5a * doubleTriangle5a) - (doubleTriangle4a * doubleTriangle4a));
textFieldTriangle31a.setText(String.valueOf(decimalFormat.format(doubleTriangle31a)));
}

}

//################ Calculate triangle scalene height 1 ################
if (e.getSource() == buttonTriangle25a) {
//Sides
stringTriangle4a = textFieldTriangle4a.getText();
if (!textFieldTriangle4a.getText().isEmpty()) doubleTriangle4a = Double.parseDouble(stringTriangle4a);
stringTriangle5a = textFieldTriangle5a.getText();
if (!textFieldTriangle5a.getText().isEmpty()) doubleTriangle5a = Double.parseDouble(stringTriangle5a);
stringTriangle6a = textFieldTriangle6a.getText();
if (!textFieldTriangle6a.getText().isEmpty()) doubleTriangle6a = Double.parseDouble(stringTriangle6a);

//Angles
stringTriangle13a = textFieldTriangle13a.getText();
if (!textFieldTriangle13a.getText().isEmpty()) doubleTriangle13a = Double.parseDouble(stringTriangle13a);
stringTriangle14a = textFieldTriangle14a.getText();
if (!textFieldTriangle14a.getText().isEmpty()) doubleTriangle14a = Double.parseDouble(stringTriangle14a);
stringTriangle15a = textFieldTriangle15a.getText();
if (!textFieldTriangle15a.getText().isEmpty()) doubleTriangle15a = Double.parseDouble(stringTriangle15a);


//Area
stringTriangle31a = textFieldTriangle31a.getText();
if (!textFieldTriangle31a.getText().isEmpty()) doubleTriangle31a = Double.parseDouble(stringTriangle31a);

//Calculation

if (!textFieldTriangle31a.getText().isEmpty() && !textFieldTriangle4a.getText().isEmpty()) {
doubleTriangle22a = (2 * doubleTriangle31a) / doubleTriangle4a;
textFieldTriangle22a.setText(String.valueOf(decimalFormat.format(doubleTriangle22a)));
}
else if (!textFieldTriangle4a.getText().isEmpty() && !textFieldTriangle5a.getText().isEmpty() && !textFieldTriangle6a.getText().isEmpty()) {
doubleTriangle22a = 0.5 * Math.sqrt((doubleTriangle4a + doubleTriangle5a + doubleTriangle6a) * (- doubleTriangle4a  + doubleTriangle5a + doubleTriangle6a) * ( doubleTriangle4a - doubleTriangle5a + doubleTriangle6a) * (doubleTriangle4a + doubleTriangle5a - doubleTriangle6a)) / doubleTriangle4a;
textFieldTriangle22a.setText(String.valueOf(decimalFormat.format(doubleTriangle22a)));
}
}

//################ Calculate triangle scalene height 2 ################
if (e.getSource() == buttonTriangle26a) {
//Sides
stringTriangle4a = textFieldTriangle4a.getText();
if (!textFieldTriangle4a.getText().isEmpty()) doubleTriangle4a = Double.parseDouble(stringTriangle4a);
stringTriangle5a = textFieldTriangle5a.getText();
if (!textFieldTriangle5a.getText().isEmpty()) doubleTriangle5a = Double.parseDouble(stringTriangle5a);
stringTriangle6a = textFieldTriangle6a.getText();
if (!textFieldTriangle6a.getText().isEmpty()) doubleTriangle6a = Double.parseDouble(stringTriangle6a);

//Area
stringTriangle31a = textFieldTriangle31a.getText();
if (!textFieldTriangle31a.getText().isEmpty()) doubleTriangle31a = Double.parseDouble(stringTriangle31a);

//Calculation

if (!textFieldTriangle31a.getText().isEmpty() && !textFieldTriangle5a.getText().isEmpty()) {
doubleTriangle23a = (2 * doubleTriangle31a) / doubleTriangle5a;
textFieldTriangle23a.setText(String.valueOf(decimalFormat.format(doubleTriangle23a)));
}
else if (!textFieldTriangle4a.getText().isEmpty() && !textFieldTriangle5a.getText().isEmpty() && !textFieldTriangle6a.getText().isEmpty()) {
doubleTriangle23a = 0.5 * Math.sqrt((doubleTriangle4a + doubleTriangle5a + doubleTriangle6a) * (- doubleTriangle4a  + doubleTriangle5a + doubleTriangle6a) * ( doubleTriangle4a - doubleTriangle5a + doubleTriangle6a) * (doubleTriangle4a + doubleTriangle5a - doubleTriangle6a)) / doubleTriangle5a;
textFieldTriangle23a.setText(String.valueOf(decimalFormat.format(doubleTriangle23a)));
}


}

//################ Calculate triangle scalene height 3 ################
if (e.getSource() == buttonTriangle27a) {
//Sides
stringTriangle4a = textFieldTriangle4a.getText();
if (!textFieldTriangle4a.getText().isEmpty()) doubleTriangle4a = Double.parseDouble(stringTriangle4a);
stringTriangle5a = textFieldTriangle5a.getText();
if (!textFieldTriangle5a.getText().isEmpty()) doubleTriangle5a = Double.parseDouble(stringTriangle5a);
stringTriangle6a = textFieldTriangle6a.getText();
if (!textFieldTriangle6a.getText().isEmpty()) doubleTriangle6a = Double.parseDouble(stringTriangle6a);

//Area
stringTriangle31a = textFieldTriangle31a.getText();
if (!textFieldTriangle31a.getText().isEmpty()) doubleTriangle31a = Double.parseDouble(stringTriangle31a);

//Calculation

if (!textFieldTriangle31a.getText().isEmpty() && !textFieldTriangle6a.getText().isEmpty()) {
doubleTriangle24a = (2 * doubleTriangle31a) / doubleTriangle6a;
textFieldTriangle24a.setText(String.valueOf(decimalFormat.format(doubleTriangle24a)));
}
else if (!textFieldTriangle4a.getText().isEmpty() && !textFieldTriangle5a.getText().isEmpty() && !textFieldTriangle6a.getText().isEmpty()) {
doubleTriangle24a = 0.5 * Math.sqrt((doubleTriangle4a + doubleTriangle5a + doubleTriangle6a) * (- doubleTriangle4a  + doubleTriangle5a + doubleTriangle6a) * ( doubleTriangle4a - doubleTriangle5a + doubleTriangle6a) * (doubleTriangle4a + doubleTriangle5a - doubleTriangle6a)) / doubleTriangle6a;
textFieldTriangle24a.setText(String.valueOf(decimalFormat.format(doubleTriangle24a)));
}
}

//################ Calculate triangle scalene side 1 ################
if (e.getSource() == buttonTriangle7a) {
//Sides
stringTriangle4a = textFieldTriangle4a.getText();
if (!textFieldTriangle4a.getText().isEmpty()) doubleTriangle4a = Double.parseDouble(stringTriangle4a);
stringTriangle5a = textFieldTriangle5a.getText();
if (!textFieldTriangle5a.getText().isEmpty()) doubleTriangle5a = Double.parseDouble(stringTriangle5a);
stringTriangle6a = textFieldTriangle6a.getText();
if (!textFieldTriangle6a.getText().isEmpty()) doubleTriangle6a = Double.parseDouble(stringTriangle6a);

//Angles
stringTriangle13a = textFieldTriangle13a.getText();
if (!textFieldTriangle13a.getText().isEmpty()) doubleTriangle13a = Double.parseDouble(stringTriangle13a);
stringTriangle14a = textFieldTriangle14a.getText();
if (!textFieldTriangle14a.getText().isEmpty()) doubleTriangle14a = Double.parseDouble(stringTriangle14a);
stringTriangle15a = textFieldTriangle15a.getText();
if (!textFieldTriangle15a.getText().isEmpty()) doubleTriangle15a = Double.parseDouble(stringTriangle15a);

//Heights
stringTriangle22a = textFieldTriangle22a.getText();
if (!textFieldTriangle22a.getText().isEmpty()) doubleTriangle22a = Double.parseDouble(stringTriangle22a);
stringTriangle23a = textFieldTriangle23a.getText();
if (!textFieldTriangle23a.getText().isEmpty()) doubleTriangle23a = Double.parseDouble(stringTriangle23a);
stringTriangle24a = textFieldTriangle24a.getText();
if (!textFieldTriangle24a.getText().isEmpty()) doubleTriangle24a = Double.parseDouble(stringTriangle24a);

//Area
stringTriangle31a = textFieldTriangle31a.getText();
if (!textFieldTriangle31a.getText().isEmpty()) doubleTriangle31a = Double.parseDouble(stringTriangle31a);

//Calculation
if (!textFieldTriangle31a.getText().isEmpty() && !textFieldTriangle22a.getText().isEmpty()) {
doubleTriangle4a = doubleTriangle31a / (0.5 * doubleTriangle22a);
textFieldTriangle4a.setText(String.valueOf(decimalFormat.format(doubleTriangle4a)));
}
else if (!textFieldTriangle31a.getText().isEmpty() && !textFieldTriangle5a.getText().isEmpty() && !textFieldTriangle15a.getText().isEmpty()) {
doubleTriangle4a = doubleTriangle31a / (0.5 * doubleTriangle5a  * Math.sin(Math.toRadians(doubleTriangle15a)));
textFieldTriangle4a.setText(String.valueOf(decimalFormat.format(doubleTriangle4a)));
}
else if (!textFieldTriangle31a.getText().isEmpty() && !textFieldTriangle6a.getText().isEmpty() && !textFieldTriangle14a.getText().isEmpty()) {
doubleTriangle4a = doubleTriangle31a / (0.5 * doubleTriangle6a  * Math.sin(Math.toRadians(doubleTriangle14a)));
textFieldTriangle4a.setText(String.valueOf(decimalFormat.format(doubleTriangle4a)));
}
else if (!textFieldTriangle31a.getText().isEmpty() && !textFieldTriangle15a.getText().isEmpty() && !textFieldTriangle14a.getText().isEmpty()) {
doubleTriangle4a = Math.sqrt((2 * doubleTriangle31a * Math.sin(Math.toRadians(doubleTriangle14a + doubleTriangle15a))) / (Math.sin(Math.toRadians(doubleTriangle14a)) * Math.sin(Math.toRadians(doubleTriangle15a))));
textFieldTriangle4a.setText(String.valueOf(decimalFormat.format(doubleTriangle4a)));
}

}


//################ Calculate triangle scalene side 2 ################
if (e.getSource() == buttonTriangle8a) {
//Sides
stringTriangle4a = textFieldTriangle4a.getText();
if (!textFieldTriangle4a.getText().isEmpty()) doubleTriangle4a = Double.parseDouble(stringTriangle4a);
stringTriangle5a = textFieldTriangle5a.getText();
if (!textFieldTriangle5a.getText().isEmpty()) doubleTriangle5a = Double.parseDouble(stringTriangle5a);
stringTriangle6a = textFieldTriangle6a.getText();
if (!textFieldTriangle6a.getText().isEmpty()) doubleTriangle6a = Double.parseDouble(stringTriangle6a);

//Angles
stringTriangle13a = textFieldTriangle13a.getText();
if (!textFieldTriangle13a.getText().isEmpty()) doubleTriangle13a = Double.parseDouble(stringTriangle13a);
stringTriangle14a = textFieldTriangle14a.getText();
if (!textFieldTriangle14a.getText().isEmpty()) doubleTriangle14a = Double.parseDouble(stringTriangle14a);
stringTriangle15a = textFieldTriangle15a.getText();
if (!textFieldTriangle15a.getText().isEmpty()) doubleTriangle15a = Double.parseDouble(stringTriangle15a);

//Heights
stringTriangle22a = textFieldTriangle22a.getText();
if (!textFieldTriangle22a.getText().isEmpty()) doubleTriangle22a = Double.parseDouble(stringTriangle22a);
stringTriangle23a = textFieldTriangle23a.getText();
if (!textFieldTriangle23a.getText().isEmpty()) doubleTriangle23a = Double.parseDouble(stringTriangle23a);
stringTriangle24a = textFieldTriangle24a.getText();
if (!textFieldTriangle24a.getText().isEmpty()) doubleTriangle24a = Double.parseDouble(stringTriangle24a);

//Area
stringTriangle31a = textFieldTriangle31a.getText();
if (!textFieldTriangle31a.getText().isEmpty()) doubleTriangle31a = Double.parseDouble(stringTriangle31a);

//Calculation
if (!textFieldTriangle31a.getText().isEmpty() && !textFieldTriangle23a.getText().isEmpty()) {
doubleTriangle5a = doubleTriangle31a / (0.5 * doubleTriangle23a);
textFieldTriangle5a.setText(String.valueOf(decimalFormat.format(doubleTriangle5a)));
}
else if (!textFieldTriangle31a.getText().isEmpty() && !textFieldTriangle6a.getText().isEmpty() && !textFieldTriangle13a.getText().isEmpty()) {
doubleTriangle5a = doubleTriangle31a / (0.5 * doubleTriangle6a  * Math.sin(Math.toRadians(doubleTriangle13a)));
textFieldTriangle5a.setText(String.valueOf(decimalFormat.format(doubleTriangle5a)));
}
else if (!textFieldTriangle31a.getText().isEmpty() && !textFieldTriangle4a.getText().isEmpty() && !textFieldTriangle15a.getText().isEmpty()) {
doubleTriangle5a = doubleTriangle31a / (0.5 * doubleTriangle4a  * Math.sin(Math.toRadians(doubleTriangle15a)));
textFieldTriangle5a.setText(String.valueOf(decimalFormat.format(doubleTriangle5a)));
}
else if (!textFieldTriangle31a.getText().isEmpty() && !textFieldTriangle13a.getText().isEmpty() && !textFieldTriangle15a.getText().isEmpty()) {
doubleTriangle5a = Math.sqrt((2 * doubleTriangle31a * Math.sin(Math.toRadians(doubleTriangle15a + doubleTriangle13a))) / (Math.sin(Math.toRadians(doubleTriangle15a)) * Math.sin(Math.toRadians(doubleTriangle13a))));
textFieldTriangle5a.setText(String.valueOf(decimalFormat.format(doubleTriangle5a)));
}

}

//################ Calculate triangle scalene side 3 ################
if (e.getSource() == buttonTriangle9a) {
//Sides
stringTriangle4a = textFieldTriangle4a.getText();
if (!textFieldTriangle4a.getText().isEmpty()) doubleTriangle4a = Double.parseDouble(stringTriangle4a);
stringTriangle5a = textFieldTriangle5a.getText();
if (!textFieldTriangle5a.getText().isEmpty()) doubleTriangle5a = Double.parseDouble(stringTriangle5a);
stringTriangle6a = textFieldTriangle6a.getText();
if (!textFieldTriangle6a.getText().isEmpty()) doubleTriangle6a = Double.parseDouble(stringTriangle6a);

//Angles
stringTriangle13a = textFieldTriangle13a.getText();
if (!textFieldTriangle13a.getText().isEmpty()) doubleTriangle13a = Double.parseDouble(stringTriangle13a);
stringTriangle14a = textFieldTriangle14a.getText();
if (!textFieldTriangle14a.getText().isEmpty()) doubleTriangle14a = Double.parseDouble(stringTriangle14a);
stringTriangle15a = textFieldTriangle15a.getText();
if (!textFieldTriangle15a.getText().isEmpty()) doubleTriangle15a = Double.parseDouble(stringTriangle15a);

//Heights
stringTriangle22a = textFieldTriangle22a.getText();
if (!textFieldTriangle22a.getText().isEmpty()) doubleTriangle22a = Double.parseDouble(stringTriangle22a);
stringTriangle23a = textFieldTriangle23a.getText();
if (!textFieldTriangle23a.getText().isEmpty()) doubleTriangle23a = Double.parseDouble(stringTriangle23a);
stringTriangle24a = textFieldTriangle24a.getText();
if (!textFieldTriangle24a.getText().isEmpty()) doubleTriangle24a = Double.parseDouble(stringTriangle24a);

//Area
stringTriangle31a = textFieldTriangle31a.getText();
if (!textFieldTriangle31a.getText().isEmpty()) doubleTriangle31a = Double.parseDouble(stringTriangle31a);

//Calculation
if (!textFieldTriangle31a.getText().isEmpty() && !textFieldTriangle24a.getText().isEmpty()) {
doubleTriangle6a = doubleTriangle31a / (0.5 * doubleTriangle24a);
textFieldTriangle6a.setText(String.valueOf(decimalFormat.format(doubleTriangle6a)));
}
else if (!textFieldTriangle31a.getText().isEmpty() && !textFieldTriangle4a.getText().isEmpty() && !textFieldTriangle14a.getText().isEmpty()) {
doubleTriangle6a = doubleTriangle31a / (0.5 * doubleTriangle4a  * Math.sin(Math.toRadians(doubleTriangle14a)));
textFieldTriangle6a.setText(String.valueOf(decimalFormat.format(doubleTriangle6a)));
}
else if (!textFieldTriangle31a.getText().isEmpty() && !textFieldTriangle5a.getText().isEmpty() && !textFieldTriangle13a.getText().isEmpty()) {
doubleTriangle6a = doubleTriangle31a / (0.5 * doubleTriangle5a  * Math.sin(Math.toRadians(doubleTriangle13a)));
textFieldTriangle6a.setText(String.valueOf(decimalFormat.format(doubleTriangle6a)));
}
else if (!textFieldTriangle31a.getText().isEmpty() && !textFieldTriangle13a.getText().isEmpty() && !textFieldTriangle14a.getText().isEmpty()) {
doubleTriangle6a = Math.sqrt((2 * doubleTriangle31a * Math.sin(Math.toRadians(doubleTriangle14a + doubleTriangle13a))) / (Math.sin(Math.toRadians(doubleTriangle14a)) * Math.sin(Math.toRadians(doubleTriangle13a))));
textFieldTriangle6a.setText(String.valueOf(decimalFormat.format(doubleTriangle6a)));
}

}


//################ Calculate square side to ################
if (e.getSource() == buttonSquare5a) {
stringSquare3a = textFieldSquare3a.getText();
doubleSquare3a = Double.parseDouble(stringSquare3a);
doubleSquare4a = doubleSquare3a * doubleSquare3a;
textFieldSquare4a.setText(String.valueOf(decimalFormat.format(doubleSquare4a)));
doubleSquare9a = doubleSquare3a * Math.sqrt(2);
textFieldSquare9a.setText(String.valueOf(decimalFormat.format(doubleSquare9a)));
}

//################ Calculate square area to ################
if (e.getSource() == buttonSquare6a) {
stringSquare4a = textFieldSquare4a.getText();
doubleSquare4a = Double.parseDouble(stringSquare4a);
doubleSquare3a = Math.sqrt(doubleSquare4a);
textFieldSquare3a.setText(String.valueOf(decimalFormat.format(doubleSquare3a)));
doubleSquare9a = doubleSquare3a * Math.sqrt(2);
textFieldSquare9a.setText(String.valueOf(decimalFormat.format(doubleSquare9a)));
}
//################ Calculate square diagonal to ################
if (e.getSource() == buttonSquare11a) {
stringSquare9a = textFieldSquare9a.getText();
doubleSquare9a = Double.parseDouble(stringSquare9a);
doubleSquare3a = doubleSquare9a / Math.sqrt(2);
textFieldSquare3a.setText(String.valueOf(decimalFormat.format(doubleSquare3a)));
doubleSquare4a = doubleSquare3a * doubleSquare3a;
textFieldSquare4a.setText(String.valueOf(decimalFormat.format(doubleSquare4a)));
}

//################ Calculate cube side to ################
if (e.getSource() == buttonCube5a) {
stringCube3a = textFieldCube3a.getText();
doubleCube3a = Double.parseDouble(stringCube3a);
doubleCube4a = doubleCube3a * Math.sqrt(3);
textFieldCube4a.setText(String.valueOf(decimalFormat.format(doubleCube4a)));
doubleCube9a = 6 * doubleCube3a * doubleCube3a;
textFieldCube9a.setText(String.valueOf(decimalFormat.format(doubleCube9a)));
doubleCube10a = doubleCube3a * doubleCube3a * doubleCube3a;
textFieldCube10a.setText(String.valueOf(decimalFormat.format(doubleCube10a)));
}

//################ Calculate cube diagonal to ################
if (e.getSource() == buttonCube6a) {
stringCube4a = textFieldCube4a.getText();
doubleCube4a = Double.parseDouble(stringCube4a);
doubleCube3a = doubleCube4a / Math.sqrt(3);
textFieldCube3a.setText(String.valueOf(decimalFormat.format(doubleCube3a)));
doubleCube9a = 6 * doubleCube3a * doubleCube3a;
textFieldCube9a.setText(String.valueOf(decimalFormat.format(doubleCube9a)));
doubleCube10a = doubleCube3a * doubleCube3a * doubleCube3a;
textFieldCube10a.setText(String.valueOf(decimalFormat.format(doubleCube10a)));
}

//################ Calculate cube surface to ################
if (e.getSource() == buttonCube11a) {
stringCube9a = textFieldCube9a.getText();
doubleCube9a = Double.parseDouble(stringCube9a);
doubleCube3a = Math.sqrt(doubleCube9a / 6);
textFieldCube3a.setText(String.valueOf(decimalFormat.format(doubleCube3a)));
doubleCube4a = doubleCube3a * Math.sqrt(3);
textFieldCube4a.setText(String.valueOf(decimalFormat.format(doubleCube4a)));
doubleCube10a = doubleCube3a * doubleCube3a * doubleCube3a;
textFieldCube10a.setText(String.valueOf(decimalFormat.format(doubleCube10a)));
}

//################ Calculate cube volume to ################
if (e.getSource() == buttonCube12a) {
stringCube10a = textFieldCube10a.getText();
doubleCube10a = Double.parseDouble(stringCube10a);
doubleCube3a = Math.cbrt(doubleCube10a);
textFieldCube3a.setText(String.valueOf(decimalFormat.format(doubleCube3a)));
doubleCube4a = doubleCube3a * Math.sqrt(3);
textFieldCube4a.setText(String.valueOf(decimalFormat.format(doubleCube4a)));
doubleCube9a = 6 * doubleCube3a * doubleCube3a;
textFieldCube9a.setText(String.valueOf(decimalFormat.format(doubleCube9a)));
}

//################ Calculate Sphere radius to ################
if (e.getSource() == buttonSphere5a) {
stringSphere3a = textFieldSphere3a.getText();
doubleSphere3a = Double.parseDouble(stringSphere3a);
doubleSphere4a = 2 * Math.PI * doubleSphere3a;
textFieldSphere4a.setText(String.valueOf(decimalFormat.format(doubleSphere4a)));
doubleSphere9a = 4 * Math.PI * Math.pow(doubleSphere3a, 2);
textFieldSphere9a.setText(String.valueOf(decimalFormat.format(doubleSphere9a)));
doubleSphere10a = 1.333333333 * Math.PI * doubleSphere3a * doubleSphere3a * doubleSphere3a;
textFieldSphere10a.setText(String.valueOf(decimalFormat.format(doubleSphere10a)));
}

//################ Calculate Sphere circumference to ################
if (e.getSource() == buttonSphere6a) {
stringSphere4a = textFieldSphere4a.getText();
doubleSphere4a = Double.parseDouble(stringSphere4a);
doubleSphere3a = doubleSphere4a / (2 * Math.PI);
textFieldSphere3a.setText(String.valueOf(decimalFormat.format(doubleSphere3a)));
doubleSphere9a = 4 * Math.PI * Math.pow(doubleSphere3a, 2);
textFieldSphere9a.setText(String.valueOf(decimalFormat.format(doubleSphere9a)));
doubleSphere10a = 1.333333333 * Math.PI * doubleSphere3a * doubleSphere3a * doubleSphere3a;
textFieldSphere10a.setText(String.valueOf(decimalFormat.format(doubleSphere10a)));
}

//################ Calculate Sphere area to ################
if (e.getSource() == buttonSphere11a) {
stringSphere9a = textFieldSphere9a.getText();
doubleSphere9a = Double.parseDouble(stringSphere9a);
doubleSphere3a = Math.sqrt( doubleSphere9a / (4 * Math.PI));
textFieldSphere3a.setText(String.valueOf(decimalFormat.format(doubleSphere3a)));
doubleSphere4a = 2 * Math.PI * doubleSphere3a;
textFieldSphere4a.setText(String.valueOf(decimalFormat.format(doubleSphere4a)));
doubleSphere10a = 1.333333333 * Math.PI * doubleSphere3a * doubleSphere3a * doubleSphere3a;
textFieldSphere10a.setText(String.valueOf(decimalFormat.format(doubleSphere10a)));
}

//################ Calculate Sphere volume to ################
if (e.getSource() == buttonSphere12a) {
stringSphere10a = textFieldSphere10a.getText();
doubleSphere10a = Double.parseDouble(stringSphere10a);
doubleSphere3a = Math.cbrt(doubleSphere10a / (1.333333333 * Math.PI));
textFieldSphere3a.setText(String.valueOf(decimalFormat.format(doubleSphere3a)));
doubleSphere4a = 2 * Math.PI * doubleSphere3a;
textFieldSphere4a.setText(String.valueOf(decimalFormat.format(doubleSphere4a)));
doubleSphere9a = 4 * Math.PI * Math.pow(doubleSphere3a, 2);
textFieldSphere9a.setText(String.valueOf(decimalFormat.format(doubleSphere9a)));
}

//################ Calculate circle radius to ################
if (e.getSource() == buttonCircle5b) {
stringCircle3b = textFieldCircle3b.getText();
doubleCircle3b = Double.parseDouble(stringCircle3b);
doubleCircle4b = Math.PI * doubleCircle3b * doubleCircle3b;
textFieldCircle4b.setText(String.valueOf(decimalFormat.format(doubleCircle4b)));
doubleCircle9b = 2 * Math.PI * doubleCircle3b ;
textFieldCircle9b.setText(String.valueOf(decimalFormat.format(doubleCircle9b)));
doubleCircle10b = 2 * doubleCircle3b;
textFieldCircle10b.setText(String.valueOf(decimalFormat.format(doubleCircle10b)));
}

//################ Calculate circle area to ################
if (e.getSource() == buttonCircle6b) {
stringCircle4b = textFieldCircle4b.getText();
doubleCircle4b = Double.parseDouble(stringCircle4b);
doubleCircle3b = Math.sqrt(doubleCircle4b / Math.PI);
textFieldCircle3b.setText(String.valueOf(decimalFormat.format(doubleCircle3b)));
doubleCircle9b = 2 * Math.PI * doubleCircle3b;
textFieldCircle9b.setText(String.valueOf(decimalFormat.format(doubleCircle9b)));
doubleCircle10b = 2 * doubleCircle3b;
textFieldCircle10b.setText(String.valueOf(decimalFormat.format(doubleCircle10b)));
}

//################ Calculate circle circumference to ################
if (e.getSource() == buttonCircle11b) {
stringCircle9b = textFieldCircle9b.getText();
doubleCircle9b = Double.parseDouble(stringCircle9b);
doubleCircle3b = doubleCircle9b / (2 * Math.PI);
textFieldCircle3b.setText(String.valueOf(decimalFormat.format(doubleCircle3b)));
doubleCircle4b = Math.PI * doubleCircle3b * doubleCircle3b;
textFieldCircle4b.setText(String.valueOf(decimalFormat.format(doubleCircle4b)));
doubleCircle10b = 2 * doubleCircle3b;
textFieldCircle10b.setText(String.valueOf(decimalFormat.format(doubleCircle10b)));
}

//################ Calculate circle diameter to ################
if (e.getSource() == buttonCircle12b) {
stringCircle10b = textFieldCircle10b.getText();
doubleCircle10b = Double.parseDouble(stringCircle10b);
doubleCircle3b = doubleCircle10b / 2;
textFieldCircle3b.setText(String.valueOf(decimalFormat.format(doubleCircle3b)));
doubleCircle4b = Math.PI * doubleCircle3b * doubleCircle3b;
textFieldCircle4b.setText(String.valueOf(decimalFormat.format(doubleCircle4b)));
doubleCircle9b = 2 * Math.PI * doubleCircle3b;
textFieldCircle9b.setText(String.valueOf(decimalFormat.format(doubleCircle9b)));
}


//################ Calculate convert length imperial to metric ################
if (e.getSource() == buttonConvert13a) {
stringConvert11a = textFieldConvert11a.getText();
doubleConvert11a = Double.parseDouble(stringConvert11a);

//^^^ Inches Picked ^^^
if ((intImperialPickeda == 0) && (intMetricPickeda == 0)) {
doubleConvert12a = doubleConvert11a * 25.4;
textFieldConvert12a.setText(String.valueOf(decimalFormat.format(doubleConvert12a)) + suffixMm);
}
if ((intImperialPickeda == 0) && (intMetricPickeda == 1)) {
doubleConvert12a = doubleConvert11a * 2.54;
textFieldConvert12a.setText(String.valueOf(decimalFormat.format(doubleConvert12a)) + suffixCm);
}
if ((intImperialPickeda == 0) && (intMetricPickeda == 2)) {
doubleConvert12a = doubleConvert11a * 0.0254;
textFieldConvert12a.setText(String.valueOf(decimalFormat.format(doubleConvert12a)) + suffixM);
}
if ((intImperialPickeda == 0) && (intMetricPickeda == 3)) {
doubleConvert12a = doubleConvert11a * 0.0000254;
textFieldConvert12a.setText(String.valueOf(decimalFormat.format(doubleConvert12a)) + suffixKm);

}

//^^^ Feet Picked ^^^
if ((intImperialPickeda == 1) && (intMetricPickeda == 0)) {
doubleConvert12a = doubleConvert11a * 304.8;
textFieldConvert12a.setText(String.valueOf(decimalFormat.format(doubleConvert12a)) + suffixMm);
}
if ((intImperialPickeda == 1) && (intMetricPickeda == 1)) {
doubleConvert12a = doubleConvert11a * 30.48;
textFieldConvert12a.setText(String.valueOf(decimalFormat.format(doubleConvert12a)) + suffixCm);
}
if ((intImperialPickeda == 1) && (intMetricPickeda == 2)) {
doubleConvert12a = doubleConvert11a * 0.3048;
textFieldConvert12a.setText(String.valueOf(decimalFormat.format(doubleConvert12a)) + suffixM);
}
if ((intImperialPickeda == 1) && (intMetricPickeda == 3)) {
doubleConvert12a = doubleConvert11a * 0.0003048;
textFieldConvert12a.setText(String.valueOf(decimalFormat.format(doubleConvert12a)) + suffixKm);
}

//^^^ Yards Picked ^^^
if ((intImperialPickeda == 2) && (intMetricPickeda == 0)) {
doubleConvert12a = doubleConvert11a * 914.4;
textFieldConvert12a.setText(String.valueOf(decimalFormat.format(doubleConvert12a)) + suffixMm);
}
if ((intImperialPickeda == 2) && (intMetricPickeda == 1)) {
doubleConvert12a = doubleConvert11a * 91.44;
textFieldConvert12a.setText(String.valueOf(decimalFormat.format(doubleConvert12a)) + suffixCm);
}
if ((intImperialPickeda == 2) && (intMetricPickeda == 2)) {
doubleConvert12a = doubleConvert11a * 0.9144;
textFieldConvert12a.setText(String.valueOf(decimalFormat.format(doubleConvert12a)) + suffixM);
}
if ((intImperialPickeda == 2) && (intMetricPickeda == 3)) {
doubleConvert12a = doubleConvert11a * 0.0009144;
textFieldConvert12a.setText(String.valueOf(decimalFormat.format(doubleConvert12a)) + suffixKm);
}

//^^^ Miles Picked ^^^
if ((intImperialPickeda == 3) && (intMetricPickeda == 0)) {
doubleConvert12a = doubleConvert11a * 1609344;
textFieldConvert12a.setText(String.valueOf(decimalFormat.format(doubleConvert12a)) + suffixMm);
}
if ((intImperialPickeda == 3) && (intMetricPickeda == 1)) {
doubleConvert12a = doubleConvert11a * 160934.4;
textFieldConvert12a.setText(String.valueOf(decimalFormat.format(doubleConvert12a)) + suffixCm);
}
if ((intImperialPickeda == 3) && (intMetricPickeda == 2)) {
doubleConvert12a = doubleConvert11a * 1609.344;
textFieldConvert12a.setText(String.valueOf(decimalFormat.format(doubleConvert12a)) + suffixM);
}
if ((intImperialPickeda == 3) && (intMetricPickeda == 3)) {
doubleConvert12a = doubleConvert11a * 1.609344;
textFieldConvert12a.setText(String.valueOf(decimalFormat.format(doubleConvert12a)) + suffixKm);
}
}

//################ Calculate convert length metric to imperial ################
if (e.getSource() == buttonConvert14a) {
stringConvert12a = textFieldConvert12a.getText();
doubleConvert12a = Double.parseDouble(stringConvert12a);

//^^^ Inches Picked ^^^
if ((intImperialPickeda == 0) && (intMetricPickeda == 0)) {
doubleConvert11a = doubleConvert12a * 0.0393700787;
textFieldConvert11a.setText(String.valueOf(decimalFormat.format(doubleConvert11a)) + suffixIn);
}
if ((intImperialPickeda == 0) && (intMetricPickeda == 1)) {
doubleConvert11a = doubleConvert12a * 0.393700787;
textFieldConvert11a.setText(String.valueOf(decimalFormat.format(doubleConvert11a)) + suffixIn);
}
if ((intImperialPickeda == 0) && (intMetricPickeda == 2)) {
doubleConvert11a = doubleConvert12a * 39.3700787;
textFieldConvert11a.setText(String.valueOf(decimalFormat.format(doubleConvert11a)) + suffixIn);
}
if ((intImperialPickeda == 0) && (intMetricPickeda == 3)) {
doubleConvert11a = doubleConvert12a * 39370.0787;
textFieldConvert11a.setText(String.valueOf(decimalFormat.format(doubleConvert11a)) + suffixIn);

}

//^^^ Feet Picked ^^^
if ((intImperialPickeda == 1) && (intMetricPickeda == 0)) {
doubleConvert11a = doubleConvert12a * 0.0032808399;
textFieldConvert11a.setText(String.valueOf(decimalFormat.format(doubleConvert11a)) + suffixFt);
}
if ((intImperialPickeda == 1) && (intMetricPickeda == 1)) {
doubleConvert11a = doubleConvert12a * 0.032808399;
textFieldConvert11a.setText(String.valueOf(decimalFormat.format(doubleConvert11a)) + suffixFt);
}
if ((intImperialPickeda == 1) && (intMetricPickeda == 2)) {
doubleConvert11a = doubleConvert12a * 3.2808399;
textFieldConvert11a.setText(String.valueOf(decimalFormat.format(doubleConvert11a)) + suffixFt);
}
if ((intImperialPickeda == 1) && (intMetricPickeda == 3)) {
doubleConvert11a = doubleConvert12a * 3280.8399;
textFieldConvert11a.setText(String.valueOf(decimalFormat.format(doubleConvert11a)) + suffixFt);
}

//^^^ Yards Picked ^^^
if ((intImperialPickeda == 2) && (intMetricPickeda == 0)) {
doubleConvert11a = doubleConvert12a * 0.0010936133;
textFieldConvert11a.setText(String.valueOf(decimalFormat.format(doubleConvert11a)) + suffixYd);
}
if ((intImperialPickeda == 2) && (intMetricPickeda == 1)) {
doubleConvert11a = doubleConvert12a * 0.010936133;
textFieldConvert11a.setText(String.valueOf(decimalFormat.format(doubleConvert11a)) + suffixYd);
}
if ((intImperialPickeda == 2) && (intMetricPickeda == 2)) {
doubleConvert11a = doubleConvert12a * 1.0936133;
textFieldConvert11a.setText(String.valueOf(decimalFormat.format(doubleConvert11a)) + suffixYd);
}
if ((intImperialPickeda == 2) && (intMetricPickeda == 3)) {
doubleConvert11a = doubleConvert12a * 1093.6133;
textFieldConvert11a.setText(String.valueOf(decimalFormat.format(doubleConvert11a)) + suffixYd);
}

//^^^ Miles Picked ^^^
if ((intImperialPickeda == 3) && (intMetricPickeda == 0)) {
doubleConvert11a = doubleConvert12a * 0.00000621371192;
textFieldConvert11a.setText(String.valueOf(decimalFormat.format(doubleConvert11a)) + suffixMi);
}
if ((intImperialPickeda == 3) && (intMetricPickeda == 1)) {
doubleConvert11a = doubleConvert12a * 0.0000621371192;
textFieldConvert11a.setText(String.valueOf(decimalFormat.format(doubleConvert11a)) + suffixMi);
}
if ((intImperialPickeda == 3) && (intMetricPickeda == 2)) {
doubleConvert11a = doubleConvert12a * 0.000621371192;
textFieldConvert11a.setText(String.valueOf(decimalFormat.format(doubleConvert11a)) + suffixMi);
}
if ((intImperialPickeda == 3) && (intMetricPickeda == 3)) {
doubleConvert11a = doubleConvert12a * 0.621371192;
textFieldConvert11a.setText(String.valueOf(decimalFormat.format(doubleConvert11a)) + suffixMi);
}
}


//^^^ Pick convert int length imperial/metric^^^
if (e.getSource() == radioButtonConvert3a) {
intImperialPickeda = 0;
}
if (e.getSource() == radioButtonConvert4a) {
intMetricPickeda = 0;
}
if (e.getSource() == radioButtonConvert5a) {
intImperialPickeda = 1;
}
if (e.getSource() == radioButtonConvert6a) {
intMetricPickeda = 1;
}
if (e.getSource() == radioButtonConvert7a) {
intImperialPickeda = 2;
}
if (e.getSource() == radioButtonConvert8a) {
intMetricPickeda = 2;
}
if (e.getSource() == radioButtonConvert9a) {
intImperialPickeda = 3;
}
if (e.getSource() == radioButtonConvert10a) {
intMetricPickeda = 3;
}

//################ Calculate convert temperature fahrenheit to others ################
if (e.getSource() == buttonConvert5d) {
stringConvertTemperature3d = textFieldConvert3d.getText();
doubleConvertTemperature3d = Double.parseDouble(stringConvertTemperature3d);
doubleConvertTemperature4d = ((doubleConvertTemperature3d - 32) /  1.8) + 273.15;
textFieldConvert4d.setText(String.valueOf(decimalFormat.format(doubleConvertTemperature4d)) + suffixK);
doubleConvertTemperature9d = (doubleConvertTemperature3d - 32) /  1.8;
textFieldConvert9d.setText(String.valueOf(decimalFormat.format(doubleConvertTemperature9d)) + suffixC);

}


//################ Calculate convert temperature kelvin to others ################
if (e.getSource() == buttonConvert6d) {
stringConvertTemperature4d = textFieldConvert4d.getText();
doubleConvertTemperature4d = Double.parseDouble(stringConvertTemperature4d);
doubleConvertTemperature3d = ((doubleConvertTemperature4d - 273.15) * 1.8) + 32;
textFieldConvert3d.setText(String.valueOf(decimalFormat.format(doubleConvertTemperature3d)) + suffixF);
doubleConvertTemperature9d = doubleConvertTemperature4d - 273.15 ;
textFieldConvert9d.setText(String.valueOf(decimalFormat.format(doubleConvertTemperature9d)) + suffixC);
}


//################ Calculate convert temperature celsius to others ################
if (e.getSource() == buttonConvert11d) {
stringConvertTemperature9d = textFieldConvert9d.getText();
doubleConvertTemperature9d = Double.parseDouble(stringConvertTemperature9d);
doubleConvertTemperature3d = (doubleConvertTemperature9d * 1.8) + 32;
textFieldConvert3d.setText(String.valueOf(decimalFormat.format(doubleConvertTemperature3d)) + suffixF);
doubleConvertTemperature4d = doubleConvertTemperature9d + 273.15;
textFieldConvert4d.setText(String.valueOf(decimalFormat.format(doubleConvertTemperature4d)) + suffixK);
}


//################ Calculate convert weight imperial to metric ################
if (e.getSource() == buttonConvert13e) {
stringConvert11e = textFieldConvert11e.getText();
doubleConvert11e = Double.parseDouble(stringConvert11e);

//^^^ Ounces Picked ^^^
if ((intImperialPickede == 0) && (intMetricPickede == 0)) {
doubleConvert12e = doubleConvert11e * 28349.5231;
textFieldConvert12e.setText(String.valueOf(decimalFormat.format(doubleConvert12e)) + suffixMg);
}
if ((intImperialPickede == 0) && (intMetricPickede == 1)) {
doubleConvert12e = doubleConvert11e * 28.3495231;
textFieldConvert12e.setText(String.valueOf(decimalFormat.format(doubleConvert12e)) + suffixG);
}
if ((intImperialPickede == 0) && (intMetricPickede == 2)) {
doubleConvert12e = doubleConvert11e * 0.0283495231;
textFieldConvert12e.setText(String.valueOf(decimalFormat.format(doubleConvert12e)) + suffixKg);
}
if ((intImperialPickede == 0) && (intMetricPickede == 3)) {
doubleConvert12e = doubleConvert11e * 0.00002834952 ;
textFieldConvert12e.setText(String.valueOf(decimalFormat.format(doubleConvert12e)) + suffixT);

}

//^^^ Pounds Picked ^^^
if ((intImperialPickede == 1) && (intMetricPickede == 0)) {
doubleConvert12e = doubleConvert11e * 453592.37;
textFieldConvert12e.setText(String.valueOf(decimalFormat.format(doubleConvert12e)) + suffixMg);
}
if ((intImperialPickede == 1) && (intMetricPickede == 1)) {
doubleConvert12e = doubleConvert11e * 453.59237;
textFieldConvert12e.setText(String.valueOf(decimalFormat.format(doubleConvert12e)) + suffixG);
}
if ((intImperialPickede == 1) && (intMetricPickede == 2)) {
doubleConvert12e = doubleConvert11e * 0.45359237;
textFieldConvert12e.setText(String.valueOf(decimalFormat.format(doubleConvert12e)) + suffixKg);
}
if ((intImperialPickede == 1) && (intMetricPickede == 3)) {
doubleConvert12e = doubleConvert11e * 0.00045359237;
textFieldConvert12e.setText(String.valueOf(decimalFormat.format(doubleConvert12e)) + suffixT);
}

//^^^ Stones Picked ^^^
if ((intImperialPickede == 2) && (intMetricPickede == 0)) {
doubleConvert12e = doubleConvert11e * 6350293.18;
textFieldConvert12e.setText(String.valueOf(decimalFormat.format(doubleConvert12e)) + suffixMg);
}
if ((intImperialPickede == 2) && (intMetricPickede == 1)) {
doubleConvert12e = doubleConvert11e * 6350.29318;
textFieldConvert12e.setText(String.valueOf(decimalFormat.format(doubleConvert12e)) + suffixG);
}
if ((intImperialPickede == 2) && (intMetricPickede == 2)) {
doubleConvert12e = doubleConvert11e * 6.35029318;
textFieldConvert12e.setText(String.valueOf(decimalFormat.format(doubleConvert12e)) + suffixKg);
}
if ((intImperialPickede == 2) && (intMetricPickede == 3)) {
doubleConvert12e = doubleConvert11e * 0.00635029318;
textFieldConvert12e.setText(String.valueOf(decimalFormat.format(doubleConvert12e)) + suffixT);
}

//^^^ Tons Picked ^^^
if ((intImperialPickede == 3) && (intMetricPickede == 0)) {
doubleConvert12e = doubleConvert11e * 907184740;
textFieldConvert12e.setText(String.valueOf(decimalFormat.format(doubleConvert12e)) + suffixMg);
}
if ((intImperialPickede == 3) && (intMetricPickede == 1)) {
doubleConvert12e = doubleConvert11e * 907184.74;
textFieldConvert12e.setText(String.valueOf(decimalFormat.format(doubleConvert12e)) + suffixG);
}
if ((intImperialPickede == 3) && (intMetricPickede == 2)) {
doubleConvert12e = doubleConvert11e * 907.18474;
textFieldConvert12e.setText(String.valueOf(decimalFormat.format(doubleConvert12e)) + suffixKg);
}
if ((intImperialPickede == 3) && (intMetricPickede == 3)) {
doubleConvert12e = doubleConvert11e * 0.90718474;
textFieldConvert12e.setText(String.valueOf(decimalFormat.format(doubleConvert12e)) + suffixT);
}
}

//################ Calculate convert weight metric to imperial ################
if (e.getSource() == buttonConvert14e) {
stringConvert12e = textFieldConvert12e.getText();
doubleConvert12e = Double.parseDouble(stringConvert12e);

//^^^ Ounces Picked ^^^
if ((intImperialPickede == 0) && (intMetricPickede == 0)) {
doubleConvert11e = doubleConvert12e * 0.00003527396;
textFieldConvert11e.setText(String.valueOf(decimalFormat.format(doubleConvert11e)) + suffixOz);
}
if ((intImperialPickede == 0) && (intMetricPickede == 1)) {
doubleConvert11e = doubleConvert12e * 0.03527396197;
textFieldConvert11e.setText(String.valueOf(decimalFormat.format(doubleConvert11e)) + suffixOz);
}
if ((intImperialPickede == 0) && (intMetricPickede == 2)) {
doubleConvert11e = doubleConvert12e * 35.2739619;
textFieldConvert11e.setText(String.valueOf(decimalFormat.format(doubleConvert11e)) + suffixOz);
}
if ((intImperialPickede == 0) && (intMetricPickede == 3)) {
doubleConvert11e = doubleConvert12e * 35273.9619;
textFieldConvert11e.setText(String.valueOf(decimalFormat.format(doubleConvert11e)) + suffixOz);

}

//^^^ Pounds Picked ^^^
if ((intImperialPickede == 1) && (intMetricPickede == 0)) {
doubleConvert11e = doubleConvert12e * 0.00000220462;
textFieldConvert11e.setText(String.valueOf(decimalFormat.format(doubleConvert11e)) + suffixLb);
}
if ((intImperialPickede == 1) && (intMetricPickede == 1)) {
doubleConvert11e = doubleConvert12e * 0.00220462262;
textFieldConvert11e.setText(String.valueOf(decimalFormat.format(doubleConvert11e)) + suffixLb);
}
if ((intImperialPickede == 1) && (intMetricPickede == 2)) {
doubleConvert11e = doubleConvert12e * 2.20462262;
textFieldConvert11e.setText(String.valueOf(decimalFormat.format(doubleConvert11e)) + suffixLb);
}
if ((intImperialPickede == 1) && (intMetricPickede == 3)) {
doubleConvert11e = doubleConvert12e * 2204.62262;
textFieldConvert11e.setText(String.valueOf(decimalFormat.format(doubleConvert11e)) + suffixLb);
}

//^^^ Stones Picked ^^^
if ((intImperialPickede == 2) && (intMetricPickede == 0)) {
doubleConvert11e = doubleConvert12e * 0.000000157473;
textFieldConvert11e.setText(String.valueOf(decimalFormat.format(doubleConvert11e)) + suffixSt);
}
if ((intImperialPickede == 2) && (intMetricPickede == 1)) {
doubleConvert11e = doubleConvert12e * 0.000157473044;
textFieldConvert11e.setText(String.valueOf(decimalFormat.format(doubleConvert11e)) + suffixSt);
}
if ((intImperialPickede == 2) && (intMetricPickede == 2)) {
doubleConvert11e = doubleConvert12e * 0.157473044;
textFieldConvert11e.setText(String.valueOf(decimalFormat.format(doubleConvert11e)) + suffixSt);
}
if ((intImperialPickede == 2) && (intMetricPickede == 3)) {
doubleConvert11e = doubleConvert12e * 157.473044;
textFieldConvert11e.setText(String.valueOf(decimalFormat.format(doubleConvert11e)) + suffixSt);
}

//^^^ Tons Picked ^^^
if ((intImperialPickede == 3) && (intMetricPickede == 0)) {
doubleConvert11e = doubleConvert12e * 0.00000000110231;
textFieldConvert11e.setText(String.valueOf(decimalFormat.format(doubleConvert11e)) + suffixTn);
}
if ((intImperialPickede == 3) && (intMetricPickede == 1)) {
doubleConvert11e = doubleConvert12e * 0.00000110231;
textFieldConvert11e.setText(String.valueOf(decimalFormat.format(doubleConvert11e)) + suffixTn);
}
if ((intImperialPickede == 3) && (intMetricPickede == 2)) {
doubleConvert11e = doubleConvert12e * 0.00110231131;
textFieldConvert11e.setText(String.valueOf(decimalFormat.format(doubleConvert11e)) + suffixTn);
}
if ((intImperialPickede == 3) && (intMetricPickede == 3)) {
doubleConvert11e = doubleConvert12e * 1.10231131;
textFieldConvert11e.setText(String.valueOf(decimalFormat.format(doubleConvert11e)) + suffixTn);
}
}


//^^^ Pick convert  int weight imperial/metric^^^
if (e.getSource() == radioButtonConvert3e) {
intImperialPickede = 0;
}
if (e.getSource() == radioButtonConvert4e) {
intMetricPickede = 0;
}
if (e.getSource() == radioButtonConvert5e) {
intImperialPickede = 1;
}
if (e.getSource() == radioButtonConvert6e) {
intMetricPickede = 1;
}
if (e.getSource() == radioButtonConvert7e) {
intImperialPickede = 2;
}
if (e.getSource() == radioButtonConvert8e) {
intMetricPickede = 2;
}
if (e.getSource() == radioButtonConvert9e) {
intImperialPickede = 3;
}
if (e.getSource() == radioButtonConvert10e) {
intMetricPickede = 3;
}


//################ Calculate convert volume imperial to metric ################
if (e.getSource() == buttonConvert13b) {
stringConvert11b = textFieldConvert11b.getText();
doubleConvert11b = Double.parseDouble(stringConvert11b);

//^^^ Pints Picked ^^^
if ((intImperialPickedb == 0) && (intMetricPickedb == 0)) {
doubleConvert12b = doubleConvert11b * 473.176473;
textFieldConvert12b.setText(String.valueOf(decimalFormat.format(doubleConvert12b)) + suffixMl);
}
if ((intImperialPickedb == 0) && (intMetricPickedb == 1)) {
doubleConvert12b = doubleConvert11b * 0.473176473;
textFieldConvert12b.setText(String.valueOf(decimalFormat.format(doubleConvert12b)) + suffixL);
}
if ((intImperialPickedb == 0) && (intMetricPickedb == 2)) {
doubleConvert12b = doubleConvert11b * 0.000473176473;
textFieldConvert12b.setText(String.valueOf(decimalFormat.format(doubleConvert12b)) + suffixKl);
}

//^^^ Quarts Picked ^^^
if ((intImperialPickedb == 1) && (intMetricPickedb == 0)) {
doubleConvert12b = doubleConvert11b * 946.352946;
textFieldConvert12b.setText(String.valueOf(decimalFormat.format(doubleConvert12b)) + suffixMl);
}
if ((intImperialPickedb == 1) && (intMetricPickedb == 1)) {
doubleConvert12b = doubleConvert11b * 0.946352946;
textFieldConvert12b.setText(String.valueOf(decimalFormat.format(doubleConvert12b)) + suffixL);
}
if ((intImperialPickedb == 1) && (intMetricPickedb == 2)) {
doubleConvert12b = doubleConvert11b * 0.000946352946;
textFieldConvert12b.setText(String.valueOf(decimalFormat.format(doubleConvert12b)) + suffixKl);
}

//^^^ Pecks Picked ^^^
if ((intImperialPickedb == 2) && (intMetricPickedb == 0)) {
doubleConvert12b = doubleConvert11b * 8809.768;
textFieldConvert12b.setText(String.valueOf(decimalFormat.format(doubleConvert12b)) + suffixMl);
}
if ((intImperialPickedb == 2) && (intMetricPickedb == 1)) {
doubleConvert12b = doubleConvert11b * 8.809768;
textFieldConvert12b.setText(String.valueOf(decimalFormat.format(doubleConvert12b)) + suffixL);
}
if ((intImperialPickedb == 2) && (intMetricPickedb == 2)) {
doubleConvert12b = doubleConvert11b * 0.008809768;
textFieldConvert12b.setText(String.valueOf(decimalFormat.format(doubleConvert12b)) + suffixKl);
}

//^^^ Bushels Picked ^^^
if ((intImperialPickedb == 3) && (intMetricPickedb == 0)) {
doubleConvert12b = doubleConvert11b * 35239.072;
textFieldConvert12b.setText(String.valueOf(decimalFormat.format(doubleConvert12b)) + suffixMl);
}
if ((intImperialPickedb == 3) && (intMetricPickedb == 1)) {
doubleConvert12b = doubleConvert11b *35.239072;
textFieldConvert12b.setText(String.valueOf(decimalFormat.format(doubleConvert12b)) + suffixL);
}
if ((intImperialPickedb == 3) && (intMetricPickedb == 2)) {
doubleConvert12b = doubleConvert11b * 0.035239072;
textFieldConvert12b.setText(String.valueOf(decimalFormat.format(doubleConvert12b)) + suffixKl);
}
}

//################ Calculate convert volume metric to imperial ################
if (e.getSource() == buttonConvert14b) {
stringConvert12b = textFieldConvert12b.getText();
doubleConvert12b = Double.parseDouble(stringConvert12b);

//^^^ Pints Picked ^^^
if ((intImperialPickedb == 0) && (intMetricPickedb == 0)) {
doubleConvert11b = doubleConvert12b * 0.00211337642;
textFieldConvert11b.setText(String.valueOf(decimalFormat.format(doubleConvert11b)) + suffixPt);
}
if ((intImperialPickedb == 0) && (intMetricPickedb == 1)) {
doubleConvert11b = doubleConvert12b * 2.11337642;
textFieldConvert11b.setText(String.valueOf(decimalFormat.format(doubleConvert11b)) + suffixPt);
}
if ((intImperialPickedb == 0) && (intMetricPickedb == 2)) {
doubleConvert11b = doubleConvert12b * 2113.37642;
textFieldConvert11b.setText(String.valueOf(decimalFormat.format(doubleConvert11b)) + suffixPt);
}

//^^^ Quarts Picked ^^^
if ((intImperialPickedb == 1) && (intMetricPickedb == 0)) {
doubleConvert11b = doubleConvert12b * 0.00105668821;
textFieldConvert11b.setText(String.valueOf(decimalFormat.format(doubleConvert11b)) + suffixQt);
}
if ((intImperialPickedb == 1) && (intMetricPickedb == 1)) {
doubleConvert11b = doubleConvert12b * 1.05668821;
textFieldConvert11b.setText(String.valueOf(decimalFormat.format(doubleConvert11b)) + suffixQt);
}
if ((intImperialPickedb == 1) && (intMetricPickedb == 2)) {
doubleConvert11b = doubleConvert12b * 1056.68821;
textFieldConvert11b.setText(String.valueOf(decimalFormat.format(doubleConvert11b)) + suffixQt);
}

//^^^ Pecks Picked ^^^
if ((intImperialPickedb == 2) && (intMetricPickedb == 0)) {
doubleConvert11b = doubleConvert12b * 0.000113510367;
textFieldConvert11b.setText(String.valueOf(decimalFormat.format(doubleConvert11b)) + suffixPk);
}
if ((intImperialPickedb == 2) && (intMetricPickedb == 1)) {
doubleConvert11b = doubleConvert12b * 0.113510367;
textFieldConvert11b.setText(String.valueOf(decimalFormat.format(doubleConvert11b)) + suffixPk);
}
if ((intImperialPickedb == 2) && (intMetricPickedb == 2)) {
doubleConvert11b = doubleConvert12b * 113.510367;
textFieldConvert11b.setText(String.valueOf(decimalFormat.format(doubleConvert11b)) + suffixPk);
}

//^^^ Bushels Picked ^^^
if ((intImperialPickedb == 3) && (intMetricPickedb == 0)) {
doubleConvert11b = doubleConvert12b * 0.00002837759;
textFieldConvert11b.setText(String.valueOf(decimalFormat.format(doubleConvert11b)) + suffixBu);
}
if ((intImperialPickedb == 3) && (intMetricPickedb == 1)) {
doubleConvert11b = doubleConvert12b * 0.0283775918;
textFieldConvert11b.setText(String.valueOf(decimalFormat.format(doubleConvert11b)) + suffixBu);
}
if ((intImperialPickedb == 3) && (intMetricPickedb == 2)) {
doubleConvert11b = doubleConvert12b * 28.3775918;
textFieldConvert11b.setText(String.valueOf(decimalFormat.format(doubleConvert11b)) + suffixBu);
}
}


//^^^ Pick convert  int volume  imperial/metric^^^
if (e.getSource() == radioButtonConvert3b) {
intImperialPickedb = 0;
}
if (e.getSource() == radioButtonConvert4b) {
intMetricPickedb = 0;
}
if (e.getSource() == radioButtonConvert5b) {
intImperialPickedb = 1;
}
if (e.getSource() == radioButtonConvert6b) {
intMetricPickedb = 1;
}
if (e.getSource() == radioButtonConvert7b) {
intImperialPickedb = 2;
}
if (e.getSource() == radioButtonConvert8b) {
intMetricPickedb = 2;
}
if (e.getSource() == radioButtonConvert9b) {
intImperialPickedb = 3;
}


//################ Calculate convert area imperial to metric ################
if (e.getSource() == buttonConvert11c) {
stringConvert9c = textFieldConvert9c.getText();
doubleConvert9c = Double.parseDouble(stringConvert9c);

//^^^ Square feet Picked ^^^
if ((intImperialPickedc == 0) && (intMetricPickedc == 0)) {
doubleConvert10c = doubleConvert9c * 0.09290304;
textFieldConvert10c.setText(String.valueOf(decimalFormat.format(doubleConvert10c)) + suffixMSqr);
}
if ((intImperialPickedc == 0) && (intMetricPickedc == 1)) {
doubleConvert10c = doubleConvert9c * 0.0000092903;
textFieldConvert10c.setText(String.valueOf(decimalFormat.format(doubleConvert10c)) + suffixHa);
}
if ((intImperialPickedc == 0) && (intMetricPickedc == 2)) {
doubleConvert10c = doubleConvert9c * 0.000000092903;
textFieldConvert10c.setText(String.valueOf(decimalFormat.format(doubleConvert10c)) + suffixKmSqr);
}

//^^^ Acres Picked ^^^
if ((intImperialPickedc == 1) && (intMetricPickedc == 0)) {
doubleConvert10c = doubleConvert9c * 4046.85642 ;
textFieldConvert10c.setText(String.valueOf(decimalFormat.format(doubleConvert10c)) + suffixMSqr);
}
if ((intImperialPickedc == 1) && (intMetricPickedc == 1)) {
doubleConvert10c = doubleConvert9c * 0.404685642;
textFieldConvert10c.setText(String.valueOf(decimalFormat.format(doubleConvert10c)) + suffixHa);
}
if ((intImperialPickedc == 1) && (intMetricPickedc == 2)) {
doubleConvert10c = doubleConvert9c * 0.00404685642;
textFieldConvert10c.setText(String.valueOf(decimalFormat.format(doubleConvert10c)) + suffixKmSqr);
}


//^^^ Square miles Picked ^^^
if ((intImperialPickedc == 2) && (intMetricPickedc == 0)) {
doubleConvert10c = doubleConvert9c * 2589988.11;
textFieldConvert10c.setText(String.valueOf(decimalFormat.format(doubleConvert10c)) + suffixMSqr);
}
if ((intImperialPickedc == 2) && (intMetricPickedc == 1)) {
doubleConvert10c = doubleConvert9c * 258.998811;
textFieldConvert10c.setText(String.valueOf(decimalFormat.format(doubleConvert10c)) + suffixHa);
}
if ((intImperialPickedc == 2) && (intMetricPickedc == 2)) {
doubleConvert10c = doubleConvert9c * 2.58998811;
textFieldConvert10c.setText(String.valueOf(decimalFormat.format(doubleConvert10c)) + suffixKmSqr);
}

}

//################ Calculate convert area metric to imperial ################
if (e.getSource() == buttonConvert12c) {
stringConvert10c = textFieldConvert10c.getText();
doubleConvert10c = Double.parseDouble(stringConvert10c);

//^^^ Square feet Picked ^^^
if ((intImperialPickedc == 0) && (intMetricPickedc == 0)) {
doubleConvert9c = doubleConvert10c * 10.7639104;
textFieldConvert9c.setText(String.valueOf(decimalFormat.format(doubleConvert9c)) + suffixFtSqr);
}
if ((intImperialPickedc == 0) && (intMetricPickedc == 1)) {
doubleConvert9c = doubleConvert10c * 107639.104;
textFieldConvert9c.setText(String.valueOf(decimalFormat.format(doubleConvert9c)) + suffixFtSqr);
}
if ((intImperialPickedc == 0) && (intMetricPickedc == 2)) {
doubleConvert9c = doubleConvert10c * 10763910.4;
textFieldConvert9c.setText(String.valueOf(decimalFormat.format(doubleConvert9c)) + suffixFtSqr);
}
//^^^ Acres Picked ^^^
if ((intImperialPickedc == 1) && (intMetricPickedc == 0)) {
doubleConvert9c = doubleConvert10c * 0.000247105381;
textFieldConvert9c.setText(String.valueOf(decimalFormat.format(doubleConvert9c)) + suffixAc);
}
if ((intImperialPickedc == 1) && (intMetricPickedc == 1)) {
doubleConvert9c = doubleConvert10c * 2.47105381;
textFieldConvert9c.setText(String.valueOf(decimalFormat.format(doubleConvert9c)) + suffixAc);
}
if ((intImperialPickedc == 1) && (intMetricPickedc == 2)) {
doubleConvert9c = doubleConvert10c * 247.105381;
textFieldConvert9c.setText(String.valueOf(decimalFormat.format(doubleConvert9c)) + suffixAc);
}


//^^^ Square miles Picked ^^^
if ((intImperialPickedc == 2) && (intMetricPickedc == 0)) {
doubleConvert9c = doubleConvert10c * 0.000000386102;
textFieldConvert9c.setText(String.valueOf(decimalFormat.format(doubleConvert9c)) + suffixMiSqr);
}
if ((intImperialPickedc == 2) && (intMetricPickedc == 1)) {
doubleConvert9c = doubleConvert10c * 0.00386102159;
textFieldConvert9c.setText(String.valueOf(decimalFormat.format(doubleConvert9c)) + suffixMiSqr);
}
if ((intImperialPickedc == 2) && (intMetricPickedc == 2)) {
doubleConvert9c = doubleConvert10c * 0.386102159;
textFieldConvert9c.setText(String.valueOf(decimalFormat.format(doubleConvert9c)) + suffixMiSqr);
}

}


//^^^ Pick convert int area imperial/metric^^^
if (e.getSource() == radioButtonConvert3c) {
intImperialPickedc = 0;
}
if (e.getSource() == radioButtonConvert4c) {
intMetricPickedc = 0;
}
if (e.getSource() == radioButtonConvert5c) {
intImperialPickedc = 1;
}
if (e.getSource() == radioButtonConvert6c) {
intMetricPickedc = 1;
}
if (e.getSource() == radioButtonConvert7c) {
intImperialPickedc = 2;
}
if (e.getSource() == radioButtonConvert8c) {
intMetricPickedc = 2;
}


//################ Calculate convert speed imperial to metric ################
if (e.getSource() == buttonConvert11f) {
stringConvert9f = textFieldConvert9f.getText();
doubleConvert9f = Double.parseDouble(stringConvert9f);

//^^^ ft/s Picked ^^^
if ((intImperialPickedf == 0) && (intMetricPickedf == 0)) {
doubleConvert10f = doubleConvert9f * 0.3048;
textFieldConvert10f.setText(String.valueOf(decimalFormat.format(doubleConvert10f)) + suffixMS);
}
if ((intImperialPickedf == 0) && (intMetricPickedf == 1)) {
doubleConvert10f = doubleConvert9f * 1.10;
textFieldConvert10f.setText(String.valueOf(decimalFormat.format(doubleConvert10f)) + suffixKmH);
}
if ((intImperialPickedf == 0) && (intMetricPickedf == 2)) {
doubleConvert10f = doubleConvert9f * 0.000305;
textFieldConvert10f.setText(String.valueOf(decimalFormat.format(doubleConvert10f)) + suffixKmS);
}

//^^^ mi/h Picked ^^^
if ((intImperialPickedf == 1) && (intMetricPickedf == 0)) {
doubleConvert10f = doubleConvert9f * 0.44704;
textFieldConvert10f.setText(String.valueOf(decimalFormat.format(doubleConvert10f)) + suffixMS);
}
if ((intImperialPickedf == 1) && (intMetricPickedf == 1)) {
doubleConvert10f = doubleConvert9f * 1.609344;
textFieldConvert10f.setText(String.valueOf(decimalFormat.format(doubleConvert10f)) + suffixKmH);
}
if ((intImperialPickedf == 1) && (intMetricPickedf == 2)) {
doubleConvert10f = doubleConvert9f * 0.00044704;
textFieldConvert10f.setText(String.valueOf(decimalFormat.format(doubleConvert10f)) + suffixKmS);
}


//^^^ mi/s Picked ^^^
if ((intImperialPickedf == 2) && (intMetricPickedf == 0)) {
doubleConvert10f = doubleConvert9f * 1609.344;
textFieldConvert10f.setText(String.valueOf(decimalFormat.format(doubleConvert10f)) + suffixMS);
}
if ((intImperialPickedf == 2) && (intMetricPickedf == 1)) {
doubleConvert10f = doubleConvert9f * 5793.6384;
textFieldConvert10f.setText(String.valueOf(decimalFormat.format(doubleConvert10f)) + suffixKmH);
}
if ((intImperialPickedf == 2) && (intMetricPickedf == 2)) {
doubleConvert10f = doubleConvert9f * 1.609344;
textFieldConvert10f.setText(String.valueOf(decimalFormat.format(doubleConvert10f)) + suffixKmS);
}

}

//################ Calculate convert speed metric to imperial ################
if (e.getSource() == buttonConvert12f) {
stringConvert10f = textFieldConvert10f.getText();
doubleConvert10f = Double.parseDouble(stringConvert10f);

//^^^ ft/s Picked ^^^
if ((intImperialPickedf == 0) && (intMetricPickedf == 0)) {
doubleConvert9f = doubleConvert10f * 3.2808399;
textFieldConvert9f.setText(String.valueOf(decimalFormat.format(doubleConvert9f)) + suffixFtS);
}
if ((intImperialPickedf == 0) && (intMetricPickedf == 1)) {
doubleConvert9f = doubleConvert10f * 0.911344415;
textFieldConvert9f.setText(String.valueOf(decimalFormat.format(doubleConvert9f)) + suffixFtS);
}
if ((intImperialPickedf == 0) && (intMetricPickedf == 2)) {
doubleConvert9f = doubleConvert10f * 3280.8399;
textFieldConvert9f.setText(String.valueOf(decimalFormat.format(doubleConvert9f)) + suffixFtS);
}
//^^^ mi/h Picked ^^^
if ((intImperialPickedf == 1) && (intMetricPickedf == 0)) {
doubleConvert9f = doubleConvert10f * 2.23693629;
textFieldConvert9f.setText(String.valueOf(decimalFormat.format(doubleConvert9f)) + suffixMiH);
}
if ((intImperialPickedf == 1) && (intMetricPickedf == 1)) {
doubleConvert9f = doubleConvert10f * 0.621371192;
textFieldConvert9f.setText(String.valueOf(decimalFormat.format(doubleConvert9f)) + suffixMiH);
}
if ((intImperialPickedf == 1) && (intMetricPickedf == 2)) {
doubleConvert9f = doubleConvert10f * 2236.93629;
textFieldConvert9f.setText(String.valueOf(decimalFormat.format(doubleConvert9f)) + suffixMiH);
}


//^^^ mi/s Picked ^^^
if ((intImperialPickedf == 2) && (intMetricPickedf == 0)) {
doubleConvert9f = doubleConvert10f * 00.000621371192;
textFieldConvert9f.setText(String.valueOf(decimalFormat.format(doubleConvert9f)) + suffixMiS);
}
if ((intImperialPickedf == 2) && (intMetricPickedf == 1)) {
doubleConvert9f = doubleConvert10f * 0.000172603109;
textFieldConvert9f.setText(String.valueOf(decimalFormat.format(doubleConvert9f)) + suffixMiS);
}
if ((intImperialPickedf == 2) && (intMetricPickedf == 2)) {
doubleConvert9f = doubleConvert10f * 0.621371192;
textFieldConvert9f.setText(String.valueOf(decimalFormat.format(doubleConvert9f)) + suffixMiS);
}

}


//^^^ Pick convert int speed imperial/metric^^^
if (e.getSource() == radioButtonConvert3f) {
intImperialPickedf = 0;
}
if (e.getSource() == radioButtonConvert4f) {
intMetricPickedf = 0;
}
if (e.getSource() == radioButtonConvert5f) {
intImperialPickedf = 1;
}
if (e.getSource() == radioButtonConvert6f) {
intMetricPickedf = 1;
}
if (e.getSource() == radioButtonConvert7f) {
intImperialPickedf = 2;
}
if (e.getSource() == radioButtonConvert8f) {
intMetricPickedf = 2;
}


//################ Calculate convert acceleration imperial to metric ################
if (e.getSource() == buttonConvert9g) {
stringConvert7g = textFieldConvert7g.getText();
doubleConvert7g = Double.parseDouble(stringConvert7g);

//^^^ ft/s2 Picked ^^^
if ((intImperialPickedg == 0) && (intMetricPickedg == 0)) {
doubleConvert8g = doubleConvert7g * 0.3048;
textFieldConvert8g.setText(String.valueOf(decimalFormat.format(doubleConvert8g)) + suffixMSSqr);
}
if ((intImperialPickedg == 0) && (intMetricPickedg == 1)) {
doubleConvert8g = doubleConvert7g * 1.09728;
textFieldConvert8g.setText(String.valueOf(decimalFormat.format(doubleConvert8g)) + suffixKmHS);
}

//^^^ mi/hs Picked ^^^
if ((intImperialPickedg == 1) && (intMetricPickedg == 0)) {
doubleConvert8g = doubleConvert7g * 0.44704;
textFieldConvert8g.setText(String.valueOf(decimalFormat.format(doubleConvert8g)) + suffixMSSqr);
}
if ((intImperialPickedg == 1) && (intMetricPickedg == 1)) {
doubleConvert8g = doubleConvert7g * 1.609344;
textFieldConvert8g.setText(String.valueOf(decimalFormat.format(doubleConvert8g)) + suffixKmHS);
}

}

//################ Calculate convert acceleration  metric to imperial ################
if (e.getSource() == buttonConvert10g) {
stringConvert8g = textFieldConvert8g.getText();
doubleConvert8g = Double.parseDouble(stringConvert8g);

//^^^ ft/s2 Picked ^^^
if ((intImperialPickedg == 0) && (intMetricPickedg == 0)) {
doubleConvert7g = doubleConvert8g * 3.2808399;
textFieldConvert7g.setText(String.valueOf(decimalFormat.format(doubleConvert7g)) + suffixFtSSqr);
}
if ((intImperialPickedg == 0) && (intMetricPickedg == 1)) {
doubleConvert7g = doubleConvert8g * 0.911344415;
textFieldConvert7g.setText(String.valueOf(decimalFormat.format(doubleConvert7g)) + suffixFtSSqr);
}

//^^^ mi/hs Picked ^^^
if ((intImperialPickedg == 1) && (intMetricPickedg == 0)) {
doubleConvert7g = doubleConvert8g * 2.23693629;
textFieldConvert7g.setText(String.valueOf(decimalFormat.format(doubleConvert7g)) + suffixMiHS);
}
if ((intImperialPickedg == 1) && (intMetricPickedg == 1)) {
doubleConvert7g = doubleConvert8g * 0.621371192;
textFieldConvert7g.setText(String.valueOf(decimalFormat.format(doubleConvert7g)) + suffixMiHS);
}
}


//^^^ Pick convert int acceleration imperial/metric^^^
if (e.getSource() == radioButtonConvert3g) {
intImperialPickedg = 0;
}
if (e.getSource() == radioButtonConvert4g) {
intMetricPickedg = 0;
}
if (e.getSource() == radioButtonConvert5g) {
intImperialPickedg = 1;
}
if (e.getSource() == radioButtonConvert6g) {
intMetricPickedg = 1;
}

//################ Calculate convert density imperial to metric ################
if (e.getSource() == buttonConvert15h) {
stringConvert13h = textFieldConvert13h.getText();
doubleConvert13h = Double.parseDouble(stringConvert13h);

//^^^ Oz/inch^3 Picked ^^^
if ((intImperialPickedh == 0) && (intMetricPickedh == 0)) {
doubleConvert14h = doubleConvert13h * 1.72999404;
textFieldConvert14h.setText(String.valueOf(decimalFormat.format(doubleConvert14h)) + suffixGCmSqr3);
}
if ((intImperialPickedh == 0) && (intMetricPickedh == 1)) {
doubleConvert14h = doubleConvert13h * 1729.99404; 
textFieldConvert14h.setText(String.valueOf(decimalFormat.format(doubleConvert14h)) + suffixKgMSqr3);
}


//^^^ Pounds/inch^3 Picked ^^^
if ((intImperialPickedh == 1) && (intMetricPickedh == 0)) {
doubleConvert14h = doubleConvert13h * 27.6799047;
textFieldConvert14h.setText(String.valueOf(decimalFormat.format(doubleConvert14h)) + suffixGCmSqr3);
}
if ((intImperialPickedh == 1) && (intMetricPickedh == 1)) {
doubleConvert14h = doubleConvert13h * 27679.9047;
textFieldConvert14h.setText(String.valueOf(decimalFormat.format(doubleConvert14h)) + suffixKgMSqr3);
}



//^^^ Slug/feet^3 Picked ^^^
if ((intImperialPickedh == 2) && (intMetricPickedh == 0)) {
doubleConvert14h = doubleConvert13h * 0.5153788184;
textFieldConvert14h.setText(String.valueOf(decimalFormat.format(doubleConvert14h)) + suffixGCmSqr3);
}
if ((intImperialPickedh == 2) && (intMetricPickedh == 1)) {
doubleConvert14h = doubleConvert13h * 515.378818;
textFieldConvert14h.setText(String.valueOf(decimalFormat.format(doubleConvert14h)) + suffixKgMSqr3);
}


// ^^^ Pounds/gal Picked ^^^
if ((intImperialPickedh == 3) && (intMetricPickedh == 0)) {
doubleConvert14h = doubleConvert13h * 0.119826427;
textFieldConvert14h.setText(String.valueOf(decimalFormat.format(doubleConvert14h)) + suffixGCmSqr3);
}
if ((intImperialPickedh == 3) && (intMetricPickedh == 1)) {
doubleConvert14h = doubleConvert13h * 119.826427;
textFieldConvert14h.setText(String.valueOf(decimalFormat.format(doubleConvert14h)) + suffixKgMSqr3);
}


//^^^ Pounds/foot^3 Picked ^^^
if ((intImperialPickedh == 4) && (intMetricPickedh == 0)) {
doubleConvert14h = doubleConvert13h * 0.0160184634;
textFieldConvert14h.setText(String.valueOf(decimalFormat.format(doubleConvert14h)) + suffixGCmSqr3);
}
if ((intImperialPickedh == 4) && (intMetricPickedh == 1)) {
doubleConvert14h = doubleConvert13h * 16.0184634;
textFieldConvert14h.setText(String.valueOf(decimalFormat.format(doubleConvert14h)) + suffixKgMSqr3);
}



}

//################ Calculate convert density metric to imperial ################
if (e.getSource() == buttonConvert16h) {
stringConvert14h = textFieldConvert14h.getText();
doubleConvert14h = Double.parseDouble(stringConvert14h);

//^^^ Oz/inch^3 Picked ^^^
if ((intImperialPickedh == 0) && (intMetricPickedh == 0)) {
doubleConvert13h = doubleConvert14h * 0.578036672;
textFieldConvert13h.setText(String.valueOf(decimalFormat.format(doubleConvert13h)) + suffixOzInSqr3);
}
if ((intImperialPickedh == 0) && (intMetricPickedh == 1)) {
doubleConvert13h = doubleConvert14h * 0.000578036672;
textFieldConvert13h.setText(String.valueOf(decimalFormat.format(doubleConvert13h)) + suffixOzInSqr3);
}

//^^^ Pounds/inch^3 Picked ^^^
if ((intImperialPickedh == 1) && (intMetricPickedh == 0)) {
doubleConvert13h = doubleConvert14h * 0.036127292;
textFieldConvert13h.setText(String.valueOf(decimalFormat.format(doubleConvert13h)) + suffixLbInSqr3);
}
if ((intImperialPickedh == 1) && (intMetricPickedh == 1)) {
doubleConvert13h = doubleConvert14h * 0.00003612729;
textFieldConvert13h.setText(String.valueOf(decimalFormat.format(doubleConvert13h)) + suffixLbInSqr3);
}


//^^^ Slug/ft^3 Picked ^^^
if ((intImperialPickedh == 2) && (intMetricPickedh == 0)) {
doubleConvert13h = doubleConvert14h * 1.94032033;
textFieldConvert13h.setText(String.valueOf(decimalFormat.format(doubleConvert13h)) + suffixOzFtSqr3);
}
if ((intImperialPickedh == 2) && (intMetricPickedh == 1)) {
doubleConvert13h = doubleConvert14h * 0.00194032033;
textFieldConvert13h.setText(String.valueOf(decimalFormat.format(doubleConvert13h)) + suffixOzFtSqr3);
}


//^^^ Pounds/gal Picked ^^^
if ((intImperialPickedh == 3) && (intMetricPickedh == 0)) {
doubleConvert13h = doubleConvert14h * 8.34540445;
textFieldConvert13h.setText(String.valueOf(decimalFormat.format(doubleConvert13h)) + suffixLbGal);
}
if ((intImperialPickedh == 3) && (intMetricPickedh == 1)) {
doubleConvert13h = doubleConvert14h * 0.00834540445;
textFieldConvert13h.setText(String.valueOf(decimalFormat.format(doubleConvert13h)) + suffixLbGal);
}


//^^^ Pounds/foot^3 Picked ^^^
if ((intImperialPickedh == 4) && (intMetricPickedh == 0)) {
doubleConvert13h = doubleConvert14h * 62.4279606;
textFieldConvert13h.setText(String.valueOf(decimalFormat.format(doubleConvert13h)) + suffixLbFtSqr3);
}
if ((intImperialPickedh == 4) && (intMetricPickedh == 1)) {
doubleConvert13h = doubleConvert14h * 0.0624279606;
textFieldConvert13h.setText(String.valueOf(decimalFormat.format(doubleConvert13h)) + suffixLbFtSqr3);
}


}


//^^^ Pick convert int density imperial/metric^^^
if (e.getSource() == radioButtonConvert3h) {
intImperialPickedh = 0;
}
if (e.getSource() == radioButtonConvert4h) {
intMetricPickedh = 0;
}
if (e.getSource() == radioButtonConvert5h) {
intImperialPickedh = 1;
}
if (e.getSource() == radioButtonConvert6h) {
intMetricPickedh = 1;
}
if (e.getSource() == radioButtonConvert7h) {
intImperialPickedh = 2;
}
if (e.getSource() == radioButtonConvert9h) {
intImperialPickedh = 3;
}
if (e.getSource() == radioButtonConvert11h) {
intImperialPickedh = 4;
}


//################ Calculate convert angle ###############
if (e.getSource() == buttonConvert15i) {
stringConvert13i = textFieldConvert13i.getText();
doubleConvert13i = Double.parseDouble(stringConvert13i);

//^^^ Seconds Picked ^^^
if ((intMetricPickedFirsti == 0) && (intMetricPickedSecondi == 0)) {
doubleConvert14i = doubleConvert13i;
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixArcsec);
}
if ((intMetricPickedFirsti == 0) && (intMetricPickedSecondi == 1)) {
doubleConvert14i = doubleConvert13i * 0.0166666667; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixArcmin);
}
if ((intMetricPickedFirsti == 0) && (intMetricPickedSecondi == 2)) {
doubleConvert14i = doubleConvert13i * 0.000277777778; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixDeg);
}
if ((intMetricPickedFirsti == 0) && (intMetricPickedSecondi == 3)) {
doubleConvert14i = doubleConvert13i * 0.00000484813; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixR);
}
if ((intMetricPickedFirsti == 0) && (intMetricPickedSecondi == 4)) {
doubleConvert14i = doubleConvert13i * 0.000000771604; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixRev);
}


//^^^ Minutes Picked ^^^
if ((intMetricPickedFirsti == 1) && (intMetricPickedSecondi == 0)) {
doubleConvert14i = doubleConvert13i * 60;
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixArcsec);
}
if ((intMetricPickedFirsti == 1) && (intMetricPickedSecondi == 1)) {
doubleConvert14i = doubleConvert13i; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixArcmin);
}
if ((intMetricPickedFirsti == 1) && (intMetricPickedSecondi == 2)) {
doubleConvert14i = doubleConvert13i * 0.0166666667; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixDeg);
}
if ((intMetricPickedFirsti == 1) && (intMetricPickedSecondi == 3)) {
doubleConvert14i = doubleConvert13i * 0.000290888209; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixR);
}
if ((intMetricPickedFirsti == 1) && (intMetricPickedSecondi == 4)) {
doubleConvert14i = doubleConvert13i * 0.00004629629; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixRev);
}



//^^^ Degrees Picked ^^^
if ((intMetricPickedFirsti == 2) && (intMetricPickedSecondi == 0)) {
doubleConvert14i = doubleConvert13i * 3600;
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixArcsec);
}
if ((intMetricPickedFirsti == 2) && (intMetricPickedSecondi == 1)) {
doubleConvert14i = doubleConvert13i * 60; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixArcmin);
}
if ((intMetricPickedFirsti == 2) && (intMetricPickedSecondi == 2)) {
doubleConvert14i = doubleConvert13i; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixDeg);
}
if ((intMetricPickedFirsti == 2) && (intMetricPickedSecondi == 3)) {
doubleConvert14i = doubleConvert13i * 0.0174532925; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixR);
}
if ((intMetricPickedFirsti == 2) && (intMetricPickedSecondi == 4)) {
doubleConvert14i = doubleConvert13i * 0.00277777778; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixRev);
}


//^^^ Radians Picked ^^^
if ((intMetricPickedFirsti == 3) && (intMetricPickedSecondi == 0)) {
doubleConvert14i = doubleConvert13i * 206264.806;
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixArcsec);
}
if ((intMetricPickedFirsti == 3) && (intMetricPickedSecondi == 1)) {
doubleConvert14i = doubleConvert13i * 3437.74677; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixArcmin);
}
if ((intMetricPickedFirsti == 3) && (intMetricPickedSecondi == 2)) {
doubleConvert14i = doubleConvert13i * 57.2957795; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixDeg);
}
if ((intMetricPickedFirsti == 3) && (intMetricPickedSecondi == 3)) {
doubleConvert14i = doubleConvert13i; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixR);
}
if ((intMetricPickedFirsti == 3) && (intMetricPickedSecondi == 4)) {
doubleConvert14i = doubleConvert13i * 0.159154943; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixRev);
}


//^^^ Revolutions Picked ^^^
if ((intMetricPickedFirsti == 4) && (intMetricPickedSecondi == 0)) {
doubleConvert14i = doubleConvert13i * 1296000;
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixArcsec);
}
if ((intMetricPickedFirsti == 4) && (intMetricPickedSecondi == 1)) {
doubleConvert14i = doubleConvert13i * 21600; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixArcmin);
}
if ((intMetricPickedFirsti == 4) && (intMetricPickedSecondi == 2)) {
doubleConvert14i = doubleConvert13i * 360; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixDeg);
}
if ((intMetricPickedFirsti == 4) && (intMetricPickedSecondi == 3)) {
doubleConvert14i = doubleConvert13i * 6.28318531; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixR);
}
if ((intMetricPickedFirsti == 4) && (intMetricPickedSecondi == 4)) {
doubleConvert14i = doubleConvert13i; 
textFieldConvert14i.setText(String.valueOf(decimalFormat.format(doubleConvert14i)) + suffixRev);
}

}

//^^^ Pick convert int angle^^^
if (e.getSource() == radioButtonConvert3i) {
intMetricPickedFirsti = 0;
}
if (e.getSource() == radioButtonConvert4i) {
intMetricPickedSecondi = 0;
}
if (e.getSource() == radioButtonConvert5i) {
intMetricPickedFirsti = 1;
}
if (e.getSource() == radioButtonConvert6i) {
intMetricPickedSecondi = 1;
}
if (e.getSource() == radioButtonConvert7i) {
intMetricPickedFirsti = 2;
}
if (e.getSource() == radioButtonConvert8i) {
intMetricPickedSecondi = 2;
}
if (e.getSource() == radioButtonConvert9i) {
intMetricPickedFirsti = 3;
}
if (e.getSource() == radioButtonConvert10i) {
intMetricPickedSecondi = 3;
}
if (e.getSource() == radioButtonConvert11i) {
intMetricPickedFirsti = 4;
}
if (e.getSource() == radioButtonConvert12i) {
intMetricPickedSecondi = 4;
}


//################ Calculate convert number ###############
if (e.getSource() == buttonConvert13j) {
stringConvert11j = textFieldConvert11j.getText();

//^^^ Binary ^^^
if ((intMetricPickedFirstj == 0) && (intMetricPickedSecondj == 0)) {
intConvert12j = Integer.parseInt(stringConvert11j);
textFieldConvert12j.setText(String.valueOf(intConvert12j) + suffixBin);
}
if ((intMetricPickedFirstj == 0) && (intMetricPickedSecondj == 1)) {
intConvert12j = Integer.parseInt(stringConvert11j, 2);
textFieldConvert12j.setText(Integer.toOctalString(intConvert12j) + suffixOct);
}
if ((intMetricPickedFirstj == 0) && (intMetricPickedSecondj == 2)) {
intConvert12j = Integer.parseInt(stringConvert11j, 2);
textFieldConvert12j.setText(String.valueOf(intConvert12j) + suffixDec);
}
if ((intMetricPickedFirstj == 0) && (intMetricPickedSecondj == 3)) {
intConvert12j = Integer.parseInt(stringConvert11j, 2);
textFieldConvert12j.setText(Integer.toHexString(intConvert12j).toUpperCase() + suffixHex);
}

//^^^ Octal Picked ^^^
if ((intMetricPickedFirstj == 1) && (intMetricPickedSecondj == 0)) {
intConvert12j = Integer.parseInt(stringConvert11j, 8);
textFieldConvert12j.setText(Integer.toBinaryString(intConvert12j) + suffixBin);
}
if ((intMetricPickedFirstj == 1) && (intMetricPickedSecondj == 1)) {
intConvert12j = Integer.parseInt(stringConvert11j, 8);
textFieldConvert12j.setText(Integer.toOctalString(intConvert12j) + suffixOct);
}
if ((intMetricPickedFirstj == 1) && (intMetricPickedSecondj == 2)) {
intConvert12j = Integer.parseInt(stringConvert11j, 8);
textFieldConvert12j.setText(String.valueOf(intConvert12j) + suffixDec);
}
if ((intMetricPickedFirstj == 1) && (intMetricPickedSecondj == 3)) {
intConvert12j = Integer.parseInt(stringConvert11j, 8);
textFieldConvert12j.setText(Integer.toHexString(intConvert12j).toUpperCase() + suffixHex);
}



//^^^ Decimal Picked ^^^
if ((intMetricPickedFirstj == 2) && (intMetricPickedSecondj == 0)) {
intConvert12j = Integer.parseInt(stringConvert11j);
textFieldConvert12j.setText(Integer.toBinaryString(intConvert12j) + suffixBin);
}
if ((intMetricPickedFirstj == 2) && (intMetricPickedSecondj == 1)) {
intConvert12j = Integer.parseInt(stringConvert11j);
textFieldConvert12j.setText(Integer.toOctalString(intConvert12j) + suffixOct);
}
if ((intMetricPickedFirstj == 2) && (intMetricPickedSecondj == 2)) {
intConvert12j = Integer.parseInt(stringConvert11j);
textFieldConvert12j.setText(String.valueOf(intConvert12j) + suffixDec);
}
if ((intMetricPickedFirstj == 2) && (intMetricPickedSecondj == 3)) {
intConvert12j = Integer.parseInt(stringConvert11j);
textFieldConvert12j.setText(Integer.toHexString(intConvert12j).toUpperCase() + suffixHex);
}


//^^^ Hexadecimal Picked ^^^
if ((intMetricPickedFirstj == 3) && (intMetricPickedSecondj == 0)) {
intConvert12j = Integer.parseInt(stringConvert11j, 16);
textFieldConvert12j.setText(Integer.toBinaryString(intConvert12j) + suffixBin);
}
if ((intMetricPickedFirstj == 3) && (intMetricPickedSecondj == 1)) {
intConvert12j = Integer.parseInt(stringConvert11j, 16);
textFieldConvert12j.setText(Integer.toOctalString(intConvert12j) + suffixOct);
}
if ((intMetricPickedFirstj == 3) && (intMetricPickedSecondj == 2)) {
intConvert12j = Integer.parseInt(stringConvert11j, 16);
textFieldConvert12j.setText(String.valueOf(intConvert12j) + suffixDec);
}
if ((intMetricPickedFirstj == 3) && (intMetricPickedSecondj == 3)) {
intConvert12j = Integer.parseInt(stringConvert11j, 16);
textFieldConvert12j.setText(Integer.toHexString(intConvert12j).toUpperCase() + suffixHex);
}

}

//^^^ Pick convert int angle^^^
if (e.getSource() == radioButtonConvert3j) {
intMetricPickedFirstj = 0;
}
if (e.getSource() == radioButtonConvert4j) {
intMetricPickedSecondj = 0;
}
if (e.getSource() == radioButtonConvert5j) {
intMetricPickedFirstj = 1;
}
if (e.getSource() == radioButtonConvert6j) {
intMetricPickedSecondj = 1;
}
if (e.getSource() == radioButtonConvert7j) {
intMetricPickedFirstj = 2;
}
if (e.getSource() == radioButtonConvert8j) {
intMetricPickedSecondj = 2;
}
if (e.getSource() == radioButtonConvert9j) {
intMetricPickedFirstj = 3;
}
if (e.getSource() == radioButtonConvert10j) {
intMetricPickedSecondj = 3;
}


//################ Calculate convert data ###############
if (e.getSource() == buttonConvert17k) {
stringConvert15k = textFieldConvert15k.getText();
doubleConvert15k = Double.parseDouble(stringConvert15k);

//^^^ Bits Picked ^^^
if ((intMetricPickedFirstk == 0) && (intMetricPickedSecondk == 0)) {
doubleConvert16k = doubleConvert15k;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixB);
}
if ((intMetricPickedFirstk == 0) && (intMetricPickedSecondk == 1)) {
doubleConvert16k = doubleConvert15k * 0.125;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixBy);
}
if ((intMetricPickedFirstk == 0) && (intMetricPickedSecondk == 2)) {
doubleConvert16k = doubleConvert15k * 0.0001220703;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixKB);
}
if ((intMetricPickedFirstk == 0) && (intMetricPickedSecondk == 3)) {
doubleConvert16k = doubleConvert15k * 0.000000119209;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixMB);
}
if ((intMetricPickedFirstk == 0) && (intMetricPickedSecondk == 4)) {
doubleConvert16k = doubleConvert15k * 0.000000000116415;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixGB);
}
if ((intMetricPickedFirstk == 0) && (intMetricPickedSecondk == 5)) {
doubleConvert16k = doubleConvert15k * 0.000000000000113686;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixTB);
}


//^^^ Bytes Picked ^^^
if ((intMetricPickedFirstk == 1) && (intMetricPickedSecondk == 0)) {
doubleConvert16k = doubleConvert15k * 8;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixB);
}
if ((intMetricPickedFirstk == 1) && (intMetricPickedSecondk == 1)) {
doubleConvert16k = doubleConvert15k;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixBy);
}
if ((intMetricPickedFirstk == 1) && (intMetricPickedSecondk == 2)) {
doubleConvert16k = doubleConvert15k * 0.0009765625;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixKB);
}
if ((intMetricPickedFirstk == 1) && (intMetricPickedSecondk == 3)) {
doubleConvert16k = doubleConvert15k * 0.000000953674;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixMB);
}
if ((intMetricPickedFirstk == 1) && (intMetricPickedSecondk == 4)) {
doubleConvert16k = doubleConvert15k * 0.000000000931322;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixGB);
}
if ((intMetricPickedFirstk == 1) && (intMetricPickedSecondk == 5)) {
doubleConvert16k = doubleConvert15k * 0.000000000000909494;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixTB);
}



//^^^ Kilobytes Picked ^^^
if ((intMetricPickedFirstk == 2) && (intMetricPickedSecondk == 0)) {
doubleConvert16k = doubleConvert15k * 8192;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixB);
}
if ((intMetricPickedFirstk == 2) && (intMetricPickedSecondk == 1)) {
doubleConvert16k = doubleConvert15k * 1024;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixBy);
}
if ((intMetricPickedFirstk == 2) && (intMetricPickedSecondk == 2)) {
doubleConvert16k = doubleConvert15k;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixKB);
}
if ((intMetricPickedFirstk == 2) && (intMetricPickedSecondk == 3)) {
doubleConvert16k = doubleConvert15k * 0.0009765625;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixMB);
}
if ((intMetricPickedFirstk == 2) && (intMetricPickedSecondk == 4)) {
doubleConvert16k = doubleConvert15k * 0.000000953674;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixGB);
}
if ((intMetricPickedFirstk == 2) && (intMetricPickedSecondk == 5)) {
doubleConvert16k = doubleConvert15k * 0.000000000931322;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixTB);
}


//^^^ Megabytes Picked ^^^
if ((intMetricPickedFirstk == 3) && (intMetricPickedSecondk == 0)) {
doubleConvert16k = doubleConvert15k * 8388608;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixB);
}
if ((intMetricPickedFirstk == 3) && (intMetricPickedSecondk == 1)) {
doubleConvert16k = doubleConvert15k * 1048576;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixBy);
}
if ((intMetricPickedFirstk == 3) && (intMetricPickedSecondk == 2)) {
doubleConvert16k = doubleConvert15k * 1024;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixKB);
}
if ((intMetricPickedFirstk == 3) && (intMetricPickedSecondk == 3)) {
doubleConvert16k = doubleConvert15k;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixMB);
}
if ((intMetricPickedFirstk == 3) && (intMetricPickedSecondk == 4)) {
doubleConvert16k = doubleConvert15k * 0.0009765625;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixGB);
}
if ((intMetricPickedFirstk == 3) && (intMetricPickedSecondk == 5)) {
doubleConvert16k = doubleConvert15k * 0.000000953674;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixTB);
}


//^^^ Gigabytes Picked ^^^
if ((intMetricPickedFirstk == 4) && (intMetricPickedSecondk == 0)) {
doubleConvert16k = doubleConvert15k * 858993459.2 * 10;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixB);
}
if ((intMetricPickedFirstk == 4) && (intMetricPickedSecondk == 1)) {
doubleConvert16k = doubleConvert15k * 1073741824;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixBy);
}
if ((intMetricPickedFirstk == 4) && (intMetricPickedSecondk == 2)) {
doubleConvert16k = doubleConvert15k * 1048576;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixKB);
}
if ((intMetricPickedFirstk == 4) && (intMetricPickedSecondk == 3)) {
doubleConvert16k = doubleConvert15k * 1024;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixMB);
}
if ((intMetricPickedFirstk == 4) && (intMetricPickedSecondk == 4)) {
doubleConvert16k = doubleConvert15k;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixGB);
}
if ((intMetricPickedFirstk == 4) && (intMetricPickedSecondk == 5)) {
doubleConvert16k = doubleConvert15k * 0.0009765625;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixTB);
}

//^^^ Terabytes Picked ^^^
if ((intMetricPickedFirstk == 5) && (intMetricPickedSecondk == 0)) {
doubleConvert16k = doubleConvert15k * 879609302220.8 * 10;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixB);
}
if ((intMetricPickedFirstk == 5) && (intMetricPickedSecondk == 1)) {
doubleConvert16k = doubleConvert15k * 109951162777.6 * 10;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixBy);
}
if ((intMetricPickedFirstk == 5) && (intMetricPickedSecondk == 2)) {
doubleConvert16k = doubleConvert15k * 1073741824;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixKB);
}
if ((intMetricPickedFirstk == 5) && (intMetricPickedSecondk == 3)) {
doubleConvert16k = doubleConvert15k * 1048576;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixMB);
}
if ((intMetricPickedFirstk == 5) && (intMetricPickedSecondk == 4)) {
doubleConvert16k = doubleConvert15k * 1024;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixGB);
}
if ((intMetricPickedFirstk == 5) && (intMetricPickedSecondk == 5)) {
doubleConvert16k = doubleConvert15k;
textFieldConvert16k.setText(String.valueOf(decimalFormat.format(doubleConvert16k)) + suffixTB);
}

}

//^^^ Pick convert int data^^^
if (e.getSource() == radioButtonConvert3k) {
intMetricPickedFirstk = 0;
}
if (e.getSource() == radioButtonConvert4k) {
intMetricPickedSecondk = 0;
}
if (e.getSource() == radioButtonConvert5k) {
intMetricPickedFirstk = 1;
}
if (e.getSource() == radioButtonConvert6k) {
intMetricPickedSecondk = 1;
}
if (e.getSource() == radioButtonConvert7k) {
intMetricPickedFirstk = 2;
}
if (e.getSource() == radioButtonConvert8k) {
intMetricPickedSecondk = 2;
}
if (e.getSource() == radioButtonConvert9k) {
intMetricPickedFirstk = 3;
}
if (e.getSource() == radioButtonConvert10k) {
intMetricPickedSecondk = 3;
}
if (e.getSource() == radioButtonConvert11k) {
intMetricPickedFirstk = 4;
}
if (e.getSource() == radioButtonConvert12k) {
intMetricPickedSecondk = 4;
}
if (e.getSource() == radioButtonConvert13k) {
intMetricPickedFirstk = 5;
}
if (e.getSource() == radioButtonConvert14k) {
intMetricPickedSecondk = 5;
}


//################ Calculate convert units to pixels ###############
if (e.getSource() == buttonConvert13l) {
stringConvert11l = textFieldConvert11l.getText();
doubleConvert11l = Double.parseDouble(stringConvert11l);
stringConvert8l = textFieldConvert8l.getText();
doubleConvert8l = Double.parseDouble(stringConvert8l);
if (intUnitPickedl == 0) {
doubleConvert12l = doubleConvert11l * (doubleConvert8l/2.54);
textFieldConvert12l.setText(String.valueOf(decimalFormat.format(doubleConvert12l)) + suffixPx);
}
if (intUnitPickedl == 1) {
doubleConvert12l = doubleConvert11l * (doubleConvert8l/25.4);
textFieldConvert12l.setText(String.valueOf(decimalFormat.format(doubleConvert12l)) + suffixPx);
}
if (intUnitPickedl == 2) {
doubleConvert12l = doubleConvert11l * (doubleConvert8l/1);
textFieldConvert12l.setText(String.valueOf(decimalFormat.format(doubleConvert12l)) + suffixPx);
}
if (intUnitPickedl == 3) {
doubleConvert12l = doubleConvert11l * (doubleConvert8l/1440);
textFieldConvert12l.setText(String.valueOf(decimalFormat.format(doubleConvert12l)) + suffixPx);
}
}

//################ Calculate convert pixels to units ###############
if (e.getSource() == buttonConvert14l) {
stringConvert12l = textFieldConvert12l.getText();
doubleConvert12l = Double.parseDouble(stringConvert12l);
stringConvert8l = textFieldConvert8l.getText();
doubleConvert8l = Double.parseDouble(stringConvert8l);
if (intUnitPickedl == 0) {
doubleConvert11l = doubleConvert12l * (2.54/doubleConvert8l);
textFieldConvert11l.setText(String.valueOf(decimalFormat.format(doubleConvert11l)) + suffixCm);
}
if (intUnitPickedl == 1) {
doubleConvert11l = doubleConvert12l * (25.4/doubleConvert8l);
textFieldConvert11l.setText(String.valueOf(decimalFormat.format(doubleConvert11l)) + suffixMm);
}
if (intUnitPickedl == 2) {
doubleConvert11l = doubleConvert12l * (1/doubleConvert8l);
textFieldConvert11l.setText(String.valueOf(decimalFormat.format(doubleConvert11l)) + suffixIn);
}
if (intUnitPickedl == 3) {
doubleConvert11l = doubleConvert12l * (1440/doubleConvert8l);
textFieldConvert11l.setText(String.valueOf(decimalFormat.format(doubleConvert11l)) + suffixTwip);
}
}

if (e.getSource() == radioButtonConvert3l) {
intUnitPickedl = 0;
}
if (e.getSource() == radioButtonConvert5l) {
intUnitPickedl = 1;
}
if (e.getSource() == radioButtonConvert7l) {
intUnitPickedl = 2;
}
if (e.getSource() == radioButtonConvert9l) {
intUnitPickedl = 3;
}


//################ Format ################
if (e.getSource() == buttonFormat5) {
userFormat = textFieldFormat3.getText();
decimalFormat.applyPattern(userFormat);
}

if (e.getSource() == radioButtonFormat9) {
suffixMm = "";
suffixCm = "";
suffixM = "";
suffixKm = "";
suffixIn = "";
suffixFt  = "";
suffixYd  = "";
suffixMi  = "";
suffixC  = "";
suffixK  = "";
suffixF  = "";
suffixAc = "";
suffixBu  = "";
suffixFtSSqr = "";
suffixFtS  = "";
suffixFtSqr = "";
suffixG  = "";
suffixGCmSqr3 = "";
suffixHa = "";
suffixKg = "";
suffixKgMSqr3  = "";
suffixKl  = "";
suffixKmH = "";
suffixKmHS = "";
suffixKmS  = "";
suffixKmSqr = "";
suffixLb  = "";
suffixLbFtSqr3 = "";
suffixLbGal  = "";
suffixLbInSqr3 = ""; 
suffixL  = "";
suffixMg = "";
suffixMiH = "";
suffixMiHS = "";
suffixMiS = "";
suffixMiSqr = "";
suffixMl = "";
suffixMS = "";
suffixMSqr = "";
suffixMSSqr = "";
suffixOz = "";
suffixOzFtSqr3 = "";
suffixOzInSqr3 = "";
suffixPk = "";
suffixPt = "";
suffixQt = "";
suffixSt = "";
suffixT = "";
suffixTn = "";
suffixR = "";
suffixRev = "";
suffixTB = "";
suffixPx = "";
suffixArcmin = "";
suffixArcsec = "";
suffixB = "";
suffixBin = "";
suffixBy = "";
suffixDec = "";
suffixDeg = "";
suffixGB = "";
suffixHex = "";
suffixKB = "";
suffixMB = "";
suffixOct = "";
suffixTwip = "";
}
if (e.getSource() == radioButtonFormat11) {
suffixMm = " mm";
suffixCm = " cm";
suffixM = " m";
suffixKm = " km";
suffixIn = " in";
suffixFt  = " ft";
suffixYd  = " yd";
suffixMi  = " mi";
suffixC  = " C";
suffixK  = " K";
suffixF  = " F";
suffixAc = " ac";
suffixBu  = " bu";
suffixFtSSqr = " ft/(s^2)";
suffixFtS  = " ft/s";
suffixFtSqr = " ft^2";
suffixG  = " g";
suffixGCmSqr3 = " g/(cm^3)";
suffixHa = " ha";
suffixKg = " kg";
suffixKgMSqr3  = " kg/(m^3)";
suffixKl  = " kl";
suffixKmH = " km/h";
suffixKmHS = " km/(h*s)";
suffixKmS  = " km/s";
suffixKmSqr = " km^2";
suffixLb  = " lb";
suffixLbFtSqr3 = " lb/(ft^3)";
suffixLbGal  = " lb/gal";
suffixLbInSqr3 = " lb/(in^3)"; 
suffixL  = " l";
suffixMg = " mg";
suffixMiH = " mi/h";
suffixMiHS = " mi/(h*s)";
suffixMiS = " mi/s";
suffixMiSqr = " mi^2";
suffixMl = " ml";
suffixMS = " m/s";
suffixMSqr = " m^2";
suffixMSSqr = " m/(s^2)";
suffixOz = " oz";
suffixOzFtSqr3 = " oz/(ft^3)";
suffixOzInSqr3 = " oz/(in^3)";
suffixPk = " pk";
suffixPt = " pt";
suffixQt = " qt";
suffixSt = " st";
suffixT = " t";
suffixTn = " tn";
suffixR = " r";
suffixRev = " rev";
suffixTB = " TB";
suffixPx = " px";
suffixArcmin = " arcmin";
suffixArcsec = " arcsec";
suffixB = " b";
suffixBin = " bin";
suffixBy = " B";
suffixDec = " dec";
suffixDeg = " deg";
suffixGB = " GB";
suffixHex = " hex";
suffixKB = " KB";
suffixMB = " MB";
suffixOct = " oct";
suffixTwip = " twips";
}
if (e.getSource() == radioButtonFormat13) {
suffixMm = " mm";
suffixCm = " cm";
suffixM = " m";
suffixKm = " km";
suffixIn = " in";
suffixFt = " ft";
suffixYd = " yd";
suffixMi = " mi";
suffixC = " °C";
suffixK = " K";
suffixF = " °F";
suffixAc = " ac";
suffixBu  = " bu";
suffixFtSSqr = " ft/s²";
suffixFtS  = " ft/s";
suffixFtSqr = " ft²";
suffixG  = " g";
suffixGCmSqr3 = " g/cm³";
suffixHa = " ha";
suffixKg = " kg";
suffixKgMSqr3  = " kg/m³";
suffixKl  = " kl";
suffixKmH = " km/h";
suffixKmHS = " km/(h*s)";
suffixKmS  = " km/s";
suffixKmSqr = " km²";
suffixLb  = " lb";
suffixLbFtSqr3 = " lb/ft³";
suffixLbGal  = " lb/gal";
suffixLbInSqr3 = " lb/in³"; 
suffixL  = " l";
suffixMg = " mg";
suffixMiH = " mi/h";
suffixMiHS = " mi/(h*s)";
suffixMiS = " mi/s";
suffixMiSqr = " mi²";
suffixMl = " ml";
suffixMS = " m/s";
suffixMSqr = " m²";
suffixMSSqr = " m/s²";
suffixOz = " oz";
suffixOzFtSqr3 = " oz/ft³";
suffixOzInSqr3 = " oz/in³";
suffixPk = " pk";
suffixPt = " pt";
suffixQt = " qt";
suffixSt = " st";
suffixT = " t";
suffixTn = " tn";
suffixR = " r";
suffixRev = " rev";
suffixTB = " TB";
suffixPx = " px";
suffixArcmin = " ′";
suffixArcsec = " ″";
suffixB = " b";
suffixBin = " bin";
suffixBy = " B";
suffixDec = " dec";
suffixDeg = " °";
suffixGB = " GB";
suffixHex = " hex";
suffixKB = " KB";
suffixMB = " MB";
suffixOct = " oct";
suffixTwip = " twips";
}

//$$$$$$$ Choose sphere $$$$$$$
if (e.getSource() == choose3DSphere) {
//Vis on
iconPanel.setBounds(250, 250, 250, 250);
frame.setSize(800, 535);
notePanel1.setBounds(500, 0, 310, 500);
notePanel2.setBounds(500, 0, 310, 500);
notePanel3.setBounds(500, 0, 310, 500);
notePanel4.setBounds(500, 0, 310, 500);
notePanel5.setBounds(500, 0, 310, 500);
iconLabel.setIcon(sphere);

panelSphere1a.setVisible(true);
panelSphere2a.setVisible(true);
panelSphere3a.setVisible(true);
panelSphere4a.setVisible(true);
panelSphere5a.setVisible(true);
panelSphere6a.setVisible(true);
panelSphere7a.setVisible(true);
panelSphere8a.setVisible(true);
panelSphere9a.setVisible(true);
panelSphere10a.setVisible(true);
panelSphere11a.setVisible(true);
panelSphere12a.setVisible(true);

//Vis off
choosePanelTriangle.setVisible(false);
panelSquare1a.setVisible(false);
panelSquare2a.setVisible(false);
panelSquare3a.setVisible(false);
panelSquare4a.setVisible(false);
panelSquare5a.setVisible(false);
panelSquare6a.setVisible(false);
panelSquare7a.setVisible(false);
panelSquare9a.setVisible(false);
panelSquare11a.setVisible(false);
panelConvert1a.setVisible(false);
panelConvert2a.setVisible(false);
panelConvert3a.setVisible(false);
panelConvert4a.setVisible(false);
panelConvert5a.setVisible(false);
panelConvert6a.setVisible(false);
panelConvert7a.setVisible(false);
panelConvert8a.setVisible(false);
panelConvert9a.setVisible(false);
panelConvert10a.setVisible(false);
panelConvert11a.setVisible(false);
panelConvert12a.setVisible(false);
panelConvert13a.setVisible(false);
panelConvert14a.setVisible(false);
panelConvert1d.setVisible(false);
panelConvert2d.setVisible(false);
panelConvert3d.setVisible(false);
panelConvert4d.setVisible(false);
panelConvert5d.setVisible(false);
panelConvert6d.setVisible(false);
panelConvert7d.setVisible(false);
panelConvert9d.setVisible(false);
panelConvert11d.setVisible(false);
panelConvert1e.setVisible(false);
panelConvert2e.setVisible(false);
panelConvert3e.setVisible(false);
panelConvert4e.setVisible(false);
panelConvert5e.setVisible(false);
panelConvert6e.setVisible(false);
panelConvert7e.setVisible(false);
panelConvert8e.setVisible(false);
panelConvert9e.setVisible(false);
panelConvert10e.setVisible(false);
panelConvert11e.setVisible(false);
panelConvert12e.setVisible(false);
panelConvert13e.setVisible(false);
panelConvert14e.setVisible(false);
panelConvert1b.setVisible(false);
panelConvert2b.setVisible(false);
panelConvert3b.setVisible(false);
panelConvert4b.setVisible(false);
panelConvert5b.setVisible(false);
panelConvert6b.setVisible(false);
panelConvert7b.setVisible(false);
panelConvert8b.setVisible(false);
panelConvert9b.setVisible(false);
panelConvert11b.setVisible(false);
panelConvert12b.setVisible(false);
panelConvert13b.setVisible(false);
panelConvert14b.setVisible(false);
panelConvert1c.setVisible(false);
panelConvert2c.setVisible(false);
panelConvert3c.setVisible(false);
panelConvert4c.setVisible(false);
panelConvert5c.setVisible(false);
panelConvert6c.setVisible(false);
panelConvert7c.setVisible(false);
panelConvert8c.setVisible(false);
panelConvert9c.setVisible(false);
panelConvert10c.setVisible(false);
panelConvert11c.setVisible(false);
panelConvert12c.setVisible(false);
panelConvert1f.setVisible(false);
panelConvert2f.setVisible(false);
panelConvert3f.setVisible(false);
panelConvert4f.setVisible(false);
panelConvert5f.setVisible(false);
panelConvert6f.setVisible(false);
panelConvert7f.setVisible(false);
panelConvert8f.setVisible(false);
panelConvert9f.setVisible(false);
panelConvert10f.setVisible(false);
panelConvert11f.setVisible(false);
panelConvert12f.setVisible(false);
panelConvert1g.setVisible(false);
panelConvert2g.setVisible(false);
panelConvert3g.setVisible(false);
panelConvert4g.setVisible(false);
panelConvert5g.setVisible(false);
panelConvert6g.setVisible(false);
panelConvert7g.setVisible(false);
panelConvert8g.setVisible(false);
panelConvert9g.setVisible(false);
panelConvert10g.setVisible(false);
panelConvert1h.setVisible(false);
panelConvert2h.setVisible(false);
panelConvert3h.setVisible(false);
panelConvert4h.setVisible(false);
panelConvert5h.setVisible(false);
panelConvert6h.setVisible(false);
panelConvert7h.setVisible(false);
panelConvert9h.setVisible(false);
panelConvert11h.setVisible(false);
panelConvert13h.setVisible(false);
panelConvert14h.setVisible(false);
panelConvert15h.setVisible(false);
panelConvert16h.setVisible(false);
panelFormat1.setVisible(false);
panelFormat3.setVisible(false);
panelFormat5.setVisible(false);
panelFormat7.setVisible(false);
panelFormat9.setVisible(false);
panelFormat11.setVisible(false);
panelFormat13.setVisible(false);
panelConvert1i.setVisible(false);
panelConvert3i.setVisible(false);
panelConvert4i.setVisible(false);
panelConvert5i.setVisible(false);
panelConvert6i.setVisible(false);
panelConvert7i.setVisible(false);
panelConvert8i.setVisible(false);
panelConvert9i.setVisible(false);
panelConvert10i.setVisible(false);
panelConvert11i.setVisible(false);
panelConvert12i.setVisible(false);
panelConvert13i.setVisible(false);
panelConvert14i.setVisible(false);
panelConvert15i.setVisible(false);
panelConvert1j.setVisible(false);
panelConvert3j.setVisible(false);
panelConvert4j.setVisible(false);
panelConvert5j.setVisible(false);
panelConvert6j.setVisible(false);
panelConvert7j.setVisible(false);
panelConvert8j.setVisible(false);
panelConvert9j.setVisible(false);
panelConvert10j.setVisible(false);
panelConvert11j.setVisible(false);
panelConvert12j.setVisible(false);
panelConvert13j.setVisible(false);
panelConvert1k.setVisible(false);
panelConvert3k.setVisible(false);
panelConvert4k.setVisible(false);
panelConvert5k.setVisible(false);
panelConvert6k.setVisible(false);
panelConvert7k.setVisible(false);
panelConvert8k.setVisible(false);
panelConvert9k.setVisible(false);
panelConvert10k.setVisible(false);
panelConvert11k.setVisible(false);
panelConvert12k.setVisible(false);
panelConvert13k.setVisible(false);
panelConvert14k.setVisible(false);
panelConvert15k.setVisible(false);
panelConvert16k.setVisible(false);
panelConvert17k.setVisible(false);
panelConvert1l.setVisible(false);
panelConvert2l.setVisible(false);
panelConvert3l.setVisible(false);
panelConvert4l.setVisible(false);
panelConvert5l.setVisible(false);
panelConvert6l.setVisible(false);
panelConvert7l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert9l.setVisible(false);
panelConvert11l.setVisible(false);
panelConvert12l.setVisible(false);
panelConvert13l.setVisible(false);
panelConvert14l.setVisible(false);
panelCircle1b.setVisible(false);
panelCircle2b.setVisible(false);
panelCircle3b.setVisible(false);
panelCircle4b.setVisible(false);
panelCircle5b.setVisible(false);
panelCircle6b.setVisible(false);
panelCircle7b.setVisible(false);
panelCircle8b.setVisible(false);
panelCircle9b.setVisible(false);
panelCircle10b.setVisible(false);
panelCircle11b.setVisible(false);
panelCircle12b.setVisible(false);
panelTriangle1a.setVisible(false);
panelTriangle2a.setVisible(false);
panelTriangle3a.setVisible(false);
panelTriangle4a.setVisible(false);
panelTriangle5a.setVisible(false);
panelTriangle6a.setVisible(false);
panelTriangle7a.setVisible(false);
panelTriangle8a.setVisible(false);
panelTriangle9a.setVisible(false);
panelTriangle10a.setVisible(false);
panelTriangle11a.setVisible(false);
panelTriangle12a.setVisible(false);
panelTriangle13a.setVisible(false);
panelTriangle14a.setVisible(false);
panelTriangle15a.setVisible(false);
panelTriangle16a.setVisible(false);
panelTriangle17a.setVisible(false);
panelTriangle18a.setVisible(false);
panelTriangle19a.setVisible(false);
panelTriangle20a.setVisible(false);
panelTriangle21a.setVisible(false);
panelTriangle22a.setVisible(false);
panelTriangle23a.setVisible(false);
panelTriangle24a.setVisible(false);
panelTriangle25a.setVisible(false);
panelTriangle26a.setVisible(false);
panelTriangle27a.setVisible(false);
panelTriangle28a.setVisible(false);
panelTriangle31a.setVisible(false);
panelTriangle34a.setVisible(false);
panelCube1a.setVisible(false);
panelCube2a.setVisible(false);
panelCube3a.setVisible(false);
panelCube4a.setVisible(false);
panelCube5a.setVisible(false);
panelCube6a.setVisible(false);
panelCube7a.setVisible(false);
panelCube8a.setVisible(false);
panelCube9a.setVisible(false);
panelCube10a.setVisible(false);
panelCube11a.setVisible(false);
panelCube12a.setVisible(false);
}

//$$$$$$$ Choose cube $$$$$$$
if (e.getSource() == choose3DCube) {
//Vis on
iconPanel.setBounds(250, 250, 250, 250);
frame.setSize(800, 535);
notePanel1.setBounds(500, 0, 310, 500);
notePanel2.setBounds(500, 0, 310, 500);
notePanel3.setBounds(500, 0, 310, 500);
notePanel4.setBounds(500, 0, 310, 500);
notePanel5.setBounds(500, 0, 310, 500);
iconLabel.setIcon(cube);

panelCube1a.setVisible(true);
panelCube2a.setVisible(true);
panelCube3a.setVisible(true);
panelCube4a.setVisible(true);
panelCube5a.setVisible(true);
panelCube6a.setVisible(true);
panelCube7a.setVisible(true);
panelCube8a.setVisible(true);
panelCube9a.setVisible(true);
panelCube10a.setVisible(true);
panelCube11a.setVisible(true);
panelCube12a.setVisible(true);

//Vis off
choosePanelTriangle.setVisible(false);
panelSquare1a.setVisible(false);
panelSquare2a.setVisible(false);
panelSquare3a.setVisible(false);
panelSquare4a.setVisible(false);
panelSquare5a.setVisible(false);
panelSquare6a.setVisible(false);
panelSquare7a.setVisible(false);
panelSquare9a.setVisible(false);
panelSquare11a.setVisible(false);
panelConvert1a.setVisible(false);
panelConvert2a.setVisible(false);
panelConvert3a.setVisible(false);
panelConvert4a.setVisible(false);
panelConvert5a.setVisible(false);
panelConvert6a.setVisible(false);
panelConvert7a.setVisible(false);
panelConvert8a.setVisible(false);
panelConvert9a.setVisible(false);
panelConvert10a.setVisible(false);
panelConvert11a.setVisible(false);
panelConvert12a.setVisible(false);
panelConvert13a.setVisible(false);
panelConvert14a.setVisible(false);
panelConvert1d.setVisible(false);
panelConvert2d.setVisible(false);
panelConvert3d.setVisible(false);
panelConvert4d.setVisible(false);
panelConvert5d.setVisible(false);
panelConvert6d.setVisible(false);
panelConvert7d.setVisible(false);
panelConvert9d.setVisible(false);
panelConvert11d.setVisible(false);
panelConvert1e.setVisible(false);
panelConvert2e.setVisible(false);
panelConvert3e.setVisible(false);
panelConvert4e.setVisible(false);
panelConvert5e.setVisible(false);
panelConvert6e.setVisible(false);
panelConvert7e.setVisible(false);
panelConvert8e.setVisible(false);
panelConvert9e.setVisible(false);
panelConvert10e.setVisible(false);
panelConvert11e.setVisible(false);
panelConvert12e.setVisible(false);
panelConvert13e.setVisible(false);
panelConvert14e.setVisible(false);
panelConvert1b.setVisible(false);
panelConvert2b.setVisible(false);
panelConvert3b.setVisible(false);
panelConvert4b.setVisible(false);
panelConvert5b.setVisible(false);
panelConvert6b.setVisible(false);
panelConvert7b.setVisible(false);
panelConvert8b.setVisible(false);
panelConvert9b.setVisible(false);
panelConvert11b.setVisible(false);
panelConvert12b.setVisible(false);
panelConvert13b.setVisible(false);
panelConvert14b.setVisible(false);
panelConvert1c.setVisible(false);
panelConvert2c.setVisible(false);
panelConvert3c.setVisible(false);
panelConvert4c.setVisible(false);
panelConvert5c.setVisible(false);
panelConvert6c.setVisible(false);
panelConvert7c.setVisible(false);
panelConvert8c.setVisible(false);
panelConvert9c.setVisible(false);
panelConvert10c.setVisible(false);
panelConvert11c.setVisible(false);
panelConvert12c.setVisible(false);
panelConvert1f.setVisible(false);
panelConvert2f.setVisible(false);
panelConvert3f.setVisible(false);
panelConvert4f.setVisible(false);
panelConvert5f.setVisible(false);
panelConvert6f.setVisible(false);
panelConvert7f.setVisible(false);
panelConvert8f.setVisible(false);
panelConvert9f.setVisible(false);
panelConvert10f.setVisible(false);
panelConvert11f.setVisible(false);
panelConvert12f.setVisible(false);
panelConvert1g.setVisible(false);
panelConvert2g.setVisible(false);
panelConvert3g.setVisible(false);
panelConvert4g.setVisible(false);
panelConvert5g.setVisible(false);
panelConvert6g.setVisible(false);
panelConvert7g.setVisible(false);
panelConvert8g.setVisible(false);
panelConvert9g.setVisible(false);
panelConvert10g.setVisible(false);
panelConvert1h.setVisible(false);
panelConvert2h.setVisible(false);
panelConvert3h.setVisible(false);
panelConvert4h.setVisible(false);
panelConvert5h.setVisible(false);
panelConvert6h.setVisible(false);
panelConvert7h.setVisible(false);
panelConvert9h.setVisible(false);
panelConvert11h.setVisible(false);
panelConvert13h.setVisible(false);
panelConvert14h.setVisible(false);
panelConvert15h.setVisible(false);
panelConvert16h.setVisible(false);
panelFormat1.setVisible(false);
panelFormat3.setVisible(false);
panelFormat5.setVisible(false);
panelFormat7.setVisible(false);
panelFormat9.setVisible(false);
panelFormat11.setVisible(false);
panelFormat13.setVisible(false);
panelConvert1i.setVisible(false);
panelConvert3i.setVisible(false);
panelConvert4i.setVisible(false);
panelConvert5i.setVisible(false);
panelConvert6i.setVisible(false);
panelConvert7i.setVisible(false);
panelConvert8i.setVisible(false);
panelConvert9i.setVisible(false);
panelConvert10i.setVisible(false);
panelConvert11i.setVisible(false);
panelConvert12i.setVisible(false);
panelConvert13i.setVisible(false);
panelConvert14i.setVisible(false);
panelConvert15i.setVisible(false);
panelConvert1j.setVisible(false);
panelConvert3j.setVisible(false);
panelConvert4j.setVisible(false);
panelConvert5j.setVisible(false);
panelConvert6j.setVisible(false);
panelConvert7j.setVisible(false);
panelConvert8j.setVisible(false);
panelConvert9j.setVisible(false);
panelConvert10j.setVisible(false);
panelConvert11j.setVisible(false);
panelConvert12j.setVisible(false);
panelConvert13j.setVisible(false);
panelConvert1k.setVisible(false);
panelConvert3k.setVisible(false);
panelConvert4k.setVisible(false);
panelConvert5k.setVisible(false);
panelConvert6k.setVisible(false);
panelConvert7k.setVisible(false);
panelConvert8k.setVisible(false);
panelConvert9k.setVisible(false);
panelConvert10k.setVisible(false);
panelConvert11k.setVisible(false);
panelConvert12k.setVisible(false);
panelConvert13k.setVisible(false);
panelConvert14k.setVisible(false);
panelConvert15k.setVisible(false);
panelConvert16k.setVisible(false);
panelConvert17k.setVisible(false);
panelConvert1l.setVisible(false);
panelConvert2l.setVisible(false);
panelConvert3l.setVisible(false);
panelConvert4l.setVisible(false);
panelConvert5l.setVisible(false);
panelConvert6l.setVisible(false);
panelConvert7l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert9l.setVisible(false);
panelConvert11l.setVisible(false);
panelConvert12l.setVisible(false);
panelConvert13l.setVisible(false);
panelConvert14l.setVisible(false);
panelCircle1b.setVisible(false);
panelCircle2b.setVisible(false);
panelCircle3b.setVisible(false);
panelCircle4b.setVisible(false);
panelCircle5b.setVisible(false);
panelCircle6b.setVisible(false);
panelCircle7b.setVisible(false);
panelCircle8b.setVisible(false);
panelCircle9b.setVisible(false);
panelCircle10b.setVisible(false);
panelCircle11b.setVisible(false);
panelCircle12b.setVisible(false);
panelTriangle1a.setVisible(false);
panelTriangle2a.setVisible(false);
panelTriangle3a.setVisible(false);
panelTriangle4a.setVisible(false);
panelTriangle5a.setVisible(false);
panelTriangle6a.setVisible(false);
panelTriangle7a.setVisible(false);
panelTriangle8a.setVisible(false);
panelTriangle9a.setVisible(false);
panelTriangle10a.setVisible(false);
panelTriangle11a.setVisible(false);
panelTriangle12a.setVisible(false);
panelTriangle13a.setVisible(false);
panelTriangle14a.setVisible(false);
panelTriangle15a.setVisible(false);
panelTriangle16a.setVisible(false);
panelTriangle17a.setVisible(false);
panelTriangle18a.setVisible(false);
panelTriangle19a.setVisible(false);
panelTriangle20a.setVisible(false);
panelTriangle21a.setVisible(false);
panelTriangle22a.setVisible(false);
panelTriangle23a.setVisible(false);
panelTriangle24a.setVisible(false);
panelTriangle25a.setVisible(false);
panelTriangle26a.setVisible(false);
panelTriangle27a.setVisible(false);
panelTriangle28a.setVisible(false);
panelTriangle31a.setVisible(false);
panelTriangle34a.setVisible(false);
panelSphere1a.setVisible(false);
panelSphere2a.setVisible(false);
panelSphere3a.setVisible(false);
panelSphere4a.setVisible(false);
panelSphere5a.setVisible(false);
panelSphere6a.setVisible(false);
panelSphere7a.setVisible(false);
panelSphere8a.setVisible(false);
panelSphere9a.setVisible(false);
panelSphere10a.setVisible(false);
panelSphere11a.setVisible(false);
panelSphere12a.setVisible(false);


}


//$$$$$$$$ Choose triangle scalene $$$$$$$$
if (e.getSource() == choose2DTriangle) {
//Vis on
frame.setSize(915, 535);
iconPanel.setBounds(250, 275, 250, 250);
iconLabel.setIcon(triangle_scalene);
notePanel1.setBounds(615, 0, 310, 500);
notePanel2.setBounds(615, 0, 310, 500);
notePanel3.setBounds(615, 0, 310, 500);
notePanel4.setBounds(615, 0, 310, 500);
notePanel5.setBounds(615, 0, 310, 500);

panelTriangle1a.setVisible(true);
panelTriangle2a.setVisible(true);
panelTriangle3a.setVisible(true);
panelTriangle4a.setVisible(true);
panelTriangle5a.setVisible(true);
panelTriangle6a.setVisible(true);
panelTriangle7a.setVisible(true);
panelTriangle8a.setVisible(true);
panelTriangle9a.setVisible(true);
panelTriangle10a.setVisible(true);
panelTriangle11a.setVisible(true);
panelTriangle12a.setVisible(true);
panelTriangle13a.setVisible(true);
panelTriangle14a.setVisible(true);
panelTriangle15a.setVisible(true);
panelTriangle16a.setVisible(true);
panelTriangle17a.setVisible(true);
panelTriangle18a.setVisible(true);
panelTriangle19a.setVisible(true);
panelTriangle20a.setVisible(true);
panelTriangle21a.setVisible(true);
panelTriangle22a.setVisible(true);
panelTriangle23a.setVisible(true);
panelTriangle24a.setVisible(true);
panelTriangle25a.setVisible(true);
panelTriangle26a.setVisible(true);
panelTriangle27a.setVisible(true);
panelTriangle28a.setVisible(true);
panelTriangle31a.setVisible(true);
panelTriangle34a.setVisible(true);

//Vis off
choosePanelTriangle.setVisible(false);
panelSquare1a.setVisible(false);
panelSquare2a.setVisible(false);
panelSquare3a.setVisible(false);
panelSquare4a.setVisible(false);
panelSquare5a.setVisible(false);
panelSquare6a.setVisible(false);
panelSquare7a.setVisible(false);
panelSquare9a.setVisible(false);
panelSquare11a.setVisible(false);
panelConvert1a.setVisible(false);
panelConvert2a.setVisible(false);
panelConvert3a.setVisible(false);
panelConvert4a.setVisible(false);
panelConvert5a.setVisible(false);
panelConvert6a.setVisible(false);
panelConvert7a.setVisible(false);
panelConvert8a.setVisible(false);
panelConvert9a.setVisible(false);
panelConvert10a.setVisible(false);
panelConvert11a.setVisible(false);
panelConvert12a.setVisible(false);
panelConvert13a.setVisible(false);
panelConvert14a.setVisible(false);
panelConvert1d.setVisible(false);
panelConvert2d.setVisible(false);
panelConvert3d.setVisible(false);
panelConvert4d.setVisible(false);
panelConvert5d.setVisible(false);
panelConvert6d.setVisible(false);
panelConvert7d.setVisible(false);
panelConvert9d.setVisible(false);
panelConvert11d.setVisible(false);
panelConvert1e.setVisible(false);
panelConvert2e.setVisible(false);
panelConvert3e.setVisible(false);
panelConvert4e.setVisible(false);
panelConvert5e.setVisible(false);
panelConvert6e.setVisible(false);
panelConvert7e.setVisible(false);
panelConvert8e.setVisible(false);
panelConvert9e.setVisible(false);
panelConvert10e.setVisible(false);
panelConvert11e.setVisible(false);
panelConvert12e.setVisible(false);
panelConvert13e.setVisible(false);
panelConvert14e.setVisible(false);
panelConvert1b.setVisible(false);
panelConvert2b.setVisible(false);
panelConvert3b.setVisible(false);
panelConvert4b.setVisible(false);
panelConvert5b.setVisible(false);
panelConvert6b.setVisible(false);
panelConvert7b.setVisible(false);
panelConvert8b.setVisible(false);
panelConvert9b.setVisible(false);
panelConvert11b.setVisible(false);
panelConvert12b.setVisible(false);
panelConvert13b.setVisible(false);
panelConvert14b.setVisible(false);
panelConvert1c.setVisible(false);
panelConvert2c.setVisible(false);
panelConvert3c.setVisible(false);
panelConvert4c.setVisible(false);
panelConvert5c.setVisible(false);
panelConvert6c.setVisible(false);
panelConvert7c.setVisible(false);
panelConvert8c.setVisible(false);
panelConvert9c.setVisible(false);
panelConvert10c.setVisible(false);
panelConvert11c.setVisible(false);
panelConvert12c.setVisible(false);
panelConvert1f.setVisible(false);
panelConvert2f.setVisible(false);
panelConvert3f.setVisible(false);
panelConvert4f.setVisible(false);
panelConvert5f.setVisible(false);
panelConvert6f.setVisible(false);
panelConvert7f.setVisible(false);
panelConvert8f.setVisible(false);
panelConvert9f.setVisible(false);
panelConvert10f.setVisible(false);
panelConvert11f.setVisible(false);
panelConvert12f.setVisible(false);
panelConvert1g.setVisible(false);
panelConvert2g.setVisible(false);
panelConvert3g.setVisible(false);
panelConvert4g.setVisible(false);
panelConvert5g.setVisible(false);
panelConvert6g.setVisible(false);
panelConvert7g.setVisible(false);
panelConvert8g.setVisible(false);
panelConvert9g.setVisible(false);
panelConvert10g.setVisible(false);
panelConvert1h.setVisible(false);
panelConvert2h.setVisible(false);
panelConvert3h.setVisible(false);
panelConvert4h.setVisible(false);
panelConvert5h.setVisible(false);
panelConvert6h.setVisible(false);
panelConvert7h.setVisible(false);
panelConvert9h.setVisible(false);
panelConvert11h.setVisible(false);
panelConvert13h.setVisible(false);
panelConvert14h.setVisible(false);
panelConvert15h.setVisible(false);
panelConvert16h.setVisible(false);
panelFormat1.setVisible(false);
panelFormat3.setVisible(false);
panelFormat5.setVisible(false);
panelFormat7.setVisible(false);
panelFormat9.setVisible(false);
panelFormat11.setVisible(false);
panelFormat13.setVisible(false);
panelConvert1i.setVisible(false);
panelConvert3i.setVisible(false);
panelConvert4i.setVisible(false);
panelConvert5i.setVisible(false);
panelConvert6i.setVisible(false);
panelConvert7i.setVisible(false);
panelConvert8i.setVisible(false);
panelConvert9i.setVisible(false);
panelConvert10i.setVisible(false);
panelConvert11i.setVisible(false);
panelConvert12i.setVisible(false);
panelConvert13i.setVisible(false);
panelConvert14i.setVisible(false);
panelConvert15i.setVisible(false);
panelConvert1j.setVisible(false);
panelConvert3j.setVisible(false);
panelConvert4j.setVisible(false);
panelConvert5j.setVisible(false);
panelConvert6j.setVisible(false);
panelConvert7j.setVisible(false);
panelConvert8j.setVisible(false);
panelConvert9j.setVisible(false);
panelConvert10j.setVisible(false);
panelConvert11j.setVisible(false);
panelConvert12j.setVisible(false);
panelConvert13j.setVisible(false);
panelConvert1k.setVisible(false);
panelConvert3k.setVisible(false);
panelConvert4k.setVisible(false);
panelConvert5k.setVisible(false);
panelConvert6k.setVisible(false);
panelConvert7k.setVisible(false);
panelConvert8k.setVisible(false);
panelConvert9k.setVisible(false);
panelConvert10k.setVisible(false);
panelConvert11k.setVisible(false);
panelConvert12k.setVisible(false);
panelConvert13k.setVisible(false);
panelConvert14k.setVisible(false);
panelConvert15k.setVisible(false);
panelConvert16k.setVisible(false);
panelConvert17k.setVisible(false);
panelConvert1l.setVisible(false);
panelConvert2l.setVisible(false);
panelConvert3l.setVisible(false);
panelConvert4l.setVisible(false);
panelConvert5l.setVisible(false);
panelConvert6l.setVisible(false);
panelConvert7l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert9l.setVisible(false);
panelConvert11l.setVisible(false);
panelConvert12l.setVisible(false);
panelConvert13l.setVisible(false);
panelConvert14l.setVisible(false);
panelCircle1b.setVisible(false);
panelCircle2b.setVisible(false);
panelCircle3b.setVisible(false);
panelCircle4b.setVisible(false);
panelCircle5b.setVisible(false);
panelCircle6b.setVisible(false);
panelCircle7b.setVisible(false);
panelCircle8b.setVisible(false);
panelCircle9b.setVisible(false);
panelCircle10b.setVisible(false);
panelCircle11b.setVisible(false);
panelCircle12b.setVisible(false);
panelCube1a.setVisible(false);
panelCube2a.setVisible(false);
panelCube3a.setVisible(false);
panelCube4a.setVisible(false);
panelCube5a.setVisible(false);
panelCube6a.setVisible(false);
panelCube7a.setVisible(false);
panelCube8a.setVisible(false);
panelCube9a.setVisible(false);
panelCube10a.setVisible(false);
panelCube11a.setVisible(false);
panelCube12a.setVisible(false);
panelSphere1a.setVisible(false);
panelSphere2a.setVisible(false);
panelSphere3a.setVisible(false);
panelSphere4a.setVisible(false);
panelSphere5a.setVisible(false);
panelSphere6a.setVisible(false);
panelSphere7a.setVisible(false);
panelSphere8a.setVisible(false);
panelSphere9a.setVisible(false);
panelSphere10a.setVisible(false);
panelSphere11a.setVisible(false);
panelSphere12a.setVisible(false);


}




//$$$$$$$$$$$$$$$$ Choose square -> area $$$$$$$$$$$$$$$$
if (e.getSource() == choose2DSquare) {
iconPanel.setBounds(250, 250, 250, 250);
frame.setSize(800, 535);
notePanel1.setBounds(500, 0, 310, 500);
notePanel2.setBounds(500, 0, 310, 500);
notePanel3.setBounds(500, 0, 310, 500);
notePanel4.setBounds(500, 0, 310, 500);
notePanel5.setBounds(500, 0, 310, 500);
iconLabel.setIcon(square);

//Vis on
panelSquare1a.setVisible(true);
panelSquare2a.setVisible(true);
panelSquare3a.setVisible(true);
panelSquare4a.setVisible(true);
panelSquare5a.setVisible(true);
panelSquare6a.setVisible(true);
panelSquare7a.setVisible(true);
panelSquare9a.setVisible(true);
panelSquare11a.setVisible(true);



//Vis off
panelTriangle1a.setVisible(false);
panelTriangle2a.setVisible(false);
panelTriangle3a.setVisible(false);
panelTriangle4a.setVisible(false);
panelTriangle5a.setVisible(false);
panelTriangle6a.setVisible(false);
panelTriangle7a.setVisible(false);
panelTriangle8a.setVisible(false);
panelTriangle9a.setVisible(false);
panelTriangle10a.setVisible(false);
panelTriangle11a.setVisible(false);
panelTriangle12a.setVisible(false);
panelTriangle13a.setVisible(false);
panelTriangle14a.setVisible(false);
panelTriangle15a.setVisible(false);
panelTriangle16a.setVisible(false);
panelTriangle17a.setVisible(false);
panelTriangle18a.setVisible(false);
panelTriangle19a.setVisible(false);
panelTriangle20a.setVisible(false);
panelTriangle21a.setVisible(false);
panelTriangle22a.setVisible(false);
panelTriangle23a.setVisible(false);
panelTriangle24a.setVisible(false);
panelTriangle25a.setVisible(false);
panelTriangle26a.setVisible(false);
panelTriangle27a.setVisible(false);
panelTriangle28a.setVisible(false);
panelTriangle31a.setVisible(false);
panelTriangle34a.setVisible(false);
panelConvert1a.setVisible(false);
panelConvert2a.setVisible(false);
panelConvert3a.setVisible(false);
panelConvert4a.setVisible(false);
panelConvert5a.setVisible(false);
panelConvert6a.setVisible(false);
panelConvert7a.setVisible(false);
panelConvert8a.setVisible(false);
panelConvert9a.setVisible(false);
panelConvert10a.setVisible(false);
panelConvert11a.setVisible(false);
panelConvert12a.setVisible(false);
panelConvert13a.setVisible(false);
panelConvert14a.setVisible(false);
panelConvert1d.setVisible(false);
panelConvert2d.setVisible(false);
panelConvert3d.setVisible(false);
panelConvert4d.setVisible(false);
panelConvert5d.setVisible(false);
panelConvert6d.setVisible(false);
panelConvert7d.setVisible(false);
panelConvert9d.setVisible(false);
panelConvert11d.setVisible(false);
panelConvert1e.setVisible(false);
panelConvert2e.setVisible(false);
panelConvert3e.setVisible(false);
panelConvert4e.setVisible(false);
panelConvert5e.setVisible(false);
panelConvert6e.setVisible(false);
panelConvert7e.setVisible(false);
panelConvert8e.setVisible(false);
panelConvert9e.setVisible(false);
panelConvert10e.setVisible(false);
panelConvert11e.setVisible(false);
panelConvert12e.setVisible(false);
panelConvert13e.setVisible(false);
panelConvert14e.setVisible(false);
panelConvert1b.setVisible(false);
panelConvert2b.setVisible(false);
panelConvert3b.setVisible(false);
panelConvert4b.setVisible(false);
panelConvert5b.setVisible(false);
panelConvert6b.setVisible(false);
panelConvert7b.setVisible(false);
panelConvert8b.setVisible(false);
panelConvert9b.setVisible(false);
panelConvert11b.setVisible(false);
panelConvert12b.setVisible(false);
panelConvert13b.setVisible(false);
panelConvert14b.setVisible(false);
panelConvert1c.setVisible(false);
panelConvert2c.setVisible(false);
panelConvert3c.setVisible(false);
panelConvert4c.setVisible(false);
panelConvert5c.setVisible(false);
panelConvert6c.setVisible(false);
panelConvert7c.setVisible(false);
panelConvert8c.setVisible(false);
panelConvert9c.setVisible(false);
panelConvert10c.setVisible(false);
panelConvert11c.setVisible(false);
panelConvert12c.setVisible(false);
panelConvert1f.setVisible(false);
panelConvert2f.setVisible(false);
panelConvert3f.setVisible(false);
panelConvert4f.setVisible(false);
panelConvert5f.setVisible(false);
panelConvert6f.setVisible(false);
panelConvert7f.setVisible(false);
panelConvert8f.setVisible(false);
panelConvert9f.setVisible(false);
panelConvert10f.setVisible(false);
panelConvert11f.setVisible(false);
panelConvert12f.setVisible(false);
panelConvert1g.setVisible(false);
panelConvert2g.setVisible(false);
panelConvert3g.setVisible(false);
panelConvert4g.setVisible(false);
panelConvert5g.setVisible(false);
panelConvert6g.setVisible(false);
panelConvert7g.setVisible(false);
panelConvert8g.setVisible(false);
panelConvert9g.setVisible(false);
panelConvert10g.setVisible(false);
panelConvert1h.setVisible(false);
panelConvert2h.setVisible(false);
panelConvert3h.setVisible(false);
panelConvert4h.setVisible(false);
panelConvert5h.setVisible(false);
panelConvert6h.setVisible(false);
panelConvert7h.setVisible(false);
panelConvert9h.setVisible(false);
panelConvert11h.setVisible(false);
panelConvert13h.setVisible(false);
panelConvert14h.setVisible(false);
panelConvert15h.setVisible(false);
panelConvert16h.setVisible(false);
panelFormat1.setVisible(false);
panelFormat3.setVisible(false);
panelFormat5.setVisible(false);
panelFormat7.setVisible(false);
panelFormat9.setVisible(false);
panelFormat11.setVisible(false);
panelFormat13.setVisible(false);
panelConvert1i.setVisible(false);
panelConvert3i.setVisible(false);
panelConvert4i.setVisible(false);
panelConvert5i.setVisible(false);
panelConvert6i.setVisible(false);
panelConvert7i.setVisible(false);
panelConvert8i.setVisible(false);
panelConvert9i.setVisible(false);
panelConvert10i.setVisible(false);
panelConvert11i.setVisible(false);
panelConvert12i.setVisible(false);
panelConvert13i.setVisible(false);
panelConvert14i.setVisible(false);
panelConvert15i.setVisible(false);
panelConvert1j.setVisible(false);
panelConvert3j.setVisible(false);
panelConvert4j.setVisible(false);
panelConvert5j.setVisible(false);
panelConvert6j.setVisible(false);
panelConvert7j.setVisible(false);
panelConvert8j.setVisible(false);
panelConvert9j.setVisible(false);
panelConvert10j.setVisible(false);
panelConvert11j.setVisible(false);
panelConvert12j.setVisible(false);
panelConvert13j.setVisible(false);
panelConvert1k.setVisible(false);
panelConvert3k.setVisible(false);
panelConvert4k.setVisible(false);
panelConvert5k.setVisible(false);
panelConvert6k.setVisible(false);
panelConvert7k.setVisible(false);
panelConvert8k.setVisible(false);
panelConvert9k.setVisible(false);
panelConvert10k.setVisible(false);
panelConvert11k.setVisible(false);
panelConvert12k.setVisible(false);
panelConvert13k.setVisible(false);
panelConvert14k.setVisible(false);
panelConvert15k.setVisible(false);
panelConvert16k.setVisible(false);
panelConvert17k.setVisible(false);
panelConvert1l.setVisible(false);
panelConvert2l.setVisible(false);
panelConvert3l.setVisible(false);
panelConvert4l.setVisible(false);
panelConvert5l.setVisible(false);
panelConvert6l.setVisible(false);
panelConvert7l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert9l.setVisible(false);
panelConvert11l.setVisible(false);
panelConvert12l.setVisible(false);
panelConvert13l.setVisible(false);
panelConvert14l.setVisible(false);
panelCircle1b.setVisible(false);
panelCircle2b.setVisible(false);
panelCircle3b.setVisible(false);
panelCircle4b.setVisible(false);
panelCircle5b.setVisible(false);
panelCircle6b.setVisible(false);
panelCircle7b.setVisible(false);
panelCircle8b.setVisible(false);
panelCircle9b.setVisible(false);
panelCircle10b.setVisible(false);
panelCircle11b.setVisible(false);
panelCircle12b.setVisible(false);
panelCube1a.setVisible(false);
panelCube2a.setVisible(false);
panelCube3a.setVisible(false);
panelCube4a.setVisible(false);
panelCube5a.setVisible(false);
panelCube6a.setVisible(false);
panelCube7a.setVisible(false);
panelCube8a.setVisible(false);
panelCube9a.setVisible(false);
panelCube10a.setVisible(false);
panelCube11a.setVisible(false);
panelCube12a.setVisible(false);
panelSphere1a.setVisible(false);
panelSphere2a.setVisible(false);
panelSphere3a.setVisible(false);
panelSphere4a.setVisible(false);
panelSphere5a.setVisible(false);
panelSphere6a.setVisible(false);
panelSphere7a.setVisible(false);
panelSphere8a.setVisible(false);
panelSphere9a.setVisible(false);
panelSphere10a.setVisible(false);
panelSphere11a.setVisible(false);
panelSphere12a.setVisible(false);

}

//$$$$$$$$$$$$$$$$ Choose square -> imperial - metric $$$$$$$$$$$$$$$$
if (e.getSource() == chooseConvertMetricImperial) {
iconPanel.setBounds(250, 250, 250, 250);
frame.setSize(800, 535);
notePanel1.setBounds(500, 0, 310, 500);
notePanel2.setBounds(500, 0, 310, 500);
notePanel3.setBounds(500, 0, 310, 500);
notePanel4.setBounds(500, 0, 310, 500);
notePanel5.setBounds(500, 0, 310, 500);
iconLabel.setIcon(length);

//Vis on
panelConvert1a.setVisible(true);
panelConvert2a.setVisible(true);
panelConvert3a.setVisible(true);
panelConvert4a.setVisible(true);
panelConvert5a.setVisible(true);
panelConvert6a.setVisible(true);
panelConvert7a.setVisible(true);
panelConvert8a.setVisible(true);
panelConvert9a.setVisible(true);
panelConvert10a.setVisible(true);
panelConvert11a.setVisible(true);
panelConvert12a.setVisible(true);
panelConvert13a.setVisible(true);
panelConvert14a.setVisible(true);

//Vis off
panelTriangle1a.setVisible(false);
panelTriangle2a.setVisible(false);
panelTriangle3a.setVisible(false);
panelTriangle4a.setVisible(false);
panelTriangle5a.setVisible(false);
panelTriangle6a.setVisible(false);
panelTriangle7a.setVisible(false);
panelTriangle8a.setVisible(false);
panelTriangle9a.setVisible(false);
panelTriangle10a.setVisible(false);
panelTriangle11a.setVisible(false);
panelTriangle12a.setVisible(false);
panelTriangle13a.setVisible(false);
panelTriangle14a.setVisible(false);
panelTriangle15a.setVisible(false);
panelTriangle16a.setVisible(false);
panelTriangle17a.setVisible(false);
panelTriangle18a.setVisible(false);
panelTriangle19a.setVisible(false);
panelTriangle20a.setVisible(false);
panelTriangle21a.setVisible(false);
panelTriangle22a.setVisible(false);
panelTriangle23a.setVisible(false);
panelTriangle24a.setVisible(false);
panelTriangle25a.setVisible(false);
panelTriangle26a.setVisible(false);
panelTriangle27a.setVisible(false);
panelTriangle28a.setVisible(false);
panelTriangle31a.setVisible(false);
panelTriangle34a.setVisible(false);
panelSquare1a.setVisible(false);
panelSquare2a.setVisible(false);
panelSquare3a.setVisible(false);
panelSquare4a.setVisible(false);
panelSquare5a.setVisible(false);
panelSquare6a.setVisible(false);
panelSquare7a.setVisible(false);
panelSquare9a.setVisible(false);
panelSquare11a.setVisible(false);
panelConvert1d.setVisible(false);
panelConvert2d.setVisible(false);
panelConvert3d.setVisible(false);
panelConvert4d.setVisible(false);
panelConvert5d.setVisible(false);
panelConvert6d.setVisible(false);
panelConvert7d.setVisible(false);
panelConvert9d.setVisible(false);
panelConvert11d.setVisible(false);
panelConvert1e.setVisible(false);
panelConvert2e.setVisible(false);
panelConvert3e.setVisible(false);
panelConvert4e.setVisible(false);
panelConvert5e.setVisible(false);
panelConvert6e.setVisible(false);
panelConvert7e.setVisible(false);
panelConvert8e.setVisible(false);
panelConvert9e.setVisible(false);
panelConvert10e.setVisible(false);
panelConvert11e.setVisible(false);
panelConvert12e.setVisible(false);
panelConvert13e.setVisible(false);
panelConvert14e.setVisible(false);
panelConvert1b.setVisible(false);
panelConvert2b.setVisible(false);
panelConvert3b.setVisible(false);
panelConvert4b.setVisible(false);
panelConvert5b.setVisible(false);
panelConvert6b.setVisible(false);
panelConvert7b.setVisible(false);
panelConvert8b.setVisible(false);
panelConvert9b.setVisible(false);
panelConvert11b.setVisible(false);
panelConvert12b.setVisible(false);
panelConvert13b.setVisible(false);
panelConvert14b.setVisible(false);
panelConvert1c.setVisible(false);
panelConvert2c.setVisible(false);
panelConvert3c.setVisible(false);
panelConvert4c.setVisible(false);
panelConvert5c.setVisible(false);
panelConvert6c.setVisible(false);
panelConvert7c.setVisible(false);
panelConvert8c.setVisible(false);
panelConvert9c.setVisible(false);
panelConvert10c.setVisible(false);
panelConvert11c.setVisible(false);
panelConvert12c.setVisible(false);
panelConvert1f.setVisible(false);
panelConvert2f.setVisible(false);
panelConvert3f.setVisible(false);
panelConvert4f.setVisible(false);
panelConvert5f.setVisible(false);
panelConvert6f.setVisible(false);
panelConvert7f.setVisible(false);
panelConvert8f.setVisible(false);
panelConvert9f.setVisible(false);
panelConvert10f.setVisible(false);
panelConvert11f.setVisible(false);
panelConvert12f.setVisible(false);
panelConvert1g.setVisible(false);
panelConvert2g.setVisible(false);
panelConvert3g.setVisible(false);
panelConvert4g.setVisible(false);
panelConvert5g.setVisible(false);
panelConvert6g.setVisible(false);
panelConvert7g.setVisible(false);
panelConvert8g.setVisible(false);
panelConvert9g.setVisible(false);
panelConvert10g.setVisible(false);
panelConvert1h.setVisible(false);
panelConvert2h.setVisible(false);
panelConvert3h.setVisible(false);
panelConvert4h.setVisible(false);
panelConvert5h.setVisible(false);
panelConvert6h.setVisible(false);
panelConvert7h.setVisible(false);
panelConvert9h.setVisible(false);
panelConvert11h.setVisible(false);
panelConvert13h.setVisible(false);
panelConvert14h.setVisible(false);
panelConvert15h.setVisible(false);
panelConvert16h.setVisible(false);
panelFormat1.setVisible(false);
panelFormat3.setVisible(false);
panelFormat5.setVisible(false);
panelFormat7.setVisible(false);
panelFormat9.setVisible(false);
panelFormat11.setVisible(false);
panelFormat13.setVisible(false);
panelConvert1i.setVisible(false);
panelConvert3i.setVisible(false);
panelConvert4i.setVisible(false);
panelConvert5i.setVisible(false);
panelConvert6i.setVisible(false);
panelConvert7i.setVisible(false);
panelConvert8i.setVisible(false);
panelConvert9i.setVisible(false);
panelConvert10i.setVisible(false);
panelConvert11i.setVisible(false);
panelConvert12i.setVisible(false);
panelConvert13i.setVisible(false);
panelConvert14i.setVisible(false);
panelConvert15i.setVisible(false);
panelConvert1j.setVisible(false);
panelConvert3j.setVisible(false);
panelConvert4j.setVisible(false);
panelConvert5j.setVisible(false);
panelConvert6j.setVisible(false);
panelConvert7j.setVisible(false);
panelConvert8j.setVisible(false);
panelConvert9j.setVisible(false);
panelConvert10j.setVisible(false);
panelConvert11j.setVisible(false);
panelConvert12j.setVisible(false);
panelConvert13j.setVisible(false);
panelConvert1k.setVisible(false);
panelConvert3k.setVisible(false);
panelConvert4k.setVisible(false);
panelConvert5k.setVisible(false);
panelConvert6k.setVisible(false);
panelConvert7k.setVisible(false);
panelConvert8k.setVisible(false);
panelConvert9k.setVisible(false);
panelConvert10k.setVisible(false);
panelConvert11k.setVisible(false);
panelConvert12k.setVisible(false);
panelConvert13k.setVisible(false);
panelConvert14k.setVisible(false);
panelConvert15k.setVisible(false);
panelConvert16k.setVisible(false);
panelConvert17k.setVisible(false);
panelConvert1l.setVisible(false);
panelConvert2l.setVisible(false);
panelConvert3l.setVisible(false);
panelConvert4l.setVisible(false);
panelConvert5l.setVisible(false);
panelConvert6l.setVisible(false);
panelConvert7l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert9l.setVisible(false);;
panelConvert11l.setVisible(false);
panelConvert12l.setVisible(false);
panelConvert13l.setVisible(false);
panelConvert14l.setVisible(false);
panelCircle1b.setVisible(false);
panelCircle2b.setVisible(false);
panelCircle3b.setVisible(false);
panelCircle4b.setVisible(false);
panelCircle5b.setVisible(false);
panelCircle6b.setVisible(false);
panelCircle7b.setVisible(false);
panelCircle8b.setVisible(false);
panelCircle9b.setVisible(false);
panelCircle10b.setVisible(false);
panelCircle11b.setVisible(false);
panelCircle12b.setVisible(false);
panelCube1a.setVisible(false);
panelCube2a.setVisible(false);
panelCube3a.setVisible(false);
panelCube4a.setVisible(false);
panelCube5a.setVisible(false);
panelCube6a.setVisible(false);
panelCube7a.setVisible(false);
panelCube8a.setVisible(false);
panelCube9a.setVisible(false);
panelCube10a.setVisible(false);
panelCube11a.setVisible(false);
panelCube12a.setVisible(false);
panelSphere1a.setVisible(false);
panelSphere2a.setVisible(false);
panelSphere3a.setVisible(false);
panelSphere4a.setVisible(false);
panelSphere5a.setVisible(false);
panelSphere6a.setVisible(false);
panelSphere7a.setVisible(false);
panelSphere8a.setVisible(false);
panelSphere9a.setVisible(false);
panelSphere10a.setVisible(false);
panelSphere11a.setVisible(false);
panelSphere12a.setVisible(false);

}

//$$$$$$$$$$$$$$$$ Choose convert -> temperature $$$$$$$$$$$$$$$$
if (e.getSource() == chooseConvertTemperature) {
iconPanel.setBounds(250, 250, 250, 250);
frame.setSize(800, 535);
notePanel1.setBounds(500, 0, 310, 500);
notePanel2.setBounds(500, 0, 310, 500);
notePanel3.setBounds(500, 0, 310, 500);
notePanel4.setBounds(500, 0, 310, 500);
notePanel5.setBounds(500, 0, 310, 500);
iconLabel.setIcon(temperature);
//Vis on
panelConvert1d.setVisible(true);
panelConvert2d.setVisible(true);
panelConvert3d.setVisible(true);
panelConvert4d.setVisible(true);
panelConvert5d.setVisible(true);
panelConvert6d.setVisible(true);
panelConvert7d.setVisible(true);
panelConvert9d.setVisible(true);
panelConvert11d.setVisible(true);

//Vis off
panelTriangle1a.setVisible(false);
panelTriangle2a.setVisible(false);
panelTriangle3a.setVisible(false);
panelTriangle4a.setVisible(false);
panelTriangle5a.setVisible(false);
panelTriangle6a.setVisible(false);
panelTriangle7a.setVisible(false);
panelTriangle8a.setVisible(false);
panelTriangle9a.setVisible(false);
panelTriangle10a.setVisible(false);
panelTriangle11a.setVisible(false);
panelTriangle12a.setVisible(false);
panelTriangle13a.setVisible(false);
panelTriangle14a.setVisible(false);
panelTriangle15a.setVisible(false);
panelTriangle16a.setVisible(false);
panelTriangle17a.setVisible(false);
panelTriangle18a.setVisible(false);
panelTriangle19a.setVisible(false);
panelTriangle20a.setVisible(false);
panelTriangle21a.setVisible(false);
panelTriangle22a.setVisible(false);
panelTriangle23a.setVisible(false);
panelTriangle24a.setVisible(false);
panelTriangle25a.setVisible(false);
panelTriangle26a.setVisible(false);
panelTriangle27a.setVisible(false);
panelTriangle28a.setVisible(false);
panelTriangle31a.setVisible(false);
panelTriangle34a.setVisible(false);
panelConvert1a.setVisible(false);
panelConvert2a.setVisible(false);
panelConvert3a.setVisible(false);
panelConvert4a.setVisible(false);
panelConvert5a.setVisible(false);
panelConvert6a.setVisible(false);
panelConvert7a.setVisible(false);
panelConvert8a.setVisible(false);
panelConvert9a.setVisible(false);
panelConvert10a.setVisible(false);
panelConvert11a.setVisible(false);
panelConvert12a.setVisible(false);
panelConvert13a.setVisible(false);
panelConvert14a.setVisible(false);
panelSquare1a.setVisible(false);
panelSquare2a.setVisible(false);
panelSquare3a.setVisible(false);
panelSquare4a.setVisible(false);
panelSquare5a.setVisible(false);
panelSquare6a.setVisible(false);
panelSquare7a.setVisible(false);
panelSquare9a.setVisible(false);
panelSquare11a.setVisible(false);
panelConvert1e.setVisible(false);
panelConvert2e.setVisible(false);
panelConvert3e.setVisible(false);
panelConvert4e.setVisible(false);
panelConvert5e.setVisible(false);
panelConvert6e.setVisible(false);
panelConvert7e.setVisible(false);
panelConvert8e.setVisible(false);
panelConvert9e.setVisible(false);
panelConvert10e.setVisible(false);
panelConvert11e.setVisible(false);
panelConvert12e.setVisible(false);
panelConvert13e.setVisible(false);
panelConvert14e.setVisible(false);
panelConvert1b.setVisible(false);
panelConvert2b.setVisible(false);
panelConvert3b.setVisible(false);
panelConvert4b.setVisible(false);
panelConvert5b.setVisible(false);
panelConvert6b.setVisible(false);
panelConvert7b.setVisible(false);
panelConvert8b.setVisible(false);
panelConvert9b.setVisible(false);
panelConvert11b.setVisible(false);
panelConvert12b.setVisible(false);
panelConvert13b.setVisible(false);
panelConvert14b.setVisible(false);
panelConvert1c.setVisible(false);
panelConvert2c.setVisible(false);
panelConvert3c.setVisible(false);
panelConvert4c.setVisible(false);
panelConvert5c.setVisible(false);
panelConvert6c.setVisible(false);
panelConvert7c.setVisible(false);
panelConvert8c.setVisible(false);
panelConvert9c.setVisible(false);
panelConvert10c.setVisible(false);
panelConvert11c.setVisible(false);
panelConvert12c.setVisible(false);
panelConvert1f.setVisible(false);
panelConvert2f.setVisible(false);
panelConvert3f.setVisible(false);
panelConvert4f.setVisible(false);
panelConvert5f.setVisible(false);
panelConvert6f.setVisible(false);
panelConvert7f.setVisible(false);
panelConvert8f.setVisible(false);
panelConvert9f.setVisible(false);
panelConvert10f.setVisible(false);
panelConvert11f.setVisible(false);
panelConvert12f.setVisible(false);
panelConvert1g.setVisible(false);
panelConvert2g.setVisible(false);
panelConvert3g.setVisible(false);
panelConvert4g.setVisible(false);
panelConvert5g.setVisible(false);
panelConvert6g.setVisible(false);
panelConvert7g.setVisible(false);
panelConvert8g.setVisible(false);
panelConvert9g.setVisible(false);
panelConvert10g.setVisible(false);
panelConvert1h.setVisible(false);
panelConvert2h.setVisible(false);
panelConvert3h.setVisible(false);
panelConvert4h.setVisible(false);
panelConvert5h.setVisible(false);
panelConvert6h.setVisible(false);
panelConvert7h.setVisible(false);
panelConvert9h.setVisible(false);
panelConvert11h.setVisible(false);
panelConvert13h.setVisible(false);
panelConvert14h.setVisible(false);
panelConvert15h.setVisible(false);
panelConvert16h.setVisible(false);
panelFormat1.setVisible(false);
panelFormat3.setVisible(false);
panelFormat5.setVisible(false);
panelFormat7.setVisible(false);
panelFormat9.setVisible(false);
panelFormat11.setVisible(false);
panelFormat13.setVisible(false);
panelConvert1i.setVisible(false);
panelConvert3i.setVisible(false);
panelConvert4i.setVisible(false);
panelConvert5i.setVisible(false);
panelConvert6i.setVisible(false);
panelConvert7i.setVisible(false);
panelConvert8i.setVisible(false);
panelConvert9i.setVisible(false);
panelConvert10i.setVisible(false);
panelConvert11i.setVisible(false);
panelConvert12i.setVisible(false);
panelConvert13i.setVisible(false);
panelConvert14i.setVisible(false);
panelConvert15i.setVisible(false);
panelConvert1j.setVisible(false);
panelConvert3j.setVisible(false);
panelConvert4j.setVisible(false);
panelConvert5j.setVisible(false);
panelConvert6j.setVisible(false);
panelConvert7j.setVisible(false);
panelConvert8j.setVisible(false);
panelConvert9j.setVisible(false);
panelConvert10j.setVisible(false);
panelConvert11j.setVisible(false);
panelConvert12j.setVisible(false);
panelConvert13j.setVisible(false);
panelConvert1k.setVisible(false);
panelConvert3k.setVisible(false);
panelConvert4k.setVisible(false);
panelConvert5k.setVisible(false);
panelConvert6k.setVisible(false);
panelConvert7k.setVisible(false);
panelConvert8k.setVisible(false);
panelConvert9k.setVisible(false);
panelConvert10k.setVisible(false);
panelConvert11k.setVisible(false);
panelConvert12k.setVisible(false);
panelConvert13k.setVisible(false);
panelConvert14k.setVisible(false);
panelConvert15k.setVisible(false);
panelConvert16k.setVisible(false);
panelConvert17k.setVisible(false);
panelConvert1l.setVisible(false);
panelConvert2l.setVisible(false);
panelConvert3l.setVisible(false);
panelConvert4l.setVisible(false);
panelConvert5l.setVisible(false);
panelConvert6l.setVisible(false);
panelConvert7l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert9l.setVisible(false);;
panelConvert11l.setVisible(false);
panelConvert12l.setVisible(false);
panelConvert13l.setVisible(false);
panelConvert14l.setVisible(false);
panelCircle1b.setVisible(false);
panelCircle2b.setVisible(false);
panelCircle3b.setVisible(false);
panelCircle4b.setVisible(false);
panelCircle5b.setVisible(false);
panelCircle6b.setVisible(false);
panelCircle7b.setVisible(false);
panelCircle8b.setVisible(false);
panelCircle9b.setVisible(false);
panelCircle10b.setVisible(false);
panelCircle11b.setVisible(false);
panelCircle12b.setVisible(false);
panelCube1a.setVisible(false);
panelCube2a.setVisible(false);
panelCube3a.setVisible(false);
panelCube4a.setVisible(false);
panelCube5a.setVisible(false);
panelCube6a.setVisible(false);
panelCube7a.setVisible(false);
panelCube8a.setVisible(false);
panelCube9a.setVisible(false);
panelCube10a.setVisible(false);
panelCube11a.setVisible(false);
panelCube12a.setVisible(false);
panelSphere1a.setVisible(false);
panelSphere2a.setVisible(false);
panelSphere3a.setVisible(false);
panelSphere4a.setVisible(false);
panelSphere5a.setVisible(false);
panelSphere6a.setVisible(false);
panelSphere7a.setVisible(false);
panelSphere8a.setVisible(false);
panelSphere9a.setVisible(false);
panelSphere10a.setVisible(false);
panelSphere11a.setVisible(false);
panelSphere12a.setVisible(false);


}

//$$$$$$$$$$$$$$$$ Choose convert -> weight $$$$$$$$$$$$$$$$
if (e.getSource() == chooseConvertWeight) {
iconPanel.setBounds(250, 250, 250, 250);
frame.setSize(800, 535);
notePanel1.setBounds(500, 0, 310, 500);
notePanel2.setBounds(500, 0, 310, 500);
notePanel3.setBounds(500, 0, 310, 500);
notePanel4.setBounds(500, 0, 310, 500);
notePanel5.setBounds(500, 0, 310, 500);
iconLabel.setIcon(weight);
//Vis on
panelConvert1e.setVisible(true);
panelConvert2e.setVisible(true);
panelConvert3e.setVisible(true);
panelConvert4e.setVisible(true);
panelConvert5e.setVisible(true);
panelConvert6e.setVisible(true);
panelConvert7e.setVisible(true);
panelConvert8e.setVisible(true);
panelConvert9e.setVisible(true);
panelConvert10e.setVisible(true);
panelConvert11e.setVisible(true);
panelConvert12e.setVisible(true);
panelConvert13e.setVisible(true);
panelConvert14e.setVisible(true);

//Vis off
panelTriangle1a.setVisible(false);
panelTriangle2a.setVisible(false);
panelTriangle3a.setVisible(false);
panelTriangle4a.setVisible(false);
panelTriangle5a.setVisible(false);
panelTriangle6a.setVisible(false);
panelTriangle7a.setVisible(false);
panelTriangle8a.setVisible(false);
panelTriangle9a.setVisible(false);
panelTriangle10a.setVisible(false);
panelTriangle11a.setVisible(false);
panelTriangle12a.setVisible(false);
panelTriangle13a.setVisible(false);
panelTriangle14a.setVisible(false);
panelTriangle15a.setVisible(false);
panelTriangle16a.setVisible(false);
panelTriangle17a.setVisible(false);
panelTriangle18a.setVisible(false);
panelTriangle19a.setVisible(false);
panelTriangle20a.setVisible(false);
panelTriangle21a.setVisible(false);
panelTriangle22a.setVisible(false);
panelTriangle23a.setVisible(false);
panelTriangle24a.setVisible(false);
panelTriangle25a.setVisible(false);
panelTriangle26a.setVisible(false);
panelTriangle27a.setVisible(false);
panelTriangle28a.setVisible(false);
panelTriangle31a.setVisible(false);
panelTriangle34a.setVisible(false);
panelConvert1a.setVisible(false);
panelConvert2a.setVisible(false);
panelConvert3a.setVisible(false);
panelConvert4a.setVisible(false);
panelConvert5a.setVisible(false);
panelConvert6a.setVisible(false);
panelConvert7a.setVisible(false);
panelConvert8a.setVisible(false);
panelConvert9a.setVisible(false);
panelConvert10a.setVisible(false);
panelConvert11a.setVisible(false);
panelConvert12a.setVisible(false);
panelConvert13a.setVisible(false);
panelConvert14a.setVisible(false);
panelSquare1a.setVisible(false);
panelSquare2a.setVisible(false);
panelSquare3a.setVisible(false);
panelSquare4a.setVisible(false);
panelSquare5a.setVisible(false);
panelSquare6a.setVisible(false);
panelSquare7a.setVisible(false);
panelSquare9a.setVisible(false);
panelSquare11a.setVisible(false);
panelConvert1d.setVisible(false);
panelConvert2d.setVisible(false);
panelConvert3d.setVisible(false);
panelConvert4d.setVisible(false);
panelConvert5d.setVisible(false);
panelConvert6d.setVisible(false);
panelConvert7d.setVisible(false);
panelConvert9d.setVisible(false);
panelConvert11d.setVisible(false);
panelConvert1b.setVisible(false);
panelConvert2b.setVisible(false);
panelConvert3b.setVisible(false);
panelConvert4b.setVisible(false);
panelConvert5b.setVisible(false);
panelConvert6b.setVisible(false);
panelConvert7b.setVisible(false);
panelConvert8b.setVisible(false);
panelConvert9b.setVisible(false);
panelConvert11b.setVisible(false);
panelConvert12b.setVisible(false);
panelConvert13b.setVisible(false);
panelConvert14b.setVisible(false);
panelConvert1c.setVisible(false);
panelConvert2c.setVisible(false);
panelConvert3c.setVisible(false);
panelConvert4c.setVisible(false);
panelConvert5c.setVisible(false);
panelConvert6c.setVisible(false);
panelConvert7c.setVisible(false);
panelConvert8c.setVisible(false);
panelConvert9c.setVisible(false);
panelConvert10c.setVisible(false);
panelConvert11c.setVisible(false);
panelConvert12c.setVisible(false);
panelConvert1f.setVisible(false);
panelConvert2f.setVisible(false);
panelConvert3f.setVisible(false);
panelConvert4f.setVisible(false);
panelConvert5f.setVisible(false);
panelConvert6f.setVisible(false);
panelConvert7f.setVisible(false);
panelConvert8f.setVisible(false);
panelConvert9f.setVisible(false);
panelConvert10f.setVisible(false);
panelConvert11f.setVisible(false);
panelConvert12f.setVisible(false);
panelConvert1g.setVisible(false);
panelConvert2g.setVisible(false);
panelConvert3g.setVisible(false);
panelConvert4g.setVisible(false);
panelConvert5g.setVisible(false);
panelConvert6g.setVisible(false);
panelConvert7g.setVisible(false);
panelConvert8g.setVisible(false);
panelConvert9g.setVisible(false);
panelConvert10g.setVisible(false);
panelConvert1h.setVisible(false);
panelConvert2h.setVisible(false);
panelConvert3h.setVisible(false);
panelConvert4h.setVisible(false);
panelConvert5h.setVisible(false);
panelConvert6h.setVisible(false);
panelConvert7h.setVisible(false);
panelConvert9h.setVisible(false);
panelConvert11h.setVisible(false);
panelConvert13h.setVisible(false);
panelConvert14h.setVisible(false);
panelConvert15h.setVisible(false);
panelConvert16h.setVisible(false);
panelFormat1.setVisible(false);
panelFormat3.setVisible(false);
panelFormat5.setVisible(false);
panelFormat7.setVisible(false);
panelFormat9.setVisible(false);
panelFormat11.setVisible(false);
panelFormat13.setVisible(false);
panelConvert1i.setVisible(false);
panelConvert3i.setVisible(false);
panelConvert4i.setVisible(false);
panelConvert5i.setVisible(false);
panelConvert6i.setVisible(false);
panelConvert7i.setVisible(false);
panelConvert8i.setVisible(false);
panelConvert9i.setVisible(false);
panelConvert10i.setVisible(false);
panelConvert11i.setVisible(false);
panelConvert12i.setVisible(false);
panelConvert13i.setVisible(false);
panelConvert14i.setVisible(false);
panelConvert15i.setVisible(false);
panelConvert1j.setVisible(false);
panelConvert3j.setVisible(false);
panelConvert4j.setVisible(false);
panelConvert5j.setVisible(false);
panelConvert6j.setVisible(false);
panelConvert7j.setVisible(false);
panelConvert8j.setVisible(false);
panelConvert9j.setVisible(false);
panelConvert10j.setVisible(false);
panelConvert11j.setVisible(false);
panelConvert12j.setVisible(false);
panelConvert13j.setVisible(false);
panelConvert1k.setVisible(false);
panelConvert3k.setVisible(false);
panelConvert4k.setVisible(false);
panelConvert5k.setVisible(false);
panelConvert6k.setVisible(false);
panelConvert7k.setVisible(false);
panelConvert8k.setVisible(false);
panelConvert9k.setVisible(false);
panelConvert10k.setVisible(false);
panelConvert11k.setVisible(false);
panelConvert12k.setVisible(false);
panelConvert13k.setVisible(false);
panelConvert14k.setVisible(false);
panelConvert15k.setVisible(false);
panelConvert16k.setVisible(false);
panelConvert17k.setVisible(false);
panelConvert1l.setVisible(false);
panelConvert2l.setVisible(false);
panelConvert3l.setVisible(false);
panelConvert4l.setVisible(false);
panelConvert5l.setVisible(false);
panelConvert6l.setVisible(false);
panelConvert7l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert9l.setVisible(false);;
panelConvert11l.setVisible(false);
panelConvert12l.setVisible(false);
panelConvert13l.setVisible(false);
panelConvert14l.setVisible(false);
panelCircle1b.setVisible(false);
panelCircle2b.setVisible(false);
panelCircle3b.setVisible(false);
panelCircle4b.setVisible(false);
panelCircle5b.setVisible(false);
panelCircle6b.setVisible(false);
panelCircle7b.setVisible(false);
panelCircle8b.setVisible(false);
panelCircle9b.setVisible(false);
panelCircle10b.setVisible(false);
panelCircle11b.setVisible(false);
panelCircle12b.setVisible(false);
panelCube1a.setVisible(false);
panelCube2a.setVisible(false);
panelCube3a.setVisible(false);
panelCube4a.setVisible(false);
panelCube5a.setVisible(false);
panelCube6a.setVisible(false);
panelCube7a.setVisible(false);
panelCube8a.setVisible(false);
panelCube9a.setVisible(false);
panelCube10a.setVisible(false);
panelCube11a.setVisible(false);
panelCube12a.setVisible(false);
panelSphere1a.setVisible(false);
panelSphere2a.setVisible(false);
panelSphere3a.setVisible(false);
panelSphere4a.setVisible(false);
panelSphere5a.setVisible(false);
panelSphere6a.setVisible(false);
panelSphere7a.setVisible(false);
panelSphere8a.setVisible(false);
panelSphere9a.setVisible(false);
panelSphere10a.setVisible(false);
panelSphere11a.setVisible(false);
panelSphere12a.setVisible(false);

}

//$$$$$$$$$$$$$$$$ Choose convert -> volume  $$$$$$$$$$$$$$$$
if (e.getSource() == chooseConvertVolume) {
iconPanel.setBounds(250, 250, 250, 250);
frame.setSize(800, 535);
notePanel1.setBounds(500, 0, 310, 500);
notePanel2.setBounds(500, 0, 310, 500);
notePanel3.setBounds(500, 0, 310, 500);
notePanel4.setBounds(500, 0, 310, 500);
notePanel5.setBounds(500, 0, 310, 500);
iconLabel.setIcon(volume);
//Vis on
panelConvert1b.setVisible(true);
panelConvert2b.setVisible(true);
panelConvert3b.setVisible(true);
panelConvert4b.setVisible(true);
panelConvert5b.setVisible(true);
panelConvert6b.setVisible(true);
panelConvert7b.setVisible(true);
panelConvert8b.setVisible(true);
panelConvert9b.setVisible(true);
panelConvert11b.setVisible(true);
panelConvert12b.setVisible(true);
panelConvert13b.setVisible(true);
panelConvert14b.setVisible(true);

//Vis off
panelTriangle1a.setVisible(false);
panelTriangle2a.setVisible(false);
panelTriangle3a.setVisible(false);
panelTriangle4a.setVisible(false);
panelTriangle5a.setVisible(false);
panelTriangle6a.setVisible(false);
panelTriangle7a.setVisible(false);
panelTriangle8a.setVisible(false);
panelTriangle9a.setVisible(false);
panelTriangle10a.setVisible(false);
panelTriangle11a.setVisible(false);
panelTriangle12a.setVisible(false);
panelTriangle13a.setVisible(false);
panelTriangle14a.setVisible(false);
panelTriangle15a.setVisible(false);
panelTriangle16a.setVisible(false);
panelTriangle17a.setVisible(false);
panelTriangle18a.setVisible(false);
panelTriangle19a.setVisible(false);
panelTriangle20a.setVisible(false);
panelTriangle21a.setVisible(false);
panelTriangle22a.setVisible(false);
panelTriangle23a.setVisible(false);
panelTriangle24a.setVisible(false);
panelTriangle25a.setVisible(false);
panelTriangle26a.setVisible(false);
panelTriangle27a.setVisible(false);
panelTriangle28a.setVisible(false);
panelTriangle31a.setVisible(false);
panelTriangle34a.setVisible(false);
panelConvert1a.setVisible(false);
panelConvert2a.setVisible(false);
panelConvert3a.setVisible(false);
panelConvert4a.setVisible(false);
panelConvert5a.setVisible(false);
panelConvert6a.setVisible(false);
panelConvert7a.setVisible(false);
panelConvert8a.setVisible(false);
panelConvert9a.setVisible(false);
panelConvert10a.setVisible(false);
panelConvert11a.setVisible(false);
panelConvert12a.setVisible(false);
panelConvert13a.setVisible(false);
panelConvert14a.setVisible(false);
panelSquare1a.setVisible(false);
panelSquare2a.setVisible(false);
panelSquare3a.setVisible(false);
panelSquare4a.setVisible(false);
panelSquare5a.setVisible(false);
panelSquare6a.setVisible(false);
panelSquare7a.setVisible(false);
panelSquare9a.setVisible(false);
panelSquare11a.setVisible(false);
panelConvert1d.setVisible(false);
panelConvert2d.setVisible(false);
panelConvert3d.setVisible(false);
panelConvert4d.setVisible(false);
panelConvert5d.setVisible(false);
panelConvert6d.setVisible(false);
panelConvert7d.setVisible(false);
panelConvert9d.setVisible(false);
panelConvert11d.setVisible(false);
panelConvert1c.setVisible(false);
panelConvert2c.setVisible(false);
panelConvert3c.setVisible(false);
panelConvert4c.setVisible(false);
panelConvert5c.setVisible(false);
panelConvert6c.setVisible(false);
panelConvert7c.setVisible(false);
panelConvert8c.setVisible(false);
panelConvert9c.setVisible(false);
panelConvert10c.setVisible(false);
panelConvert11c.setVisible(false);
panelConvert12c.setVisible(false);
panelConvert1e.setVisible(false);
panelConvert2e.setVisible(false);
panelConvert3e.setVisible(false);
panelConvert4e.setVisible(false);
panelConvert5e.setVisible(false);
panelConvert6e.setVisible(false);
panelConvert7e.setVisible(false);
panelConvert8e.setVisible(false);
panelConvert9e.setVisible(false);
panelConvert10e.setVisible(false);
panelConvert11e.setVisible(false);
panelConvert12e.setVisible(false);
panelConvert13e.setVisible(false);
panelConvert14e.setVisible(false);
panelConvert1f.setVisible(false);
panelConvert2f.setVisible(false);
panelConvert3f.setVisible(false);
panelConvert4f.setVisible(false);
panelConvert5f.setVisible(false);
panelConvert6f.setVisible(false);
panelConvert7f.setVisible(false);
panelConvert8f.setVisible(false);
panelConvert9f.setVisible(false);
panelConvert10f.setVisible(false);
panelConvert11f.setVisible(false);
panelConvert12f.setVisible(false);
panelConvert1g.setVisible(false);
panelConvert2g.setVisible(false);
panelConvert3g.setVisible(false);
panelConvert4g.setVisible(false);
panelConvert5g.setVisible(false);
panelConvert6g.setVisible(false);
panelConvert7g.setVisible(false);
panelConvert8g.setVisible(false);
panelConvert9g.setVisible(false);
panelConvert10g.setVisible(false);
panelConvert1h.setVisible(false);
panelConvert2h.setVisible(false);
panelConvert3h.setVisible(false);
panelConvert4h.setVisible(false);
panelConvert5h.setVisible(false);
panelConvert6h.setVisible(false);
panelConvert7h.setVisible(false);
panelConvert9h.setVisible(false);
panelConvert11h.setVisible(false);
panelConvert13h.setVisible(false);
panelConvert14h.setVisible(false);
panelConvert15h.setVisible(false);
panelConvert16h.setVisible(false);
panelFormat1.setVisible(false);
panelFormat3.setVisible(false);
panelFormat5.setVisible(false);
panelFormat7.setVisible(false);
panelFormat9.setVisible(false);
panelFormat11.setVisible(false);
panelFormat13.setVisible(false);
panelConvert1i.setVisible(false);
panelConvert3i.setVisible(false);
panelConvert4i.setVisible(false);
panelConvert5i.setVisible(false);
panelConvert6i.setVisible(false);
panelConvert7i.setVisible(false);
panelConvert8i.setVisible(false);
panelConvert9i.setVisible(false);
panelConvert10i.setVisible(false);
panelConvert11i.setVisible(false);
panelConvert12i.setVisible(false);
panelConvert13i.setVisible(false);
panelConvert14i.setVisible(false);
panelConvert15i.setVisible(false);
panelConvert1j.setVisible(false);
panelConvert3j.setVisible(false);
panelConvert4j.setVisible(false);
panelConvert5j.setVisible(false);
panelConvert6j.setVisible(false);
panelConvert7j.setVisible(false);
panelConvert8j.setVisible(false);
panelConvert9j.setVisible(false);
panelConvert10j.setVisible(false);
panelConvert11j.setVisible(false);
panelConvert12j.setVisible(false);
panelConvert13j.setVisible(false);
panelConvert1k.setVisible(false);
panelConvert3k.setVisible(false);
panelConvert4k.setVisible(false);
panelConvert5k.setVisible(false);
panelConvert6k.setVisible(false);
panelConvert7k.setVisible(false);
panelConvert8k.setVisible(false);
panelConvert9k.setVisible(false);
panelConvert10k.setVisible(false);
panelConvert11k.setVisible(false);
panelConvert12k.setVisible(false);
panelConvert13k.setVisible(false);
panelConvert14k.setVisible(false);
panelConvert15k.setVisible(false);
panelConvert16k.setVisible(false);
panelConvert17k.setVisible(false);
panelConvert1l.setVisible(false);
panelConvert2l.setVisible(false);
panelConvert3l.setVisible(false);
panelConvert4l.setVisible(false);
panelConvert5l.setVisible(false);
panelConvert6l.setVisible(false);
panelConvert7l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert9l.setVisible(false);;
panelConvert11l.setVisible(false);
panelConvert12l.setVisible(false);
panelConvert13l.setVisible(false);
panelConvert14l.setVisible(false);
panelCircle1b.setVisible(false);
panelCircle2b.setVisible(false);
panelCircle3b.setVisible(false);
panelCircle4b.setVisible(false);
panelCircle5b.setVisible(false);
panelCircle6b.setVisible(false);
panelCircle7b.setVisible(false);
panelCircle8b.setVisible(false);
panelCircle9b.setVisible(false);
panelCircle10b.setVisible(false);
panelCircle11b.setVisible(false);
panelCircle12b.setVisible(false);
panelCube1a.setVisible(false);
panelCube2a.setVisible(false);
panelCube3a.setVisible(false);
panelCube4a.setVisible(false);
panelCube5a.setVisible(false);
panelCube6a.setVisible(false);
panelCube7a.setVisible(false);
panelCube8a.setVisible(false);
panelCube9a.setVisible(false);
panelCube10a.setVisible(false);
panelCube11a.setVisible(false);
panelCube12a.setVisible(false);
panelSphere1a.setVisible(false);
panelSphere2a.setVisible(false);
panelSphere3a.setVisible(false);
panelSphere4a.setVisible(false);
panelSphere5a.setVisible(false);
panelSphere6a.setVisible(false);
panelSphere7a.setVisible(false);
panelSphere8a.setVisible(false);
panelSphere9a.setVisible(false);
panelSphere10a.setVisible(false);
panelSphere11a.setVisible(false);
panelSphere12a.setVisible(false);

}

//$$$$$$$$$$$$$$$$ Choose convert -> area $$$$$$$$$$$$$$$$
if (e.getSource() == chooseConvertArea) {
iconPanel.setBounds(250, 250, 250, 250);
frame.setSize(800, 535);
notePanel1.setBounds(500, 0, 310, 500);
notePanel2.setBounds(500, 0, 310, 500);
notePanel3.setBounds(500, 0, 310, 500);
notePanel4.setBounds(500, 0, 310, 500);
notePanel5.setBounds(500, 0, 310, 500);
iconLabel.setIcon(area);
//Vis on
panelConvert1c.setVisible(true);
panelConvert2c.setVisible(true);
panelConvert3c.setVisible(true);
panelConvert4c.setVisible(true);
panelConvert5c.setVisible(true);
panelConvert6c.setVisible(true);
panelConvert7c.setVisible(true);
panelConvert8c.setVisible(true);
panelConvert9c.setVisible(true);
panelConvert10c.setVisible(true);
panelConvert11c.setVisible(true);
panelConvert12c.setVisible(true);

//Vis off
panelTriangle1a.setVisible(false);
panelTriangle2a.setVisible(false);
panelTriangle3a.setVisible(false);
panelTriangle4a.setVisible(false);
panelTriangle5a.setVisible(false);
panelTriangle6a.setVisible(false);
panelTriangle7a.setVisible(false);
panelTriangle8a.setVisible(false);
panelTriangle9a.setVisible(false);
panelTriangle10a.setVisible(false);
panelTriangle11a.setVisible(false);
panelTriangle12a.setVisible(false);
panelTriangle13a.setVisible(false);
panelTriangle14a.setVisible(false);
panelTriangle15a.setVisible(false);
panelTriangle16a.setVisible(false);
panelTriangle17a.setVisible(false);
panelTriangle18a.setVisible(false);
panelTriangle19a.setVisible(false);
panelTriangle20a.setVisible(false);
panelTriangle21a.setVisible(false);
panelTriangle22a.setVisible(false);
panelTriangle23a.setVisible(false);
panelTriangle24a.setVisible(false);
panelTriangle25a.setVisible(false);
panelTriangle26a.setVisible(false);
panelTriangle27a.setVisible(false);
panelTriangle28a.setVisible(false);
panelTriangle31a.setVisible(false);
panelTriangle34a.setVisible(false);
panelConvert1a.setVisible(false);
panelConvert2a.setVisible(false);
panelConvert3a.setVisible(false);
panelConvert4a.setVisible(false);
panelConvert5a.setVisible(false);
panelConvert6a.setVisible(false);
panelConvert7a.setVisible(false);
panelConvert8a.setVisible(false);
panelConvert9a.setVisible(false);
panelConvert10a.setVisible(false);
panelConvert11a.setVisible(false);
panelConvert12a.setVisible(false);
panelConvert13a.setVisible(false);
panelConvert14a.setVisible(false);
panelSquare1a.setVisible(false);
panelSquare2a.setVisible(false);
panelSquare3a.setVisible(false);
panelSquare4a.setVisible(false);
panelSquare5a.setVisible(false);
panelSquare6a.setVisible(false);
panelSquare7a.setVisible(false);
panelSquare9a.setVisible(false);
panelSquare11a.setVisible(false);
panelConvert1d.setVisible(false);
panelConvert2d.setVisible(false);
panelConvert3d.setVisible(false);
panelConvert4d.setVisible(false);
panelConvert5d.setVisible(false);
panelConvert6d.setVisible(false);
panelConvert7d.setVisible(false);
panelConvert9d.setVisible(false);
panelConvert11d.setVisible(false);
panelConvert1b.setVisible(false);
panelConvert2b.setVisible(false);
panelConvert3b.setVisible(false);
panelConvert4b.setVisible(false);
panelConvert5b.setVisible(false);
panelConvert6b.setVisible(false);
panelConvert7b.setVisible(false);
panelConvert8b.setVisible(false);
panelConvert9b.setVisible(false);
panelConvert11b.setVisible(false);
panelConvert12b.setVisible(false);
panelConvert13b.setVisible(false);
panelConvert14b.setVisible(false);
panelConvert1e.setVisible(false);
panelConvert2e.setVisible(false);
panelConvert3e.setVisible(false);
panelConvert4e.setVisible(false);
panelConvert5e.setVisible(false);
panelConvert6e.setVisible(false);
panelConvert7e.setVisible(false);
panelConvert8e.setVisible(false);
panelConvert9e.setVisible(false);
panelConvert10e.setVisible(false);
panelConvert11e.setVisible(false);
panelConvert12e.setVisible(false);
panelConvert13e.setVisible(false);
panelConvert14e.setVisible(false);
panelConvert1f.setVisible(false);
panelConvert2f.setVisible(false);
panelConvert3f.setVisible(false);
panelConvert4f.setVisible(false);
panelConvert5f.setVisible(false);
panelConvert6f.setVisible(false);
panelConvert7f.setVisible(false);
panelConvert8f.setVisible(false);
panelConvert9f.setVisible(false);
panelConvert10f.setVisible(false);
panelConvert11f.setVisible(false);
panelConvert12f.setVisible(false);
panelConvert1g.setVisible(false);
panelConvert2g.setVisible(false);
panelConvert3g.setVisible(false);
panelConvert4g.setVisible(false);
panelConvert5g.setVisible(false);
panelConvert6g.setVisible(false);
panelConvert7g.setVisible(false);
panelConvert8g.setVisible(false);
panelConvert9g.setVisible(false);
panelConvert10g.setVisible(false);
panelConvert1h.setVisible(false);
panelConvert2h.setVisible(false);
panelConvert3h.setVisible(false);
panelConvert4h.setVisible(false);
panelConvert5h.setVisible(false);
panelConvert6h.setVisible(false);
panelConvert7h.setVisible(false);
panelConvert9h.setVisible(false);
panelConvert11h.setVisible(false);
panelConvert13h.setVisible(false);
panelConvert14h.setVisible(false);
panelConvert15h.setVisible(false);
panelConvert16h.setVisible(false);
panelFormat1.setVisible(false);
panelFormat3.setVisible(false);
panelFormat5.setVisible(false);
panelFormat7.setVisible(false);
panelFormat9.setVisible(false);
panelFormat11.setVisible(false);
panelFormat13.setVisible(false);
panelConvert1i.setVisible(false);
panelConvert3i.setVisible(false);
panelConvert4i.setVisible(false);
panelConvert5i.setVisible(false);
panelConvert6i.setVisible(false);
panelConvert7i.setVisible(false);
panelConvert8i.setVisible(false);
panelConvert9i.setVisible(false);
panelConvert10i.setVisible(false);
panelConvert11i.setVisible(false);
panelConvert12i.setVisible(false);
panelConvert13i.setVisible(false);
panelConvert14i.setVisible(false);
panelConvert15i.setVisible(false);
panelConvert1j.setVisible(false);
panelConvert3j.setVisible(false);
panelConvert4j.setVisible(false);
panelConvert5j.setVisible(false);
panelConvert6j.setVisible(false);
panelConvert7j.setVisible(false);
panelConvert8j.setVisible(false);
panelConvert9j.setVisible(false);
panelConvert10j.setVisible(false);
panelConvert11j.setVisible(false);
panelConvert12j.setVisible(false);
panelConvert13j.setVisible(false);
panelConvert1k.setVisible(false);
panelConvert3k.setVisible(false);
panelConvert4k.setVisible(false);
panelConvert5k.setVisible(false);
panelConvert6k.setVisible(false);
panelConvert7k.setVisible(false);
panelConvert8k.setVisible(false);
panelConvert9k.setVisible(false);
panelConvert10k.setVisible(false);
panelConvert11k.setVisible(false);
panelConvert12k.setVisible(false);
panelConvert13k.setVisible(false);
panelConvert14k.setVisible(false);
panelConvert15k.setVisible(false);
panelConvert16k.setVisible(false);
panelConvert17k.setVisible(false);
panelConvert1l.setVisible(false);
panelConvert2l.setVisible(false);
panelConvert3l.setVisible(false);
panelConvert4l.setVisible(false);
panelConvert5l.setVisible(false);
panelConvert6l.setVisible(false);
panelConvert7l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert9l.setVisible(false);;
panelConvert11l.setVisible(false);
panelConvert12l.setVisible(false);
panelConvert13l.setVisible(false);
panelConvert14l.setVisible(false);
panelCircle1b.setVisible(false);
panelCircle2b.setVisible(false);
panelCircle3b.setVisible(false);
panelCircle4b.setVisible(false);
panelCircle5b.setVisible(false);
panelCircle6b.setVisible(false);
panelCircle7b.setVisible(false);
panelCircle8b.setVisible(false);
panelCircle9b.setVisible(false);
panelCircle10b.setVisible(false);
panelCircle11b.setVisible(false);
panelCircle12b.setVisible(false);
panelCube1a.setVisible(false);
panelCube2a.setVisible(false);
panelCube3a.setVisible(false);
panelCube4a.setVisible(false);
panelCube5a.setVisible(false);
panelCube6a.setVisible(false);
panelCube7a.setVisible(false);
panelCube8a.setVisible(false);
panelCube9a.setVisible(false);
panelCube10a.setVisible(false);
panelCube11a.setVisible(false);
panelCube12a.setVisible(false);
panelSphere1a.setVisible(false);
panelSphere2a.setVisible(false);
panelSphere3a.setVisible(false);
panelSphere4a.setVisible(false);
panelSphere5a.setVisible(false);
panelSphere6a.setVisible(false);
panelSphere7a.setVisible(false);
panelSphere8a.setVisible(false);
panelSphere9a.setVisible(false);
panelSphere10a.setVisible(false);
panelSphere11a.setVisible(false);
panelSphere12a.setVisible(false);

}

//$$$$$$$$$$$$$$$$ Choose convert -> speed $$$$$$$$$$$$$$$$
if (e.getSource() == chooseConvertSpeed) {
iconPanel.setBounds(250, 250, 250, 250);
frame.setSize(800, 535);
notePanel1.setBounds(500, 0, 310, 500);
notePanel2.setBounds(500, 0, 310, 500);
notePanel3.setBounds(500, 0, 310, 500);
notePanel4.setBounds(500, 0, 310, 500);
notePanel5.setBounds(500, 0, 310, 500);
iconLabel.setIcon(speed);
//Vis on
panelConvert1f.setVisible(true);
panelConvert2f.setVisible(true);
panelConvert3f.setVisible(true);
panelConvert4f.setVisible(true);
panelConvert5f.setVisible(true);
panelConvert6f.setVisible(true);
panelConvert7f.setVisible(true);
panelConvert8f.setVisible(true);
panelConvert9f.setVisible(true);
panelConvert10f.setVisible(true);
panelConvert11f.setVisible(true);
panelConvert12f.setVisible(true);

//Vis off
panelTriangle1a.setVisible(false);
panelTriangle2a.setVisible(false);
panelTriangle3a.setVisible(false);
panelTriangle4a.setVisible(false);
panelTriangle5a.setVisible(false);
panelTriangle6a.setVisible(false);
panelTriangle7a.setVisible(false);
panelTriangle8a.setVisible(false);
panelTriangle9a.setVisible(false);
panelTriangle10a.setVisible(false);
panelTriangle11a.setVisible(false);
panelTriangle12a.setVisible(false);
panelTriangle13a.setVisible(false);
panelTriangle14a.setVisible(false);
panelTriangle15a.setVisible(false);
panelTriangle16a.setVisible(false);
panelTriangle17a.setVisible(false);
panelTriangle18a.setVisible(false);
panelTriangle19a.setVisible(false);
panelTriangle20a.setVisible(false);
panelTriangle21a.setVisible(false);
panelTriangle22a.setVisible(false);
panelTriangle23a.setVisible(false);
panelTriangle24a.setVisible(false);
panelTriangle25a.setVisible(false);
panelTriangle26a.setVisible(false);
panelTriangle27a.setVisible(false);
panelTriangle28a.setVisible(false);
panelTriangle31a.setVisible(false);
panelTriangle34a.setVisible(false);
panelConvert1a.setVisible(false);
panelConvert2a.setVisible(false);
panelConvert3a.setVisible(false);
panelConvert4a.setVisible(false);
panelConvert5a.setVisible(false);
panelConvert6a.setVisible(false);
panelConvert7a.setVisible(false);
panelConvert8a.setVisible(false);
panelConvert9a.setVisible(false);
panelConvert10a.setVisible(false);
panelConvert11a.setVisible(false);
panelConvert12a.setVisible(false);
panelConvert13a.setVisible(false);
panelConvert14a.setVisible(false);
panelSquare1a.setVisible(false);
panelSquare2a.setVisible(false);
panelSquare3a.setVisible(false);
panelSquare4a.setVisible(false);
panelSquare5a.setVisible(false);
panelSquare6a.setVisible(false);
panelSquare7a.setVisible(false);
panelSquare9a.setVisible(false);
panelSquare11a.setVisible(false);
panelConvert1d.setVisible(false);
panelConvert2d.setVisible(false);
panelConvert3d.setVisible(false);
panelConvert4d.setVisible(false);
panelConvert5d.setVisible(false);
panelConvert6d.setVisible(false);
panelConvert7d.setVisible(false);
panelConvert9d.setVisible(false);
panelConvert11d.setVisible(false);
panelConvert1b.setVisible(false);
panelConvert2b.setVisible(false);
panelConvert3b.setVisible(false);
panelConvert4b.setVisible(false);
panelConvert5b.setVisible(false);
panelConvert6b.setVisible(false);
panelConvert7b.setVisible(false);
panelConvert8b.setVisible(false);
panelConvert9b.setVisible(false);
panelConvert11b.setVisible(false);
panelConvert12b.setVisible(false);
panelConvert13b.setVisible(false);
panelConvert14b.setVisible(false);
panelConvert1e.setVisible(false);
panelConvert2e.setVisible(false);
panelConvert3e.setVisible(false);
panelConvert4e.setVisible(false);
panelConvert5e.setVisible(false);
panelConvert6e.setVisible(false);
panelConvert7e.setVisible(false);
panelConvert8e.setVisible(false);
panelConvert9e.setVisible(false);
panelConvert10e.setVisible(false);
panelConvert11e.setVisible(false);
panelConvert12e.setVisible(false);
panelConvert13e.setVisible(false);
panelConvert14e.setVisible(false);
panelConvert1c.setVisible(false);
panelConvert2c.setVisible(false);
panelConvert3c.setVisible(false);
panelConvert4c.setVisible(false);
panelConvert5c.setVisible(false);
panelConvert6c.setVisible(false);
panelConvert7c.setVisible(false);
panelConvert8c.setVisible(false);
panelConvert9c.setVisible(false);
panelConvert10c.setVisible(false);
panelConvert11c.setVisible(false);
panelConvert12c.setVisible(false);
panelConvert1g.setVisible(false);
panelConvert2g.setVisible(false);
panelConvert3g.setVisible(false);
panelConvert4g.setVisible(false);
panelConvert5g.setVisible(false);
panelConvert6g.setVisible(false);
panelConvert7g.setVisible(false);
panelConvert8g.setVisible(false);
panelConvert9g.setVisible(false);
panelConvert10g.setVisible(false);
panelConvert1h.setVisible(false);
panelConvert2h.setVisible(false);
panelConvert3h.setVisible(false);
panelConvert4h.setVisible(false);
panelConvert5h.setVisible(false);
panelConvert6h.setVisible(false);
panelConvert7h.setVisible(false);
panelConvert9h.setVisible(false);
panelConvert11h.setVisible(false);
panelConvert13h.setVisible(false);
panelConvert14h.setVisible(false);
panelConvert15h.setVisible(false);
panelConvert16h.setVisible(false);
panelFormat1.setVisible(false);
panelFormat3.setVisible(false);
panelFormat5.setVisible(false);
panelFormat7.setVisible(false);
panelFormat9.setVisible(false);
panelFormat11.setVisible(false);
panelFormat13.setVisible(false);
panelConvert1i.setVisible(false);
panelConvert3i.setVisible(false);
panelConvert4i.setVisible(false);
panelConvert5i.setVisible(false);
panelConvert6i.setVisible(false);
panelConvert7i.setVisible(false);
panelConvert8i.setVisible(false);
panelConvert9i.setVisible(false);
panelConvert10i.setVisible(false);
panelConvert11i.setVisible(false);
panelConvert12i.setVisible(false);
panelConvert13i.setVisible(false);
panelConvert14i.setVisible(false);
panelConvert15i.setVisible(false);
panelConvert1j.setVisible(false);
panelConvert3j.setVisible(false);
panelConvert4j.setVisible(false);
panelConvert5j.setVisible(false);
panelConvert6j.setVisible(false);
panelConvert7j.setVisible(false);
panelConvert8j.setVisible(false);
panelConvert9j.setVisible(false);
panelConvert10j.setVisible(false);
panelConvert11j.setVisible(false);
panelConvert12j.setVisible(false);
panelConvert13j.setVisible(false);
panelConvert1k.setVisible(false);
panelConvert3k.setVisible(false);
panelConvert4k.setVisible(false);
panelConvert5k.setVisible(false);
panelConvert6k.setVisible(false);
panelConvert7k.setVisible(false);
panelConvert8k.setVisible(false);
panelConvert9k.setVisible(false);
panelConvert10k.setVisible(false);
panelConvert11k.setVisible(false);
panelConvert12k.setVisible(false);
panelConvert13k.setVisible(false);
panelConvert14k.setVisible(false);
panelConvert15k.setVisible(false);
panelConvert16k.setVisible(false);
panelConvert17k.setVisible(false);
panelConvert1l.setVisible(false);
panelConvert2l.setVisible(false);
panelConvert3l.setVisible(false);
panelConvert4l.setVisible(false);
panelConvert5l.setVisible(false);
panelConvert6l.setVisible(false);
panelConvert7l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert9l.setVisible(false);;
panelConvert11l.setVisible(false);
panelConvert12l.setVisible(false);
panelConvert13l.setVisible(false);
panelConvert14l.setVisible(false);
panelCircle1b.setVisible(false);
panelCircle2b.setVisible(false);
panelCircle3b.setVisible(false);
panelCircle4b.setVisible(false);
panelCircle5b.setVisible(false);
panelCircle6b.setVisible(false);
panelCircle7b.setVisible(false);
panelCircle8b.setVisible(false);
panelCircle9b.setVisible(false);
panelCircle10b.setVisible(false);
panelCircle11b.setVisible(false);
panelCircle12b.setVisible(false);
panelCube1a.setVisible(false);
panelCube2a.setVisible(false);
panelCube3a.setVisible(false);
panelCube4a.setVisible(false);
panelCube5a.setVisible(false);
panelCube6a.setVisible(false);
panelCube7a.setVisible(false);
panelCube8a.setVisible(false);
panelCube9a.setVisible(false);
panelCube10a.setVisible(false);
panelCube11a.setVisible(false);
panelCube12a.setVisible(false);
panelSphere1a.setVisible(false);
panelSphere2a.setVisible(false);
panelSphere3a.setVisible(false);
panelSphere4a.setVisible(false);
panelSphere5a.setVisible(false);
panelSphere6a.setVisible(false);
panelSphere7a.setVisible(false);
panelSphere8a.setVisible(false);
panelSphere9a.setVisible(false);
panelSphere10a.setVisible(false);
panelSphere11a.setVisible(false);
panelSphere12a.setVisible(false);
}

//$$$$$$$$$$$$$$$$ Choose convert -> acceleration $$$$$$$$$$$$$$$$
if (e.getSource() == chooseConvertAcceleration) {
iconPanel.setBounds(250, 250, 250, 250);
frame.setSize(800, 535);
notePanel1.setBounds(500, 0, 310, 500);
notePanel2.setBounds(500, 0, 310, 500);
notePanel3.setBounds(500, 0, 310, 500);
notePanel4.setBounds(500, 0, 310, 500);
notePanel5.setBounds(500, 0, 310, 500);
iconLabel.setIcon(acceleration);
//Vis on

panelConvert1g.setVisible(true);
panelConvert2g.setVisible(true);
panelConvert3g.setVisible(true);
panelConvert4g.setVisible(true);
panelConvert5g.setVisible(true);
panelConvert6g.setVisible(true);
panelConvert7g.setVisible(true);
panelConvert8g.setVisible(true);
panelConvert9g.setVisible(true);
panelConvert10g.setVisible(true);

//Vis off
panelTriangle1a.setVisible(false);
panelTriangle2a.setVisible(false);
panelTriangle3a.setVisible(false);
panelTriangle4a.setVisible(false);
panelTriangle5a.setVisible(false);
panelTriangle6a.setVisible(false);
panelTriangle7a.setVisible(false);
panelTriangle8a.setVisible(false);
panelTriangle9a.setVisible(false);
panelTriangle10a.setVisible(false);
panelTriangle11a.setVisible(false);
panelTriangle12a.setVisible(false);
panelTriangle13a.setVisible(false);
panelTriangle14a.setVisible(false);
panelTriangle15a.setVisible(false);
panelTriangle16a.setVisible(false);
panelTriangle17a.setVisible(false);
panelTriangle18a.setVisible(false);
panelTriangle19a.setVisible(false);
panelTriangle20a.setVisible(false);
panelTriangle21a.setVisible(false);
panelTriangle22a.setVisible(false);
panelTriangle23a.setVisible(false);
panelTriangle24a.setVisible(false);
panelTriangle25a.setVisible(false);
panelTriangle26a.setVisible(false);
panelTriangle27a.setVisible(false);
panelTriangle28a.setVisible(false);
panelTriangle31a.setVisible(false);
panelTriangle34a.setVisible(false);
panelConvert1a.setVisible(false);
panelConvert2a.setVisible(false);
panelConvert3a.setVisible(false);
panelConvert4a.setVisible(false);
panelConvert5a.setVisible(false);
panelConvert6a.setVisible(false);
panelConvert7a.setVisible(false);
panelConvert8a.setVisible(false);
panelConvert9a.setVisible(false);
panelConvert10a.setVisible(false);
panelConvert11a.setVisible(false);
panelConvert12a.setVisible(false);
panelConvert13a.setVisible(false);
panelConvert14a.setVisible(false);
panelSquare1a.setVisible(false);
panelSquare2a.setVisible(false);
panelSquare3a.setVisible(false);
panelSquare4a.setVisible(false);
panelSquare5a.setVisible(false);
panelSquare6a.setVisible(false);
panelSquare7a.setVisible(false);
panelSquare9a.setVisible(false);
panelSquare11a.setVisible(false);
panelConvert1d.setVisible(false);
panelConvert2d.setVisible(false);
panelConvert3d.setVisible(false);
panelConvert4d.setVisible(false);
panelConvert5d.setVisible(false);
panelConvert6d.setVisible(false);
panelConvert7d.setVisible(false);
panelConvert9d.setVisible(false);
panelConvert11d.setVisible(false);
panelConvert1b.setVisible(false);
panelConvert2b.setVisible(false);
panelConvert3b.setVisible(false);
panelConvert4b.setVisible(false);
panelConvert5b.setVisible(false);
panelConvert6b.setVisible(false);
panelConvert7b.setVisible(false);
panelConvert8b.setVisible(false);
panelConvert9b.setVisible(false);
panelConvert11b.setVisible(false);
panelConvert12b.setVisible(false);
panelConvert13b.setVisible(false);
panelConvert14b.setVisible(false);
panelConvert1e.setVisible(false);
panelConvert2e.setVisible(false);
panelConvert3e.setVisible(false);
panelConvert4e.setVisible(false);
panelConvert5e.setVisible(false);
panelConvert6e.setVisible(false);
panelConvert7e.setVisible(false);
panelConvert8e.setVisible(false);
panelConvert9e.setVisible(false);
panelConvert10e.setVisible(false);
panelConvert11e.setVisible(false);
panelConvert12e.setVisible(false);
panelConvert13e.setVisible(false);
panelConvert14e.setVisible(false);
panelConvert1c.setVisible(false);
panelConvert2c.setVisible(false);
panelConvert3c.setVisible(false);
panelConvert4c.setVisible(false);
panelConvert5c.setVisible(false);
panelConvert6c.setVisible(false);
panelConvert7c.setVisible(false);
panelConvert8c.setVisible(false);
panelConvert9c.setVisible(false);
panelConvert10c.setVisible(false);
panelConvert11c.setVisible(false);
panelConvert12c.setVisible(false);
panelConvert1f.setVisible(false);
panelConvert2f.setVisible(false);
panelConvert3f.setVisible(false);
panelConvert4f.setVisible(false);
panelConvert5f.setVisible(false);
panelConvert6f.setVisible(false);
panelConvert7f.setVisible(false);
panelConvert8f.setVisible(false);
panelConvert9f.setVisible(false);
panelConvert10f.setVisible(false);
panelConvert11f.setVisible(false);
panelConvert12f.setVisible(false);
panelConvert1h.setVisible(false);
panelConvert2h.setVisible(false);
panelConvert3h.setVisible(false);
panelConvert4h.setVisible(false);
panelConvert5h.setVisible(false);
panelConvert6h.setVisible(false);
panelConvert7h.setVisible(false);
panelConvert9h.setVisible(false);
panelConvert11h.setVisible(false);
panelConvert13h.setVisible(false);
panelConvert14h.setVisible(false);
panelConvert15h.setVisible(false);
panelConvert16h.setVisible(false);
panelFormat1.setVisible(false);
panelFormat3.setVisible(false);
panelFormat5.setVisible(false);
panelFormat7.setVisible(false);
panelFormat9.setVisible(false);
panelFormat11.setVisible(false);
panelFormat13.setVisible(false);
panelConvert1i.setVisible(false);
panelConvert3i.setVisible(false);
panelConvert4i.setVisible(false);
panelConvert5i.setVisible(false);
panelConvert6i.setVisible(false);
panelConvert7i.setVisible(false);
panelConvert8i.setVisible(false);
panelConvert9i.setVisible(false);
panelConvert10i.setVisible(false);
panelConvert11i.setVisible(false);
panelConvert12i.setVisible(false);
panelConvert13i.setVisible(false);
panelConvert14i.setVisible(false);
panelConvert15i.setVisible(false);
panelConvert1j.setVisible(false);
panelConvert3j.setVisible(false);
panelConvert4j.setVisible(false);
panelConvert5j.setVisible(false);
panelConvert6j.setVisible(false);
panelConvert7j.setVisible(false);
panelConvert8j.setVisible(false);
panelConvert9j.setVisible(false);
panelConvert10j.setVisible(false);
panelConvert11j.setVisible(false);
panelConvert12j.setVisible(false);
panelConvert13j.setVisible(false);
panelConvert1k.setVisible(false);
panelConvert3k.setVisible(false);
panelConvert4k.setVisible(false);
panelConvert5k.setVisible(false);
panelConvert6k.setVisible(false);
panelConvert7k.setVisible(false);
panelConvert8k.setVisible(false);
panelConvert9k.setVisible(false);
panelConvert10k.setVisible(false);
panelConvert11k.setVisible(false);
panelConvert12k.setVisible(false);
panelConvert13k.setVisible(false);
panelConvert14k.setVisible(false);
panelConvert15k.setVisible(false);
panelConvert16k.setVisible(false);
panelConvert17k.setVisible(false);
panelConvert1l.setVisible(false);
panelConvert2l.setVisible(false);
panelConvert3l.setVisible(false);
panelConvert4l.setVisible(false);
panelConvert5l.setVisible(false);
panelConvert6l.setVisible(false);
panelConvert7l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert9l.setVisible(false);;
panelConvert11l.setVisible(false);
panelConvert12l.setVisible(false);
panelConvert13l.setVisible(false);
panelConvert14l.setVisible(false);
panelCircle1b.setVisible(false);
panelCircle2b.setVisible(false);
panelCircle3b.setVisible(false);
panelCircle4b.setVisible(false);
panelCircle5b.setVisible(false);
panelCircle6b.setVisible(false);
panelCircle7b.setVisible(false);
panelCircle8b.setVisible(false);
panelCircle9b.setVisible(false);
panelCircle10b.setVisible(false);
panelCircle11b.setVisible(false);
panelCircle12b.setVisible(false);
panelCube1a.setVisible(false);
panelCube2a.setVisible(false);
panelCube3a.setVisible(false);
panelCube4a.setVisible(false);
panelCube5a.setVisible(false);
panelCube6a.setVisible(false);
panelCube7a.setVisible(false);
panelCube8a.setVisible(false);
panelCube9a.setVisible(false);
panelCube10a.setVisible(false);
panelCube11a.setVisible(false);
panelCube12a.setVisible(false);
panelSphere1a.setVisible(false);
panelSphere2a.setVisible(false);
panelSphere3a.setVisible(false);
panelSphere4a.setVisible(false);
panelSphere5a.setVisible(false);
panelSphere6a.setVisible(false);
panelSphere7a.setVisible(false);
panelSphere8a.setVisible(false);
panelSphere9a.setVisible(false);
panelSphere10a.setVisible(false);
panelSphere11a.setVisible(false);
panelSphere12a.setVisible(false);
}

//$$$$$$$$$$$$$$$$ Choose convert -> area $$$$$$$$$$$$$$$$
if (e.getSource() == chooseConvertDensity) {
iconPanel.setBounds(250, 250, 250, 250);
frame.setSize(800, 535);
notePanel1.setBounds(500, 0, 310, 500);
notePanel2.setBounds(500, 0, 310, 500);
notePanel3.setBounds(500, 0, 310, 500);
notePanel4.setBounds(500, 0, 310, 500);
notePanel5.setBounds(500, 0, 310, 500);
iconLabel.setIcon(density);
//Vis on
panelConvert1h.setVisible(true);
panelConvert2h.setVisible(true);
panelConvert3h.setVisible(true);
panelConvert4h.setVisible(true);
panelConvert5h.setVisible(true);
panelConvert6h.setVisible(true);
panelConvert7h.setVisible(true);
panelConvert9h.setVisible(true);
panelConvert11h.setVisible(true);
panelConvert13h.setVisible(true);
panelConvert14h.setVisible(true);
panelConvert15h.setVisible(true);
panelConvert16h.setVisible(true);

//Vis off
panelTriangle1a.setVisible(false);
panelTriangle2a.setVisible(false);
panelTriangle3a.setVisible(false);
panelTriangle4a.setVisible(false);
panelTriangle5a.setVisible(false);
panelTriangle6a.setVisible(false);
panelTriangle7a.setVisible(false);
panelTriangle8a.setVisible(false);
panelTriangle9a.setVisible(false);
panelTriangle10a.setVisible(false);
panelTriangle11a.setVisible(false);
panelTriangle12a.setVisible(false);
panelTriangle13a.setVisible(false);
panelTriangle14a.setVisible(false);
panelTriangle15a.setVisible(false);
panelTriangle16a.setVisible(false);
panelTriangle17a.setVisible(false);
panelTriangle18a.setVisible(false);
panelTriangle19a.setVisible(false);
panelTriangle20a.setVisible(false);
panelTriangle21a.setVisible(false);
panelTriangle22a.setVisible(false);
panelTriangle23a.setVisible(false);
panelTriangle24a.setVisible(false);
panelTriangle25a.setVisible(false);
panelTriangle26a.setVisible(false);
panelTriangle27a.setVisible(false);
panelTriangle28a.setVisible(false);
panelTriangle31a.setVisible(false);
panelTriangle34a.setVisible(false);
panelConvert1a.setVisible(false);
panelConvert2a.setVisible(false);
panelConvert3a.setVisible(false);
panelConvert4a.setVisible(false);
panelConvert5a.setVisible(false);
panelConvert6a.setVisible(false);
panelConvert7a.setVisible(false);
panelConvert8a.setVisible(false);
panelConvert9a.setVisible(false);
panelConvert10a.setVisible(false);
panelConvert11a.setVisible(false);
panelConvert12a.setVisible(false);
panelConvert13a.setVisible(false);
panelConvert14a.setVisible(false);
panelSquare1a.setVisible(false);
panelSquare2a.setVisible(false);
panelSquare3a.setVisible(false);
panelSquare4a.setVisible(false);
panelSquare5a.setVisible(false);
panelSquare6a.setVisible(false);
panelSquare7a.setVisible(false);
panelSquare9a.setVisible(false);
panelSquare11a.setVisible(false);
panelConvert1d.setVisible(false);
panelConvert2d.setVisible(false);
panelConvert3d.setVisible(false);
panelConvert4d.setVisible(false);
panelConvert5d.setVisible(false);
panelConvert6d.setVisible(false);
panelConvert7d.setVisible(false);
panelConvert9d.setVisible(false);
panelConvert11d.setVisible(false);
panelConvert1b.setVisible(false);
panelConvert2b.setVisible(false);
panelConvert3b.setVisible(false);
panelConvert4b.setVisible(false);
panelConvert5b.setVisible(false);
panelConvert6b.setVisible(false);
panelConvert7b.setVisible(false);
panelConvert8b.setVisible(false);
panelConvert9b.setVisible(false);
panelConvert11b.setVisible(false);
panelConvert12b.setVisible(false);
panelConvert13b.setVisible(false);
panelConvert14b.setVisible(false);
panelConvert1e.setVisible(false);
panelConvert2e.setVisible(false);
panelConvert3e.setVisible(false);
panelConvert4e.setVisible(false);
panelConvert5e.setVisible(false);
panelConvert6e.setVisible(false);
panelConvert7e.setVisible(false);
panelConvert8e.setVisible(false);
panelConvert9e.setVisible(false);
panelConvert10e.setVisible(false);
panelConvert11e.setVisible(false);
panelConvert12e.setVisible(false);
panelConvert13e.setVisible(false);
panelConvert14e.setVisible(false);
panelConvert1f.setVisible(false);
panelConvert2f.setVisible(false);
panelConvert3f.setVisible(false);
panelConvert4f.setVisible(false);
panelConvert5f.setVisible(false);
panelConvert6f.setVisible(false);
panelConvert7f.setVisible(false);
panelConvert8f.setVisible(false);
panelConvert9f.setVisible(false);
panelConvert10f.setVisible(false);
panelConvert11f.setVisible(false);
panelConvert12f.setVisible(false);
panelConvert1g.setVisible(false);
panelConvert2g.setVisible(false);
panelConvert3g.setVisible(false);
panelConvert4g.setVisible(false);
panelConvert5g.setVisible(false);
panelConvert6g.setVisible(false);
panelConvert7g.setVisible(false);
panelConvert8g.setVisible(false);
panelConvert9g.setVisible(false);
panelConvert10g.setVisible(false);
panelConvert1c.setVisible(false);
panelConvert2c.setVisible(false);
panelConvert3c.setVisible(false);
panelConvert4c.setVisible(false);
panelConvert5c.setVisible(false);
panelConvert6c.setVisible(false);
panelConvert7c.setVisible(false);
panelConvert8c.setVisible(false);
panelConvert9c.setVisible(false);
panelConvert10c.setVisible(false);
panelConvert11c.setVisible(false);
panelConvert12c.setVisible(false);
panelFormat1.setVisible(false);
panelFormat3.setVisible(false);
panelFormat5.setVisible(false);
panelFormat7.setVisible(false);
panelFormat9.setVisible(false);
panelFormat11.setVisible(false);
panelFormat13.setVisible(false);
panelConvert1i.setVisible(false);
panelConvert3i.setVisible(false);
panelConvert4i.setVisible(false);
panelConvert5i.setVisible(false);
panelConvert6i.setVisible(false);
panelConvert7i.setVisible(false);
panelConvert8i.setVisible(false);
panelConvert9i.setVisible(false);
panelConvert10i.setVisible(false);
panelConvert11i.setVisible(false);
panelConvert12i.setVisible(false);
panelConvert13i.setVisible(false);
panelConvert14i.setVisible(false);
panelConvert15i.setVisible(false);
panelConvert1j.setVisible(false);
panelConvert3j.setVisible(false);
panelConvert4j.setVisible(false);
panelConvert5j.setVisible(false);
panelConvert6j.setVisible(false);
panelConvert7j.setVisible(false);
panelConvert8j.setVisible(false);
panelConvert9j.setVisible(false);
panelConvert10j.setVisible(false);
panelConvert11j.setVisible(false);
panelConvert12j.setVisible(false);
panelConvert13j.setVisible(false);
panelConvert1k.setVisible(false);
panelConvert3k.setVisible(false);
panelConvert4k.setVisible(false);
panelConvert5k.setVisible(false);
panelConvert6k.setVisible(false);
panelConvert7k.setVisible(false);
panelConvert8k.setVisible(false);
panelConvert9k.setVisible(false);
panelConvert10k.setVisible(false);
panelConvert11k.setVisible(false);
panelConvert12k.setVisible(false);
panelConvert13k.setVisible(false);
panelConvert14k.setVisible(false);
panelConvert15k.setVisible(false);
panelConvert16k.setVisible(false);
panelConvert17k.setVisible(false);
panelConvert1l.setVisible(false);
panelConvert2l.setVisible(false);
panelConvert3l.setVisible(false);
panelConvert4l.setVisible(false);
panelConvert5l.setVisible(false);
panelConvert6l.setVisible(false);
panelConvert7l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert9l.setVisible(false);;
panelConvert11l.setVisible(false);
panelConvert12l.setVisible(false);
panelConvert13l.setVisible(false);
panelConvert14l.setVisible(false);
panelCircle1b.setVisible(false);
panelCircle2b.setVisible(false);
panelCircle3b.setVisible(false);
panelCircle4b.setVisible(false);
panelCircle5b.setVisible(false);
panelCircle6b.setVisible(false);
panelCircle7b.setVisible(false);
panelCircle8b.setVisible(false);
panelCircle9b.setVisible(false);
panelCircle10b.setVisible(false);
panelCircle11b.setVisible(false);
panelCircle12b.setVisible(false);
panelCube1a.setVisible(false);
panelCube2a.setVisible(false);
panelCube3a.setVisible(false);
panelCube4a.setVisible(false);
panelCube5a.setVisible(false);
panelCube6a.setVisible(false);
panelCube7a.setVisible(false);
panelCube8a.setVisible(false);
panelCube9a.setVisible(false);
panelCube10a.setVisible(false);
panelCube11a.setVisible(false);
panelCube12a.setVisible(false);
panelSphere1a.setVisible(false);
panelSphere2a.setVisible(false);
panelSphere3a.setVisible(false);
panelSphere4a.setVisible(false);
panelSphere5a.setVisible(false);
panelSphere6a.setVisible(false);
panelSphere7a.setVisible(false);
panelSphere8a.setVisible(false);
panelSphere9a.setVisible(false);
panelSphere10a.setVisible(false);
panelSphere11a.setVisible(false);
panelSphere12a.setVisible(false);
}

//$$$$$$$$$$$$$$$$ Choose convert -> angle $$$$$$$$$$$$$$$$
if (e.getSource() == chooseConvertAngle) {
iconPanel.setBounds(250, 250, 250, 250);
frame.setSize(800, 535);
notePanel1.setBounds(500, 0, 310, 500);
notePanel2.setBounds(500, 0, 310, 500);
notePanel3.setBounds(500, 0, 310, 500);
notePanel4.setBounds(500, 0, 310, 500);
notePanel5.setBounds(500, 0, 310, 500);
iconLabel.setIcon(angle);
//Vis on
panelConvert1i.setVisible(true);
panelConvert3i.setVisible(true);
panelConvert4i.setVisible(true);
panelConvert5i.setVisible(true);
panelConvert6i.setVisible(true);
panelConvert7i.setVisible(true);
panelConvert8i.setVisible(true);
panelConvert9i.setVisible(true);
panelConvert10i.setVisible(true);
panelConvert11i.setVisible(true);
panelConvert12i.setVisible(true);
panelConvert13i.setVisible(true);
panelConvert14i.setVisible(true);
panelConvert15i.setVisible(true);

//Vis off
panelTriangle1a.setVisible(false);
panelTriangle2a.setVisible(false);
panelTriangle3a.setVisible(false);
panelTriangle4a.setVisible(false);
panelTriangle5a.setVisible(false);
panelTriangle6a.setVisible(false);
panelTriangle7a.setVisible(false);
panelTriangle8a.setVisible(false);
panelTriangle9a.setVisible(false);
panelTriangle10a.setVisible(false);
panelTriangle11a.setVisible(false);
panelTriangle12a.setVisible(false);
panelTriangle13a.setVisible(false);
panelTriangle14a.setVisible(false);
panelTriangle15a.setVisible(false);
panelTriangle16a.setVisible(false);
panelTriangle17a.setVisible(false);
panelTriangle18a.setVisible(false);
panelTriangle19a.setVisible(false);
panelTriangle20a.setVisible(false);
panelTriangle21a.setVisible(false);
panelTriangle22a.setVisible(false);
panelTriangle23a.setVisible(false);
panelTriangle24a.setVisible(false);
panelTriangle25a.setVisible(false);
panelTriangle26a.setVisible(false);
panelTriangle27a.setVisible(false);
panelTriangle28a.setVisible(false);
panelTriangle31a.setVisible(false);
panelTriangle34a.setVisible(false);
panelConvert1a.setVisible(false);
panelConvert2a.setVisible(false);
panelConvert3a.setVisible(false);
panelConvert4a.setVisible(false);
panelConvert5a.setVisible(false);
panelConvert6a.setVisible(false);
panelConvert7a.setVisible(false);
panelConvert8a.setVisible(false);
panelConvert9a.setVisible(false);
panelConvert10a.setVisible(false);
panelConvert11a.setVisible(false);
panelConvert12a.setVisible(false);
panelConvert13a.setVisible(false);
panelConvert14a.setVisible(false);
panelSquare1a.setVisible(false);
panelSquare2a.setVisible(false);
panelSquare3a.setVisible(false);
panelSquare4a.setVisible(false);
panelSquare5a.setVisible(false);
panelSquare6a.setVisible(false);
panelSquare7a.setVisible(false);
panelSquare9a.setVisible(false);
panelSquare11a.setVisible(false);
panelConvert1d.setVisible(false);
panelConvert2d.setVisible(false);
panelConvert3d.setVisible(false);
panelConvert4d.setVisible(false);
panelConvert5d.setVisible(false);
panelConvert6d.setVisible(false);
panelConvert7d.setVisible(false);
panelConvert9d.setVisible(false);
panelConvert11d.setVisible(false);
panelConvert1b.setVisible(false);
panelConvert2b.setVisible(false);
panelConvert3b.setVisible(false);
panelConvert4b.setVisible(false);
panelConvert5b.setVisible(false);
panelConvert6b.setVisible(false);
panelConvert7b.setVisible(false);
panelConvert8b.setVisible(false);
panelConvert9b.setVisible(false);
panelConvert11b.setVisible(false);
panelConvert12b.setVisible(false);
panelConvert13b.setVisible(false);
panelConvert14b.setVisible(false);
panelConvert1e.setVisible(false);
panelConvert2e.setVisible(false);
panelConvert3e.setVisible(false);
panelConvert4e.setVisible(false);
panelConvert5e.setVisible(false);
panelConvert6e.setVisible(false);
panelConvert7e.setVisible(false);
panelConvert8e.setVisible(false);
panelConvert9e.setVisible(false);
panelConvert10e.setVisible(false);
panelConvert11e.setVisible(false);
panelConvert12e.setVisible(false);
panelConvert13e.setVisible(false);
panelConvert14e.setVisible(false);
panelConvert1f.setVisible(false);
panelConvert2f.setVisible(false);
panelConvert3f.setVisible(false);
panelConvert4f.setVisible(false);
panelConvert5f.setVisible(false);
panelConvert6f.setVisible(false);
panelConvert7f.setVisible(false);
panelConvert8f.setVisible(false);
panelConvert9f.setVisible(false);
panelConvert10f.setVisible(false);
panelConvert11f.setVisible(false);
panelConvert12f.setVisible(false);
panelConvert1g.setVisible(false);
panelConvert2g.setVisible(false);
panelConvert3g.setVisible(false);
panelConvert4g.setVisible(false);
panelConvert5g.setVisible(false);
panelConvert6g.setVisible(false);
panelConvert7g.setVisible(false);
panelConvert8g.setVisible(false);
panelConvert9g.setVisible(false);
panelConvert10g.setVisible(false);
panelConvert1c.setVisible(false);
panelConvert2c.setVisible(false);
panelConvert3c.setVisible(false);
panelConvert4c.setVisible(false);
panelConvert5c.setVisible(false);
panelConvert6c.setVisible(false);
panelConvert7c.setVisible(false);
panelConvert8c.setVisible(false);
panelConvert9c.setVisible(false);
panelConvert10c.setVisible(false);
panelConvert11c.setVisible(false);
panelConvert12c.setVisible(false);
panelFormat1.setVisible(false);
panelFormat3.setVisible(false);
panelFormat5.setVisible(false);
panelFormat7.setVisible(false);
panelFormat9.setVisible(false);
panelFormat11.setVisible(false);
panelFormat13.setVisible(false);
panelConvert1h.setVisible(false);
panelConvert2h.setVisible(false);
panelConvert3h.setVisible(false);
panelConvert4h.setVisible(false);
panelConvert5h.setVisible(false);
panelConvert6h.setVisible(false);
panelConvert7h.setVisible(false);
panelConvert9h.setVisible(false);
panelConvert11h.setVisible(false);
panelConvert13h.setVisible(false);
panelConvert14h.setVisible(false);
panelConvert15h.setVisible(false);
panelConvert16h.setVisible(false);
panelConvert1j.setVisible(false);
panelConvert3j.setVisible(false);
panelConvert4j.setVisible(false);
panelConvert5j.setVisible(false);
panelConvert6j.setVisible(false);
panelConvert7j.setVisible(false);
panelConvert8j.setVisible(false);
panelConvert9j.setVisible(false);
panelConvert10j.setVisible(false);
panelConvert11j.setVisible(false);
panelConvert12j.setVisible(false);
panelConvert13j.setVisible(false);
panelConvert1k.setVisible(false);
panelConvert3k.setVisible(false);
panelConvert4k.setVisible(false);
panelConvert5k.setVisible(false);
panelConvert6k.setVisible(false);
panelConvert7k.setVisible(false);
panelConvert8k.setVisible(false);
panelConvert9k.setVisible(false);
panelConvert10k.setVisible(false);
panelConvert11k.setVisible(false);
panelConvert12k.setVisible(false);
panelConvert13k.setVisible(false);
panelConvert14k.setVisible(false);
panelConvert15k.setVisible(false);
panelConvert16k.setVisible(false);
panelConvert17k.setVisible(false);
panelConvert1l.setVisible(false);
panelConvert2l.setVisible(false);
panelConvert3l.setVisible(false);
panelConvert4l.setVisible(false);
panelConvert5l.setVisible(false);
panelConvert6l.setVisible(false);
panelConvert7l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert9l.setVisible(false);;
panelConvert11l.setVisible(false);
panelConvert12l.setVisible(false);
panelConvert13l.setVisible(false);
panelConvert14l.setVisible(false);
panelCircle1b.setVisible(false);
panelCircle2b.setVisible(false);
panelCircle3b.setVisible(false);
panelCircle4b.setVisible(false);
panelCircle5b.setVisible(false);
panelCircle6b.setVisible(false);
panelCircle7b.setVisible(false);
panelCircle8b.setVisible(false);
panelCircle9b.setVisible(false);
panelCircle10b.setVisible(false);
panelCircle11b.setVisible(false);
panelCircle12b.setVisible(false);
panelCube1a.setVisible(false);
panelCube2a.setVisible(false);
panelCube3a.setVisible(false);
panelCube4a.setVisible(false);
panelCube5a.setVisible(false);
panelCube6a.setVisible(false);
panelCube7a.setVisible(false);
panelCube8a.setVisible(false);
panelCube9a.setVisible(false);
panelCube10a.setVisible(false);
panelCube11a.setVisible(false);
panelCube12a.setVisible(false);
panelSphere1a.setVisible(false);
panelSphere2a.setVisible(false);
panelSphere3a.setVisible(false);
panelSphere4a.setVisible(false);
panelSphere5a.setVisible(false);
panelSphere6a.setVisible(false);
panelSphere7a.setVisible(false);
panelSphere8a.setVisible(false);
panelSphere9a.setVisible(false);
panelSphere10a.setVisible(false);
panelSphere11a.setVisible(false);
panelSphere12a.setVisible(false);
}


//$$$$$$$$$$$$$$$$ Choose convert -> number $$$$$$$$$$$$$$$$
if (e.getSource() == chooseConvertNumber) {
iconPanel.setBounds(250, 250, 250, 250);
frame.setSize(800, 535);
notePanel1.setBounds(500, 0, 310, 500);
notePanel2.setBounds(500, 0, 310, 500);
notePanel3.setBounds(500, 0, 310, 500);
notePanel4.setBounds(500, 0, 310, 500);
notePanel5.setBounds(500, 0, 310, 500);
iconLabel.setIcon(number);
//Vis on
panelConvert1j.setVisible(true);
panelConvert3j.setVisible(true);
panelConvert4j.setVisible(true);
panelConvert5j.setVisible(true);
panelConvert6j.setVisible(true);
panelConvert7j.setVisible(true);
panelConvert8j.setVisible(true);
panelConvert9j.setVisible(true);
panelConvert10j.setVisible(true);
panelConvert11j.setVisible(true);
panelConvert12j.setVisible(true);
panelConvert13j.setVisible(true);

//Vis off
panelTriangle1a.setVisible(false);
panelTriangle2a.setVisible(false);
panelTriangle3a.setVisible(false);
panelTriangle4a.setVisible(false);
panelTriangle5a.setVisible(false);
panelTriangle6a.setVisible(false);
panelTriangle7a.setVisible(false);
panelTriangle8a.setVisible(false);
panelTriangle9a.setVisible(false);
panelTriangle10a.setVisible(false);
panelTriangle11a.setVisible(false);
panelTriangle12a.setVisible(false);
panelTriangle13a.setVisible(false);
panelTriangle14a.setVisible(false);
panelTriangle15a.setVisible(false);
panelTriangle16a.setVisible(false);
panelTriangle17a.setVisible(false);
panelTriangle18a.setVisible(false);
panelTriangle19a.setVisible(false);
panelTriangle20a.setVisible(false);
panelTriangle21a.setVisible(false);
panelTriangle22a.setVisible(false);
panelTriangle23a.setVisible(false);
panelTriangle24a.setVisible(false);
panelTriangle25a.setVisible(false);
panelTriangle26a.setVisible(false);
panelTriangle27a.setVisible(false);
panelTriangle28a.setVisible(false);
panelTriangle31a.setVisible(false);
panelTriangle34a.setVisible(false);
panelConvert1a.setVisible(false);
panelConvert2a.setVisible(false);
panelConvert3a.setVisible(false);
panelConvert4a.setVisible(false);
panelConvert5a.setVisible(false);
panelConvert6a.setVisible(false);
panelConvert7a.setVisible(false);
panelConvert8a.setVisible(false);
panelConvert9a.setVisible(false);
panelConvert10a.setVisible(false);
panelConvert11a.setVisible(false);
panelConvert12a.setVisible(false);
panelConvert13a.setVisible(false);
panelConvert14a.setVisible(false);
panelSquare1a.setVisible(false);
panelSquare2a.setVisible(false);
panelSquare3a.setVisible(false);
panelSquare4a.setVisible(false);
panelSquare5a.setVisible(false);
panelSquare6a.setVisible(false);
panelSquare7a.setVisible(false);
panelSquare9a.setVisible(false);
panelSquare11a.setVisible(false);
panelConvert1d.setVisible(false);
panelConvert2d.setVisible(false);
panelConvert3d.setVisible(false);
panelConvert4d.setVisible(false);
panelConvert5d.setVisible(false);
panelConvert6d.setVisible(false);
panelConvert7d.setVisible(false);
panelConvert9d.setVisible(false);
panelConvert11d.setVisible(false);
panelConvert1b.setVisible(false);
panelConvert2b.setVisible(false);
panelConvert3b.setVisible(false);
panelConvert4b.setVisible(false);
panelConvert5b.setVisible(false);
panelConvert6b.setVisible(false);
panelConvert7b.setVisible(false);
panelConvert8b.setVisible(false);
panelConvert9b.setVisible(false);
panelConvert11b.setVisible(false);
panelConvert12b.setVisible(false);
panelConvert13b.setVisible(false);
panelConvert14b.setVisible(false);
panelConvert1e.setVisible(false);
panelConvert2e.setVisible(false);
panelConvert3e.setVisible(false);
panelConvert4e.setVisible(false);
panelConvert5e.setVisible(false);
panelConvert6e.setVisible(false);
panelConvert7e.setVisible(false);
panelConvert8e.setVisible(false);
panelConvert9e.setVisible(false);
panelConvert10e.setVisible(false);
panelConvert11e.setVisible(false);
panelConvert12e.setVisible(false);
panelConvert13e.setVisible(false);
panelConvert14e.setVisible(false);
panelConvert1f.setVisible(false);
panelConvert2f.setVisible(false);
panelConvert3f.setVisible(false);
panelConvert4f.setVisible(false);
panelConvert5f.setVisible(false);
panelConvert6f.setVisible(false);
panelConvert7f.setVisible(false);
panelConvert8f.setVisible(false);
panelConvert9f.setVisible(false);
panelConvert10f.setVisible(false);
panelConvert11f.setVisible(false);
panelConvert12f.setVisible(false);
panelConvert1g.setVisible(false);
panelConvert2g.setVisible(false);
panelConvert3g.setVisible(false);
panelConvert4g.setVisible(false);
panelConvert5g.setVisible(false);
panelConvert6g.setVisible(false);
panelConvert7g.setVisible(false);
panelConvert8g.setVisible(false);
panelConvert9g.setVisible(false);
panelConvert10g.setVisible(false);
panelConvert1c.setVisible(false);
panelConvert2c.setVisible(false);
panelConvert3c.setVisible(false);
panelConvert4c.setVisible(false);
panelConvert5c.setVisible(false);
panelConvert6c.setVisible(false);
panelConvert7c.setVisible(false);
panelConvert8c.setVisible(false);
panelConvert9c.setVisible(false);
panelConvert10c.setVisible(false);
panelConvert11c.setVisible(false);
panelConvert12c.setVisible(false);
panelFormat1.setVisible(false);
panelFormat3.setVisible(false);
panelFormat5.setVisible(false);
panelFormat7.setVisible(false);
panelFormat9.setVisible(false);
panelFormat11.setVisible(false);
panelFormat13.setVisible(false);
panelConvert1h.setVisible(false);
panelConvert2h.setVisible(false);
panelConvert3h.setVisible(false);
panelConvert4h.setVisible(false);
panelConvert5h.setVisible(false);
panelConvert6h.setVisible(false);
panelConvert7h.setVisible(false);
panelConvert9h.setVisible(false);
panelConvert11h.setVisible(false);
panelConvert13h.setVisible(false);
panelConvert14h.setVisible(false);
panelConvert15h.setVisible(false);
panelConvert16h.setVisible(false);
panelConvert1i.setVisible(false);
panelConvert3i.setVisible(false);
panelConvert4i.setVisible(false);
panelConvert5i.setVisible(false);
panelConvert6i.setVisible(false);
panelConvert7i.setVisible(false);
panelConvert8i.setVisible(false);
panelConvert9i.setVisible(false);
panelConvert10i.setVisible(false);
panelConvert11i.setVisible(false);
panelConvert12i.setVisible(false);
panelConvert13i.setVisible(false);
panelConvert14i.setVisible(false);
panelConvert15i.setVisible(false);
panelConvert1k.setVisible(false);
panelConvert3k.setVisible(false);
panelConvert4k.setVisible(false);
panelConvert5k.setVisible(false);
panelConvert6k.setVisible(false);
panelConvert7k.setVisible(false);
panelConvert8k.setVisible(false);
panelConvert9k.setVisible(false);
panelConvert10k.setVisible(false);
panelConvert11k.setVisible(false);
panelConvert12k.setVisible(false);
panelConvert13k.setVisible(false);
panelConvert14k.setVisible(false);
panelConvert15k.setVisible(false);
panelConvert16k.setVisible(false);
panelConvert17k.setVisible(false);
panelConvert1l.setVisible(false);
panelConvert2l.setVisible(false);
panelConvert3l.setVisible(false);
panelConvert4l.setVisible(false);
panelConvert5l.setVisible(false);
panelConvert6l.setVisible(false);
panelConvert7l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert9l.setVisible(false);;
panelConvert11l.setVisible(false);
panelConvert12l.setVisible(false);
panelConvert13l.setVisible(false);
panelConvert14l.setVisible(false);
panelCircle1b.setVisible(false);
panelCircle2b.setVisible(false);
panelCircle3b.setVisible(false);
panelCircle4b.setVisible(false);
panelCircle5b.setVisible(false);
panelCircle6b.setVisible(false);
panelCircle7b.setVisible(false);
panelCircle8b.setVisible(false);
panelCircle9b.setVisible(false);
panelCircle10b.setVisible(false);
panelCircle11b.setVisible(false);
panelCircle12b.setVisible(false);
panelCube1a.setVisible(false);
panelCube2a.setVisible(false);
panelCube3a.setVisible(false);
panelCube4a.setVisible(false);
panelCube5a.setVisible(false);
panelCube6a.setVisible(false);
panelCube7a.setVisible(false);
panelCube8a.setVisible(false);
panelCube9a.setVisible(false);
panelCube10a.setVisible(false);
panelCube11a.setVisible(false);
panelCube12a.setVisible(false);
panelSphere1a.setVisible(false);
panelSphere2a.setVisible(false);
panelSphere3a.setVisible(false);
panelSphere4a.setVisible(false);
panelSphere5a.setVisible(false);
panelSphere6a.setVisible(false);
panelSphere7a.setVisible(false);
panelSphere8a.setVisible(false);
panelSphere9a.setVisible(false);
panelSphere10a.setVisible(false);
panelSphere11a.setVisible(false);
panelSphere12a.setVisible(false);
}



//$$$$$$$$$$$$$$$$ Choose convert -> data $$$$$$$$$$$$$$$$
if (e.getSource() == chooseConvertData) {
iconPanel.setBounds(250, 275, 250, 250);
frame.setSize(800, 535);
notePanel1.setBounds(500, 0, 310, 500);
notePanel2.setBounds(500, 0, 310, 500);
notePanel3.setBounds(500, 0, 310, 500);
notePanel4.setBounds(500, 0, 310, 500);
notePanel5.setBounds(500, 0, 310, 500);
iconLabel.setIcon(data);

//Vis on
panelConvert1k.setVisible(true);
panelConvert3k.setVisible(true);
panelConvert4k.setVisible(true);
panelConvert5k.setVisible(true);
panelConvert6k.setVisible(true);
panelConvert7k.setVisible(true);
panelConvert8k.setVisible(true);
panelConvert9k.setVisible(true);
panelConvert10k.setVisible(true);
panelConvert11k.setVisible(true);
panelConvert12k.setVisible(true);
panelConvert13k.setVisible(true);
panelConvert14k.setVisible(true);
panelConvert15k.setVisible(true);
panelConvert16k.setVisible(true);
panelConvert17k.setVisible(true);


//Vis off
panelTriangle1a.setVisible(false);
panelTriangle2a.setVisible(false);
panelTriangle3a.setVisible(false);
panelTriangle4a.setVisible(false);
panelTriangle5a.setVisible(false);
panelTriangle6a.setVisible(false);
panelTriangle7a.setVisible(false);
panelTriangle8a.setVisible(false);
panelTriangle9a.setVisible(false);
panelTriangle10a.setVisible(false);
panelTriangle11a.setVisible(false);
panelTriangle12a.setVisible(false);
panelTriangle13a.setVisible(false);
panelTriangle14a.setVisible(false);
panelTriangle15a.setVisible(false);
panelTriangle16a.setVisible(false);
panelTriangle17a.setVisible(false);
panelTriangle18a.setVisible(false);
panelTriangle19a.setVisible(false);
panelTriangle20a.setVisible(false);
panelTriangle21a.setVisible(false);
panelTriangle22a.setVisible(false);
panelTriangle23a.setVisible(false);
panelTriangle24a.setVisible(false);
panelTriangle25a.setVisible(false);
panelTriangle26a.setVisible(false);
panelTriangle27a.setVisible(false);
panelTriangle28a.setVisible(false);
panelTriangle31a.setVisible(false);
panelTriangle34a.setVisible(false);
panelConvert1a.setVisible(false);
panelConvert2a.setVisible(false);
panelConvert3a.setVisible(false);
panelConvert4a.setVisible(false);
panelConvert5a.setVisible(false);
panelConvert6a.setVisible(false);
panelConvert7a.setVisible(false);
panelConvert8a.setVisible(false);
panelConvert9a.setVisible(false);
panelConvert10a.setVisible(false);
panelConvert11a.setVisible(false);
panelConvert12a.setVisible(false);
panelConvert13a.setVisible(false);
panelConvert14a.setVisible(false);
panelSquare1a.setVisible(false);
panelSquare2a.setVisible(false);
panelSquare3a.setVisible(false);
panelSquare4a.setVisible(false);
panelSquare5a.setVisible(false);
panelSquare6a.setVisible(false);
panelSquare7a.setVisible(false);
panelSquare9a.setVisible(false);
panelSquare11a.setVisible(false);
panelConvert1d.setVisible(false);
panelConvert2d.setVisible(false);
panelConvert3d.setVisible(false);
panelConvert4d.setVisible(false);
panelConvert5d.setVisible(false);
panelConvert6d.setVisible(false);
panelConvert7d.setVisible(false);
panelConvert9d.setVisible(false);
panelConvert11d.setVisible(false);
panelConvert1b.setVisible(false);
panelConvert2b.setVisible(false);
panelConvert3b.setVisible(false);
panelConvert4b.setVisible(false);
panelConvert5b.setVisible(false);
panelConvert6b.setVisible(false);
panelConvert7b.setVisible(false);
panelConvert8b.setVisible(false);
panelConvert9b.setVisible(false);
panelConvert11b.setVisible(false);
panelConvert12b.setVisible(false);
panelConvert13b.setVisible(false);
panelConvert14b.setVisible(false);
panelConvert1e.setVisible(false);
panelConvert2e.setVisible(false);
panelConvert3e.setVisible(false);
panelConvert4e.setVisible(false);
panelConvert5e.setVisible(false);
panelConvert6e.setVisible(false);
panelConvert7e.setVisible(false);
panelConvert8e.setVisible(false);
panelConvert9e.setVisible(false);
panelConvert10e.setVisible(false);
panelConvert11e.setVisible(false);
panelConvert12e.setVisible(false);
panelConvert13e.setVisible(false);
panelConvert14e.setVisible(false);
panelConvert1f.setVisible(false);
panelConvert2f.setVisible(false);
panelConvert3f.setVisible(false);
panelConvert4f.setVisible(false);
panelConvert5f.setVisible(false);
panelConvert6f.setVisible(false);
panelConvert7f.setVisible(false);
panelConvert8f.setVisible(false);
panelConvert9f.setVisible(false);
panelConvert10f.setVisible(false);
panelConvert11f.setVisible(false);
panelConvert12f.setVisible(false);
panelConvert1g.setVisible(false);
panelConvert2g.setVisible(false);
panelConvert3g.setVisible(false);
panelConvert4g.setVisible(false);
panelConvert5g.setVisible(false);
panelConvert6g.setVisible(false);
panelConvert7g.setVisible(false);
panelConvert8g.setVisible(false);
panelConvert9g.setVisible(false);
panelConvert10g.setVisible(false);
panelConvert1c.setVisible(false);
panelConvert2c.setVisible(false);
panelConvert3c.setVisible(false);
panelConvert4c.setVisible(false);
panelConvert5c.setVisible(false);
panelConvert6c.setVisible(false);
panelConvert7c.setVisible(false);
panelConvert8c.setVisible(false);
panelConvert9c.setVisible(false);
panelConvert10c.setVisible(false);
panelConvert11c.setVisible(false);
panelConvert12c.setVisible(false);
panelFormat1.setVisible(false);
panelFormat3.setVisible(false);
panelFormat5.setVisible(false);
panelFormat7.setVisible(false);
panelFormat9.setVisible(false);
panelFormat11.setVisible(false);
panelFormat13.setVisible(false);
panelConvert1h.setVisible(false);
panelConvert2h.setVisible(false);
panelConvert3h.setVisible(false);
panelConvert4h.setVisible(false);
panelConvert5h.setVisible(false);
panelConvert6h.setVisible(false);
panelConvert7h.setVisible(false);
panelConvert9h.setVisible(false);
panelConvert11h.setVisible(false);
panelConvert13h.setVisible(false);
panelConvert14h.setVisible(false);
panelConvert15h.setVisible(false);
panelConvert16h.setVisible(false);
panelConvert1j.setVisible(false);
panelConvert3j.setVisible(false);
panelConvert4j.setVisible(false);
panelConvert5j.setVisible(false);
panelConvert6j.setVisible(false);
panelConvert7j.setVisible(false);
panelConvert8j.setVisible(false);
panelConvert9j.setVisible(false);
panelConvert10j.setVisible(false);
panelConvert11j.setVisible(false);
panelConvert12j.setVisible(false);
panelConvert13j.setVisible(false);
panelConvert1i.setVisible(false);
panelConvert3i.setVisible(false);
panelConvert4i.setVisible(false);
panelConvert5i.setVisible(false);
panelConvert6i.setVisible(false);
panelConvert7i.setVisible(false);
panelConvert8i.setVisible(false);
panelConvert9i.setVisible(false);
panelConvert10i.setVisible(false);
panelConvert11i.setVisible(false);
panelConvert12i.setVisible(false);
panelConvert13i.setVisible(false);
panelConvert14i.setVisible(false);
panelConvert15i.setVisible(false);
panelConvert1l.setVisible(false);
panelConvert2l.setVisible(false);
panelConvert3l.setVisible(false);
panelConvert4l.setVisible(false);
panelConvert5l.setVisible(false);
panelConvert6l.setVisible(false);
panelConvert7l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert9l.setVisible(false);;
panelConvert11l.setVisible(false);
panelConvert12l.setVisible(false);
panelConvert13l.setVisible(false);
panelConvert14l.setVisible(false);
panelCircle1b.setVisible(false);
panelCircle2b.setVisible(false);
panelCircle3b.setVisible(false);
panelCircle4b.setVisible(false);
panelCircle5b.setVisible(false);
panelCircle6b.setVisible(false);
panelCircle7b.setVisible(false);
panelCircle8b.setVisible(false);
panelCircle9b.setVisible(false);
panelCircle10b.setVisible(false);
panelCircle11b.setVisible(false);
panelCircle12b.setVisible(false);
panelCube1a.setVisible(false);
panelCube2a.setVisible(false);
panelCube3a.setVisible(false);
panelCube4a.setVisible(false);
panelCube5a.setVisible(false);
panelCube6a.setVisible(false);
panelCube7a.setVisible(false);
panelCube8a.setVisible(false);
panelCube9a.setVisible(false);
panelCube10a.setVisible(false);
panelCube11a.setVisible(false);
panelCube12a.setVisible(false);
panelSphere1a.setVisible(false);
panelSphere2a.setVisible(false);
panelSphere3a.setVisible(false);
panelSphere4a.setVisible(false);
panelSphere5a.setVisible(false);
panelSphere6a.setVisible(false);
panelSphere7a.setVisible(false);
panelSphere8a.setVisible(false);
panelSphere9a.setVisible(false);
panelSphere10a.setVisible(false);
panelSphere11a.setVisible(false);
panelSphere12a.setVisible(false);
}


//$$$$$$$$$$$$$$$$ Choose convert -> pixels $$$$$$$$$$$$$$$$
if (e.getSource() == chooseConvertPixel) {
iconPanel.setBounds(250, 250, 250, 250);
frame.setSize(800, 535);
notePanel1.setBounds(500, 0, 310, 500);
notePanel2.setBounds(500, 0, 310, 500);
notePanel3.setBounds(500, 0, 310, 500);
notePanel4.setBounds(500, 0, 310, 500);
notePanel5.setBounds(500, 0, 310, 500);
iconLabel.setIcon(pixel);

//Vis on
panelConvert1l.setVisible(true);
panelConvert2l.setVisible(true);
panelConvert3l.setVisible(true);
panelConvert4l.setVisible(true);
panelConvert5l.setVisible(true);
panelConvert6l.setVisible(true);
panelConvert7l.setVisible(true);
panelConvert8l.setVisible(true);
panelConvert9l.setVisible(true);;
panelConvert11l.setVisible(true);
panelConvert12l.setVisible(true);
panelConvert13l.setVisible(true);
panelConvert14l.setVisible(true);


//Vis off
panelTriangle1a.setVisible(false);
panelTriangle2a.setVisible(false);
panelTriangle3a.setVisible(false);
panelTriangle4a.setVisible(false);
panelTriangle5a.setVisible(false);
panelTriangle6a.setVisible(false);
panelTriangle7a.setVisible(false);
panelTriangle8a.setVisible(false);
panelTriangle9a.setVisible(false);
panelTriangle10a.setVisible(false);
panelTriangle11a.setVisible(false);
panelTriangle12a.setVisible(false);
panelTriangle13a.setVisible(false);
panelTriangle14a.setVisible(false);
panelTriangle15a.setVisible(false);
panelTriangle16a.setVisible(false);
panelTriangle17a.setVisible(false);
panelTriangle18a.setVisible(false);
panelTriangle19a.setVisible(false);
panelTriangle20a.setVisible(false);
panelTriangle21a.setVisible(false);
panelTriangle22a.setVisible(false);
panelTriangle23a.setVisible(false);
panelTriangle24a.setVisible(false);
panelTriangle25a.setVisible(false);
panelTriangle26a.setVisible(false);
panelTriangle27a.setVisible(false);
panelTriangle28a.setVisible(false);
panelTriangle31a.setVisible(false);
panelTriangle34a.setVisible(false);
panelConvert1a.setVisible(false);
panelConvert2a.setVisible(false);
panelConvert3a.setVisible(false);
panelConvert4a.setVisible(false);
panelConvert5a.setVisible(false);
panelConvert6a.setVisible(false);
panelConvert7a.setVisible(false);
panelConvert8a.setVisible(false);
panelConvert9a.setVisible(false);
panelConvert10a.setVisible(false);
panelConvert11a.setVisible(false);
panelConvert12a.setVisible(false);
panelConvert13a.setVisible(false);
panelConvert14a.setVisible(false);
panelSquare1a.setVisible(false);
panelSquare2a.setVisible(false);
panelSquare3a.setVisible(false);
panelSquare4a.setVisible(false);
panelSquare5a.setVisible(false);
panelSquare6a.setVisible(false);
panelSquare7a.setVisible(false);
panelSquare9a.setVisible(false);
panelSquare11a.setVisible(false);
panelConvert1d.setVisible(false);
panelConvert2d.setVisible(false);
panelConvert3d.setVisible(false);
panelConvert4d.setVisible(false);
panelConvert5d.setVisible(false);
panelConvert6d.setVisible(false);
panelConvert7d.setVisible(false);
panelConvert9d.setVisible(false);
panelConvert11d.setVisible(false);
panelConvert1b.setVisible(false);
panelConvert2b.setVisible(false);
panelConvert3b.setVisible(false);
panelConvert4b.setVisible(false);
panelConvert5b.setVisible(false);
panelConvert6b.setVisible(false);
panelConvert7b.setVisible(false);
panelConvert8b.setVisible(false);
panelConvert9b.setVisible(false);
panelConvert11b.setVisible(false);
panelConvert12b.setVisible(false);
panelConvert13b.setVisible(false);
panelConvert14b.setVisible(false);
panelConvert1e.setVisible(false);
panelConvert2e.setVisible(false);
panelConvert3e.setVisible(false);
panelConvert4e.setVisible(false);
panelConvert5e.setVisible(false);
panelConvert6e.setVisible(false);
panelConvert7e.setVisible(false);
panelConvert8e.setVisible(false);
panelConvert9e.setVisible(false);
panelConvert10e.setVisible(false);
panelConvert11e.setVisible(false);
panelConvert12e.setVisible(false);
panelConvert13e.setVisible(false);
panelConvert14e.setVisible(false);
panelConvert1f.setVisible(false);
panelConvert2f.setVisible(false);
panelConvert3f.setVisible(false);
panelConvert4f.setVisible(false);
panelConvert5f.setVisible(false);
panelConvert6f.setVisible(false);
panelConvert7f.setVisible(false);
panelConvert8f.setVisible(false);
panelConvert9f.setVisible(false);
panelConvert10f.setVisible(false);
panelConvert11f.setVisible(false);
panelConvert12f.setVisible(false);
panelConvert1g.setVisible(false);
panelConvert2g.setVisible(false);
panelConvert3g.setVisible(false);
panelConvert4g.setVisible(false);
panelConvert5g.setVisible(false);
panelConvert6g.setVisible(false);
panelConvert7g.setVisible(false);
panelConvert8g.setVisible(false);
panelConvert9g.setVisible(false);
panelConvert10g.setVisible(false);
panelConvert1c.setVisible(false);
panelConvert2c.setVisible(false);
panelConvert3c.setVisible(false);
panelConvert4c.setVisible(false);
panelConvert5c.setVisible(false);
panelConvert6c.setVisible(false);
panelConvert7c.setVisible(false);
panelConvert8c.setVisible(false);
panelConvert9c.setVisible(false);
panelConvert10c.setVisible(false);
panelConvert11c.setVisible(false);
panelConvert12c.setVisible(false);
panelFormat1.setVisible(false);
panelFormat3.setVisible(false);
panelFormat5.setVisible(false);
panelFormat7.setVisible(false);
panelFormat9.setVisible(false);
panelFormat11.setVisible(false);
panelFormat13.setVisible(false);
panelConvert1h.setVisible(false);
panelConvert2h.setVisible(false);
panelConvert3h.setVisible(false);
panelConvert4h.setVisible(false);
panelConvert5h.setVisible(false);
panelConvert6h.setVisible(false);
panelConvert7h.setVisible(false);
panelConvert9h.setVisible(false);
panelConvert11h.setVisible(false);
panelConvert13h.setVisible(false);
panelConvert14h.setVisible(false);
panelConvert15h.setVisible(false);
panelConvert16h.setVisible(false);
panelConvert1j.setVisible(false);
panelConvert3j.setVisible(false);
panelConvert4j.setVisible(false);
panelConvert5j.setVisible(false);
panelConvert6j.setVisible(false);
panelConvert7j.setVisible(false);
panelConvert8j.setVisible(false);
panelConvert9j.setVisible(false);
panelConvert10j.setVisible(false);
panelConvert11j.setVisible(false);
panelConvert12j.setVisible(false);
panelConvert13j.setVisible(false);
panelConvert1i.setVisible(false);
panelConvert3i.setVisible(false);
panelConvert4i.setVisible(false);
panelConvert5i.setVisible(false);
panelConvert6i.setVisible(false);
panelConvert7i.setVisible(false);
panelConvert8i.setVisible(false);
panelConvert9i.setVisible(false);
panelConvert10i.setVisible(false);
panelConvert11i.setVisible(false);
panelConvert12i.setVisible(false);
panelConvert13i.setVisible(false);
panelConvert14i.setVisible(false);
panelConvert15i.setVisible(false);
panelConvert1k.setVisible(false);
panelConvert3k.setVisible(false);
panelConvert4k.setVisible(false);
panelConvert5k.setVisible(false);
panelConvert6k.setVisible(false);
panelConvert7k.setVisible(false);
panelConvert8k.setVisible(false);
panelConvert9k.setVisible(false);
panelConvert10k.setVisible(false);
panelConvert11k.setVisible(false);
panelConvert12k.setVisible(false);
panelConvert13k.setVisible(false);
panelConvert14k.setVisible(false);
panelConvert15k.setVisible(false);
panelConvert16k.setVisible(false);
panelConvert17k.setVisible(false);
panelCircle1b.setVisible(false);
panelCircle2b.setVisible(false);
panelCircle3b.setVisible(false);
panelCircle4b.setVisible(false);
panelCircle5b.setVisible(false);
panelCircle6b.setVisible(false);
panelCircle7b.setVisible(false);
panelCircle8b.setVisible(false);
panelCircle9b.setVisible(false);
panelCircle10b.setVisible(false);
panelCircle11b.setVisible(false);
panelCircle12b.setVisible(false);
panelCube1a.setVisible(false);
panelCube2a.setVisible(false);
panelCube3a.setVisible(false);
panelCube4a.setVisible(false);
panelCube5a.setVisible(false);
panelCube6a.setVisible(false);
panelCube7a.setVisible(false);
panelCube8a.setVisible(false);
panelCube9a.setVisible(false);
panelCube10a.setVisible(false);
panelCube11a.setVisible(false);
panelCube12a.setVisible(false);
panelSphere1a.setVisible(false);
panelSphere2a.setVisible(false);
panelSphere3a.setVisible(false);
panelSphere4a.setVisible(false);
panelSphere5a.setVisible(false);
panelSphere6a.setVisible(false);
panelSphere7a.setVisible(false);
panelSphere8a.setVisible(false);
panelSphere9a.setVisible(false);
panelSphere10a.setVisible(false);
panelSphere11a.setVisible(false);
panelSphere12a.setVisible(false);
}

//$$$$$$$$$$$$$$$$ Choose 2D -> Circle $$$$$$$$$$$$$$$$
if (e.getSource() == choose2DCircle) {
iconPanel.setBounds(250, 250, 250, 250);
frame.setSize(800, 535);
notePanel1.setBounds(500, 0, 310, 500);
notePanel2.setBounds(500, 0, 310, 500);
notePanel3.setBounds(500, 0, 310, 500);
notePanel4.setBounds(500, 0, 310, 500);
notePanel5.setBounds(500, 0, 310, 500);
iconLabel.setIcon(circle);

//Vis on
panelCircle1b.setVisible(true);
panelCircle2b.setVisible(true);
panelCircle3b.setVisible(true);
panelCircle4b.setVisible(true);
panelCircle5b.setVisible(true);
panelCircle6b.setVisible(true);
panelCircle7b.setVisible(true);
panelCircle8b.setVisible(true);
panelCircle9b.setVisible(true);
panelCircle10b.setVisible(true);
panelCircle11b.setVisible(true);
panelCircle12b.setVisible(true);


//Vis off
panelTriangle1a.setVisible(false);
panelTriangle2a.setVisible(false);
panelTriangle3a.setVisible(false);
panelTriangle4a.setVisible(false);
panelTriangle5a.setVisible(false);
panelTriangle6a.setVisible(false);
panelTriangle7a.setVisible(false);
panelTriangle8a.setVisible(false);
panelTriangle9a.setVisible(false);
panelTriangle10a.setVisible(false);
panelTriangle11a.setVisible(false);
panelTriangle12a.setVisible(false);
panelTriangle13a.setVisible(false);
panelTriangle14a.setVisible(false);
panelTriangle15a.setVisible(false);
panelTriangle16a.setVisible(false);
panelTriangle17a.setVisible(false);
panelTriangle18a.setVisible(false);
panelTriangle19a.setVisible(false);
panelTriangle20a.setVisible(false);
panelTriangle21a.setVisible(false);
panelTriangle22a.setVisible(false);
panelTriangle23a.setVisible(false);
panelTriangle24a.setVisible(false);
panelTriangle25a.setVisible(false);
panelTriangle26a.setVisible(false);
panelTriangle27a.setVisible(false);
panelTriangle28a.setVisible(false);
panelTriangle31a.setVisible(false);
panelTriangle34a.setVisible(false);
panelConvert1l.setVisible(false);
panelConvert2l.setVisible(false);
panelConvert3l.setVisible(false);
panelConvert4l.setVisible(false);
panelConvert5l.setVisible(false);
panelConvert6l.setVisible(false);
panelConvert7l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert9l.setVisible(false);;
panelConvert11l.setVisible(false);
panelConvert12l.setVisible(false);
panelConvert13l.setVisible(false);
panelConvert14l.setVisible(false);
panelConvert1a.setVisible(false);
panelConvert2a.setVisible(false);
panelConvert3a.setVisible(false);
panelConvert4a.setVisible(false);
panelConvert5a.setVisible(false);
panelConvert6a.setVisible(false);
panelConvert7a.setVisible(false);
panelConvert8a.setVisible(false);
panelConvert9a.setVisible(false);
panelConvert10a.setVisible(false);
panelConvert11a.setVisible(false);
panelConvert12a.setVisible(false);
panelConvert13a.setVisible(false);
panelConvert14a.setVisible(false);
panelSquare1a.setVisible(false);
panelSquare2a.setVisible(false);
panelSquare3a.setVisible(false);
panelSquare4a.setVisible(false);
panelSquare5a.setVisible(false);
panelSquare6a.setVisible(false);
panelSquare7a.setVisible(false);
panelSquare9a.setVisible(false);
panelSquare11a.setVisible(false);
panelConvert1d.setVisible(false);
panelConvert2d.setVisible(false);
panelConvert3d.setVisible(false);
panelConvert4d.setVisible(false);
panelConvert5d.setVisible(false);
panelConvert6d.setVisible(false);
panelConvert7d.setVisible(false);
panelConvert9d.setVisible(false);
panelConvert11d.setVisible(false);
panelConvert1b.setVisible(false);
panelConvert2b.setVisible(false);
panelConvert3b.setVisible(false);
panelConvert4b.setVisible(false);
panelConvert5b.setVisible(false);
panelConvert6b.setVisible(false);
panelConvert7b.setVisible(false);
panelConvert8b.setVisible(false);
panelConvert9b.setVisible(false);
panelConvert11b.setVisible(false);
panelConvert12b.setVisible(false);
panelConvert13b.setVisible(false);
panelConvert14b.setVisible(false);
panelConvert1e.setVisible(false);
panelConvert2e.setVisible(false);
panelConvert3e.setVisible(false);
panelConvert4e.setVisible(false);
panelConvert5e.setVisible(false);
panelConvert6e.setVisible(false);
panelConvert7e.setVisible(false);
panelConvert8e.setVisible(false);
panelConvert9e.setVisible(false);
panelConvert10e.setVisible(false);
panelConvert11e.setVisible(false);
panelConvert12e.setVisible(false);
panelConvert13e.setVisible(false);
panelConvert14e.setVisible(false);
panelConvert1f.setVisible(false);
panelConvert2f.setVisible(false);
panelConvert3f.setVisible(false);
panelConvert4f.setVisible(false);
panelConvert5f.setVisible(false);
panelConvert6f.setVisible(false);
panelConvert7f.setVisible(false);
panelConvert8f.setVisible(false);
panelConvert9f.setVisible(false);
panelConvert10f.setVisible(false);
panelConvert11f.setVisible(false);
panelConvert12f.setVisible(false);
panelConvert1g.setVisible(false);
panelConvert2g.setVisible(false);
panelConvert3g.setVisible(false);
panelConvert4g.setVisible(false);
panelConvert5g.setVisible(false);
panelConvert6g.setVisible(false);
panelConvert7g.setVisible(false);
panelConvert8g.setVisible(false);
panelConvert9g.setVisible(false);
panelConvert10g.setVisible(false);
panelConvert1c.setVisible(false);
panelConvert2c.setVisible(false);
panelConvert3c.setVisible(false);
panelConvert4c.setVisible(false);
panelConvert5c.setVisible(false);
panelConvert6c.setVisible(false);
panelConvert7c.setVisible(false);
panelConvert8c.setVisible(false);
panelConvert9c.setVisible(false);
panelConvert10c.setVisible(false);
panelConvert11c.setVisible(false);
panelConvert12c.setVisible(false);
panelFormat1.setVisible(false);
panelFormat3.setVisible(false);
panelFormat5.setVisible(false);
panelFormat7.setVisible(false);
panelFormat9.setVisible(false);
panelFormat11.setVisible(false);
panelFormat13.setVisible(false);
panelConvert1h.setVisible(false);
panelConvert2h.setVisible(false);
panelConvert3h.setVisible(false);
panelConvert4h.setVisible(false);
panelConvert5h.setVisible(false);
panelConvert6h.setVisible(false);
panelConvert7h.setVisible(false);
panelConvert9h.setVisible(false);
panelConvert11h.setVisible(false);
panelConvert13h.setVisible(false);
panelConvert14h.setVisible(false);
panelConvert15h.setVisible(false);
panelConvert16h.setVisible(false);
panelConvert1j.setVisible(false);
panelConvert3j.setVisible(false);
panelConvert4j.setVisible(false);
panelConvert5j.setVisible(false);
panelConvert6j.setVisible(false);
panelConvert7j.setVisible(false);
panelConvert8j.setVisible(false);
panelConvert9j.setVisible(false);
panelConvert10j.setVisible(false);
panelConvert11j.setVisible(false);
panelConvert12j.setVisible(false);
panelConvert13j.setVisible(false);
panelConvert1i.setVisible(false);
panelConvert3i.setVisible(false);
panelConvert4i.setVisible(false);
panelConvert5i.setVisible(false);
panelConvert6i.setVisible(false);
panelConvert7i.setVisible(false);
panelConvert8i.setVisible(false);
panelConvert9i.setVisible(false);
panelConvert10i.setVisible(false);
panelConvert11i.setVisible(false);
panelConvert12i.setVisible(false);
panelConvert13i.setVisible(false);
panelConvert14i.setVisible(false);
panelConvert15i.setVisible(false);
panelConvert1k.setVisible(false);
panelConvert3k.setVisible(false);
panelConvert4k.setVisible(false);
panelConvert5k.setVisible(false);
panelConvert6k.setVisible(false);
panelConvert7k.setVisible(false);
panelConvert8k.setVisible(false);
panelConvert9k.setVisible(false);
panelConvert10k.setVisible(false);
panelConvert11k.setVisible(false);
panelConvert12k.setVisible(false);
panelConvert13k.setVisible(false);
panelConvert14k.setVisible(false);
panelConvert15k.setVisible(false);
panelConvert16k.setVisible(false);
panelConvert17k.setVisible(false);
panelCube1a.setVisible(false);
panelCube2a.setVisible(false);
panelCube3a.setVisible(false);
panelCube4a.setVisible(false);
panelCube5a.setVisible(false);
panelCube6a.setVisible(false);
panelCube7a.setVisible(false);
panelCube8a.setVisible(false);
panelCube9a.setVisible(false);
panelCube10a.setVisible(false);
panelCube11a.setVisible(false);
panelCube12a.setVisible(false);
panelSphere1a.setVisible(false);
panelSphere2a.setVisible(false);
panelSphere3a.setVisible(false);
panelSphere4a.setVisible(false);
panelSphere5a.setVisible(false);
panelSphere6a.setVisible(false);
panelSphere7a.setVisible(false);
panelSphere8a.setVisible(false);
panelSphere9a.setVisible(false);
panelSphere10a.setVisible(false);
panelSphere11a.setVisible(false);
panelSphere12a.setVisible(false);
}



//$$$$$$$$$$$$$$$$ Select Format $$$$$$$$$$$$$$$$
if (e.getSource() == selectFormat) {
iconPanel.setBounds(250, 250, 250, 250);
frame.setSize(800, 535);
notePanel1.setBounds(500, 0, 310, 500);
notePanel2.setBounds(500, 0, 310, 500);
notePanel3.setBounds(500, 0, 310, 500);
notePanel4.setBounds(500, 0, 310, 500);
notePanel5.setBounds(500, 0, 310, 500);
iconLabel.setIcon(format);

//Vis on
panelFormat1.setVisible(true);
panelFormat3.setVisible(true);
panelFormat5.setVisible(true);
panelFormat7.setVisible(true);
panelFormat9.setVisible(true);
panelFormat11.setVisible(true);
panelFormat13.setVisible(true);

//Vis off
panelTriangle1a.setVisible(false);
panelTriangle2a.setVisible(false);
panelTriangle3a.setVisible(false);
panelTriangle4a.setVisible(false);
panelTriangle5a.setVisible(false);
panelTriangle6a.setVisible(false);
panelTriangle7a.setVisible(false);
panelTriangle8a.setVisible(false);
panelTriangle9a.setVisible(false);
panelTriangle10a.setVisible(false);
panelTriangle11a.setVisible(false);
panelTriangle12a.setVisible(false);
panelTriangle13a.setVisible(false);
panelTriangle14a.setVisible(false);
panelTriangle15a.setVisible(false);
panelTriangle16a.setVisible(false);
panelTriangle17a.setVisible(false);
panelTriangle18a.setVisible(false);
panelTriangle19a.setVisible(false);
panelTriangle20a.setVisible(false);
panelTriangle21a.setVisible(false);
panelTriangle22a.setVisible(false);
panelTriangle23a.setVisible(false);
panelTriangle24a.setVisible(false);
panelTriangle25a.setVisible(false);
panelTriangle26a.setVisible(false);
panelTriangle27a.setVisible(false);
panelTriangle28a.setVisible(false);
panelTriangle31a.setVisible(false);
panelTriangle34a.setVisible(false);
panelConvert1a.setVisible(false);
panelConvert2a.setVisible(false);
panelConvert3a.setVisible(false);
panelConvert4a.setVisible(false);
panelConvert5a.setVisible(false);
panelConvert6a.setVisible(false);
panelConvert7a.setVisible(false);
panelConvert8a.setVisible(false);
panelConvert9a.setVisible(false);
panelConvert10a.setVisible(false);
panelConvert11a.setVisible(false);
panelConvert12a.setVisible(false);
panelConvert13a.setVisible(false);
panelConvert14a.setVisible(false);
panelSquare1a.setVisible(false);
panelSquare2a.setVisible(false);
panelSquare3a.setVisible(false);
panelSquare4a.setVisible(false);
panelSquare5a.setVisible(false);
panelSquare6a.setVisible(false);
panelSquare7a.setVisible(false);
panelSquare9a.setVisible(false);
panelSquare11a.setVisible(false);
panelConvert1d.setVisible(false);
panelConvert2d.setVisible(false);
panelConvert3d.setVisible(false);
panelConvert4d.setVisible(false);
panelConvert5d.setVisible(false);
panelConvert6d.setVisible(false);
panelConvert7d.setVisible(false);
panelConvert9d.setVisible(false);
panelConvert11d.setVisible(false);
panelConvert1b.setVisible(false);
panelConvert2b.setVisible(false);
panelConvert3b.setVisible(false);
panelConvert4b.setVisible(false);
panelConvert5b.setVisible(false);
panelConvert6b.setVisible(false);
panelConvert7b.setVisible(false);
panelConvert8b.setVisible(false);
panelConvert9b.setVisible(false);
panelConvert11b.setVisible(false);
panelConvert12b.setVisible(false);
panelConvert13b.setVisible(false);
panelConvert14b.setVisible(false);
panelConvert1e.setVisible(false);
panelConvert2e.setVisible(false);
panelConvert3e.setVisible(false);
panelConvert4e.setVisible(false);
panelConvert5e.setVisible(false);
panelConvert6e.setVisible(false);
panelConvert7e.setVisible(false);
panelConvert8e.setVisible(false);
panelConvert9e.setVisible(false);
panelConvert10e.setVisible(false);
panelConvert11e.setVisible(false);
panelConvert12e.setVisible(false);
panelConvert13e.setVisible(false);
panelConvert14e.setVisible(false);
panelConvert1f.setVisible(false);
panelConvert2f.setVisible(false);
panelConvert3f.setVisible(false);
panelConvert4f.setVisible(false);
panelConvert5f.setVisible(false);
panelConvert6f.setVisible(false);
panelConvert7f.setVisible(false);
panelConvert8f.setVisible(false);
panelConvert9f.setVisible(false);
panelConvert10f.setVisible(false);
panelConvert11f.setVisible(false);
panelConvert12f.setVisible(false);
panelConvert1g.setVisible(false);
panelConvert2g.setVisible(false);
panelConvert3g.setVisible(false);
panelConvert4g.setVisible(false);
panelConvert5g.setVisible(false);
panelConvert6g.setVisible(false);
panelConvert7g.setVisible(false);
panelConvert8g.setVisible(false);
panelConvert9g.setVisible(false);
panelConvert10g.setVisible(false);
panelConvert1c.setVisible(false);
panelConvert2c.setVisible(false);
panelConvert3c.setVisible(false);
panelConvert4c.setVisible(false);
panelConvert5c.setVisible(false);
panelConvert6c.setVisible(false);
panelConvert7c.setVisible(false);
panelConvert8c.setVisible(false);
panelConvert9c.setVisible(false);
panelConvert10c.setVisible(false);
panelConvert11c.setVisible(false);
panelConvert12c.setVisible(false);
panelConvert1h.setVisible(false);
panelConvert2h.setVisible(false);
panelConvert3h.setVisible(false);
panelConvert4h.setVisible(false);
panelConvert5h.setVisible(false);
panelConvert6h.setVisible(false);
panelConvert7h.setVisible(false);
panelConvert9h.setVisible(false);
panelConvert11h.setVisible(false);
panelConvert13h.setVisible(false);
panelConvert14h.setVisible(false);
panelConvert15h.setVisible(false);
panelConvert16h.setVisible(false);
panelConvert1i.setVisible(false);
panelConvert3i.setVisible(false);
panelConvert4i.setVisible(false);
panelConvert5i.setVisible(false);
panelConvert6i.setVisible(false);
panelConvert7i.setVisible(false);
panelConvert8i.setVisible(false);
panelConvert9i.setVisible(false);
panelConvert10i.setVisible(false);
panelConvert11i.setVisible(false);
panelConvert12i.setVisible(false);
panelConvert13i.setVisible(false);
panelConvert14i.setVisible(false);
panelConvert15i.setVisible(false);
panelConvert1j.setVisible(false);
panelConvert3j.setVisible(false);
panelConvert4j.setVisible(false);
panelConvert5j.setVisible(false);
panelConvert6j.setVisible(false);
panelConvert7j.setVisible(false);
panelConvert8j.setVisible(false);
panelConvert9j.setVisible(false);
panelConvert10j.setVisible(false);
panelConvert11j.setVisible(false);
panelConvert12j.setVisible(false);
panelConvert13j.setVisible(false);
panelConvert1k.setVisible(false);
panelConvert3k.setVisible(false);
panelConvert4k.setVisible(false);
panelConvert5k.setVisible(false);
panelConvert6k.setVisible(false);
panelConvert7k.setVisible(false);
panelConvert8k.setVisible(false);
panelConvert9k.setVisible(false);
panelConvert10k.setVisible(false);
panelConvert11k.setVisible(false);
panelConvert12k.setVisible(false);
panelConvert13k.setVisible(false);
panelConvert14k.setVisible(false);
panelConvert15k.setVisible(false);
panelConvert16k.setVisible(false);
panelConvert17k.setVisible(false);
panelConvert1l.setVisible(false);
panelConvert2l.setVisible(false);
panelConvert3l.setVisible(false);
panelConvert4l.setVisible(false);
panelConvert5l.setVisible(false);
panelConvert6l.setVisible(false);
panelConvert7l.setVisible(false);
panelConvert8l.setVisible(false);
panelConvert9l.setVisible(false);;
panelConvert11l.setVisible(false);
panelConvert12l.setVisible(false);
panelConvert13l.setVisible(false);
panelConvert14l.setVisible(false);
panelCircle1b.setVisible(false);
panelCircle2b.setVisible(false);
panelCircle3b.setVisible(false);
panelCircle4b.setVisible(false);
panelCircle5b.setVisible(false);
panelCircle6b.setVisible(false);
panelCircle7b.setVisible(false);
panelCircle8b.setVisible(false);
panelCircle9b.setVisible(false);
panelCircle10b.setVisible(false);
panelCircle11b.setVisible(false);
panelCircle12b.setVisible(false);
panelCube1a.setVisible(false);
panelCube2a.setVisible(false);
panelCube3a.setVisible(false);
panelCube4a.setVisible(false);
panelCube5a.setVisible(false);
panelCube6a.setVisible(false);
panelCube7a.setVisible(false);
panelCube8a.setVisible(false);
panelCube9a.setVisible(false);
panelCube10a.setVisible(false);
panelCube11a.setVisible(false);
panelCube12a.setVisible(false);
panelSphere1a.setVisible(false);
panelSphere2a.setVisible(false);
panelSphere3a.setVisible(false);
panelSphere4a.setVisible(false);
panelSphere5a.setVisible(false);
panelSphere6a.setVisible(false);
panelSphere7a.setVisible(false);
panelSphere8a.setVisible(false);
panelSphere9a.setVisible(false);
panelSphere10a.setVisible(false);
panelSphere11a.setVisible(false);
panelSphere12a.setVisible(false);
}

}


}