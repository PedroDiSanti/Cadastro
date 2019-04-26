public class Texto {
    private String txt;

    Texto(String txt){
        setTxt(txt);
        limpaBrancos();
    }

    private void setTxt(String t){
        this.txt = t;
    }

    public String getTxt(){
        return this.txt;
    }

    public String inverteTexto(){
        String txtInvertido = "";
        if(!(this.txt == null || this.txt.equals("") )){
            for (int i=this.txt.length()-1; i >= 0; i--){
                txtInvertido = txtInvertido + this.txt.charAt(i);
            }
        } else return null;
        return txtInvertido;
    }

    public int getQtdePalavras(){
        return (getTxt().split(" ").length);
    }

    private void limpaBrancos(){
        this.txt = this.txt.trim();

        String s = "";
        for (int i=0; i < this.txt.length(); i++){
            s = s + this.txt.charAt(i);
            if(this.txt.charAt(i) == ' '){
                while(this.txt.charAt(i+1) == ' '){
                    i++;
                }
            }
        }
        setTxt(s);
    }

}
