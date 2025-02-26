SRCDIR = ./src 
BUILDDIR = ./build

TARGET = program.bin

# Doel: objectbestand 'main.o' en 'header.o'
compile: main.c header.c
    gcc -c main.c -o main.o
    gcc -c main.c -o header.o

# Doel: uitvoerbaar bestand 'program.bin'
program: main.o header.o
    gcc -o program.bin main.o header.o

# Doel: opruimen van gecompileerde bestanden
clean:
    rm -f program.bin main.o utils.o