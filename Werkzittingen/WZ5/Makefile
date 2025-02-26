# Declareer variabelen kan met `=`, `:=` of `::=`
CC = gcc
CFLAGS = -Wall -Wextra -std=c11
SRCDIR = ./src
BUILDDIR = ./build

# declareer alle .c files
CFILES = $(SRCDIR)/main.c $(SRCDIR)/header.c
# declareer de corresponderende .o files
OBJECTS = $(BUILDDIR)/main.o $(BUILDDIR)/header.o

TARGET = program.bin

# Het is een good practice om altijd een `all` rule te implementeren
# In dit geval is de `all` afhankelijk van onze TARGET
all: $(TARGET)

# Maar waar is onze TARGET afhankelijk van ...
# van alle object files, want enkel dan kunnen we linken tot een binary
$(TARGET): $(OBJECTS)
	$(CC) -o $@ $^
# Hierboven verwijzen we met $@ naar alles links van de `:` en met $^ alle elementen er rechts van

# Maar onze OBJECTS zijn op hun beurt weer afhankelijk van hun corresponderende .c files ...
# we gebruiken hier regular expressions waardoor % een wildcard is
$(BUILDDIR)/%.o: $(SRCDIR)/%.c
	$(CC) $(CFLAGS) -c -o $@ $<
# Hierboven verwijzen we met $@ naar alles links van de `:` en met $< (het corresponderende element) er rechts van


run: $(TARGET)
	./$(TARGET)