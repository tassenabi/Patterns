## bash commands

loops und absoluter und relativer Pfad fehlen noch

Runnable .sh
chmod 755 YourScriptName.sh
bash YourScriptName.sh

googler
googler Suchbegriff

Navigation
cd path
ls path (-a)
pwd

Files/Directory
cp old new
mkdir path
mv old new (mv -i old new) —> falls vorhanden, nachfragen ob überschreiben, ansonsten wird automatisch überschrieben
mv blah.txt /home/user/newdir/
mv old1 old2 old3 new (old1-old3 wird nach old3 verschoben
mv 1.txt test.txt (umbenennen)
rm path (file)
rmdir path (directory)
cp file directory
cp file1.txt file2.txt

Pipes/Filter
cat test.txt (show content)
grep suchbegriff test.txt (caseSensitiv)
less test.txt (zeilenweise —> Leerzeichen geht es weiter und G ist das Ende)
tail test.txt (Zeigt Ende der Datei)
head test.txt (Anfang der Datei)
wc File.txt (zählt Zeilen, Wörter, bytes)
find . -name  ‘*hog.png’ -mtime 7 (. -> alle Unterverzeichnisse,-name —> nur nach Dateinamen der letzten 7 Tage mit Änderung)
locate wallet.dat (festplatte nach substring Datei)
which git (Speichertort)
ps -> alle prozesse
top (top CPU Consumer)
kill 123 -> killt
kill -9 123 (keine Widerrede)

Wildcards
*.txt
.txt
?.txt —> a.txt but not any.txt

history -> zeigt historisierte Commands
cron (Zeitsteuerung)

Shortcuts
|| ->rALT+7