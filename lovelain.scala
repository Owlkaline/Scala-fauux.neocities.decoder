import scala.io._
import java.io._

object lovelain {
  def main(args: Array[String]): Unit = {
    var filename = "encrypted.txt";
    
    val fileContents = Source.fromFile(filename).getLines.mkString;
    
    var newString = "";
    val fileLength = fileContents.length-1;
    var i = 0;
    while(i < fileLength) {
      var found = 1;
      if(fileContents(i) == 'ã') {
        if(fileContents(i+1) == '€') {
          if(fileContents(i+2) != '€') {
            found = 0;
            newString += '\"';
          } else {
            newString += ' ';
          }
        }
          i+=3;
      } else
      if(fileContents(i) == 'â') {
        if(fileContents(i+1) == '€') {
          if(fileContents(i+2) == '™') {
            newString += '\'';
          }
        }
        i+=3;
      } else
      if(fileContents(i) == 'ï') {
        if(fileContents(i+1) == '½') {
          if(fileContents(i+2) == '') {
            newString += "a";
          } else
          if(fileContents(i+2) == '‚') {
            newString += "b";
          } else
          if(fileContents(i+2) == 'ƒ') {
            newString += "c";
          } else
          if(fileContents(i+2) == '„') {
            newString += "d";
          } else
          if(fileContents(i+2) == '…') {
            newString += "e";
          } else
          if(fileContents(i+2) == '†') {
            newString += "f";
          } else
          if(fileContents(i+2) == '‡') {
            newString += "g";
          } else
          if(fileContents(i+2) == 'ˆ') {
            newString += "h";
          } else
          if(fileContents(i+2) == '‰') {
            newString += "i";
          } else
          // j missing
          if(fileContents(i+2) == '‹') {
            newString += "k";
          } else
          if(fileContents(i+2) == 'Œ') {
            newString += "l";
          } else
          if(fileContents(i+2) == '') {
            newString += "m";
          } else
          if(fileContents(i+2) == 'Ž') {
            newString += "n";
          } else
          if(fileContents(i+2) == '') {
            newString += "o";
          } else
          if(fileContents(i+2) == '') {
            newString += "p";
          } else
          if(fileContents(i+2) == '‘') {
            newString += "q";
          } else
          if(fileContents(i+2) == '’') {
            newString += "r";
          } else
          if(fileContents(i+2) == '“') {
            newString += "s";
          } else
          if(fileContents(i+2) == '”') {
            newString += "t";
          } else
          if(fileContents(i+2) == '•') {
            newString += "u";
          } else
          if(fileContents(i+2) == '–') {
            newString += "v";
          } else
          if(fileContents(i+2) == '‚' || fileContents(i+2) == '—') {
            newString += "w";
          } else
          if(fileContents(i+2) == '˜') {
            newString += "x";
          } else
          if(fileContents(i+2) == '™') {
            newString += "y";
          } else
          if(fileContents(i+2) == 'š') {
            newString += "z";
          } else
          
           
          if(fileContents(i+2) == 'ï') {
            found = 0;
            newString += fileContents(i);
            newString += fileContents(i+1);
            println("Unkown lower case: " + fileContents(i) + fileContents(i+1));
          } else{
            newString += fileContents(i);
            newString += fileContents(i+1);
            newString += fileContents(i+2);
            println("Unkown lower case: " + fileContents(i) + fileContents(i+1)  + fileContents(i+2));
          }
        } else 
        if (fileContents(i+1) == '¼') {
          if(fileContents(i+2) == '¡') {
            newString += "A";
          } else
          if(fileContents(i+2) == 'Œ') {
            newString += "B";
          } else
          if(fileContents(i+2) == '£') {
            newString += "C";
          } else
          if(fileContents(i+2) == '¤') {
            newString += "D";
          } else
          if(fileContents(i+2) == '¥') {
            newString += "E";
          } else
          if(fileContents(i+2) == '¦') {
            newString += "F";
          } else
          if(fileContents(i+2) == '§') {
            newString += "G";
          } else
          if(fileContents(i+2) == '¨') {
            newString += "H";
          } else
          if(fileContents(i+2) == '©') {
            newString += "I"
          } else
          if(fileContents(i+2) == 'ª') {
            newString += "J";
          } else
          if(fileContents(i+2) == '«') {
            newString += "K";
          } else
          if(fileContents(i+2) == '¬') {
            newString += "L";
          } else
          if(fileContents(i+2) == '®') {
            newString += "N";
          } else
          if(fileContents(i+2) == '¯') {
            newString += "O";
          } else
          if(fileContents(i+2) == '°') {
            newString += "P";
          } else
          if(fileContents(i+2) == '²') {
            newString += "R";
          } else
          if(fileContents(i+2) == '³') {
            newString += "S";
          } else
          if(fileContents(i+2) == '´') {
            newString += "T";
          } else
          if(fileContents(i+2) == 'µ') {
            newString += "U";
          } else
          if(fileContents(i+2) == '¶') {
            newString += "V";
          } else
          if(fileContents(i+2) == '·') {
            newString += "W";
          } else
          if(fileContents(i+2) == '¹') {
            newString += "Y";
          } else
          if(fileContents(i+2) == 'º') {
            newString += "Z";
          } else
          if(fileContents(i+2) == '') {
            newString += "0";
          } else
          if(fileContents(i+2) == '‘') {
            newString += "1";
          } else
          if(fileContents(i+2) == '’') {
            newString += "2";
          } else
          if(fileContents(i+2) == '“') {
            newString += "3";
          } else
          if(fileContents(i+2) == '”') {
            newString += "4";
          } else
          if(fileContents(i+2) == '–') {
            newString += "6";
          } else
          if(fileContents(i+2) == '‰') {
            newString += ".\n";
          } else
          if(fileContents(i+2) == '') {
            newString += "-";
          } else
          if(fileContents(i+2) == 'Ÿ') {
            newString += "?";
          } else
          if(fileContents(i+2) == 'Ž') {
            newString += "\n";
          } else
          if(fileContents(i+2) == '†') {
            newString += "&";
          } else
          if(fileContents(i+2) == 'ˆ') {
            newString += ":";
          } else
          
          
          if(fileContents(i+2) == 'ï') {
            found = 0;
            newString += fileContents(i);
            newString += fileContents(i+1);
            println("Unkown captial: " + fileContents(i) + fileContents(i+1));
          } else {
            newString += fileContents(i);
            newString += fileContents(i+1);
            newString += fileContents(i+2);
            println("Unkown captial: " + fileContents(i) + fileContents(i+1)  + fileContents(i+2));
          }
        }
        if(found == 1) {
          i+=3;
        } else {
          i+=2;
        }
      } else {
        newString += fileContents(i);
        
        i+=1;
      }
    }
    
    val output = new java.io.PrintWriter(("decrypted.txt"));
    
    output.print(newString);
    
    output.close();
  }
}
