program recursiveFatorial;
var
   i, N: integer;
function fat(n: integer): integer;

begin
   if n=1 then
      fat := 1
   
   else if n=0 then
      fat := 1
   
   else
      fat := n*fat(n-1);
end; 

begin
   writeln('Digite o valor a ser calculado o fatorial ');
   Readln (n);
   write(fat (n));
end.