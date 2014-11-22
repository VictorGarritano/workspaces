class Peixes {
public void voar () { System . out . println(" Voando ") ;}
}
pub l i c c l a s s Peixetes extends Peixes {
pub l i c void voar () {
System . out . println(" Voar modificado") ;
super. voar () ;
}
pub l i c s t a t i c void main ( String [] args ) {
new Peixetes() . voar () ;
}
}
