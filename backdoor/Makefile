LIB = jnativehook-2.2.2.jar
BIN = bin
SRC = src/back/*.java
MAIN = back.Main
TARGET = miPrograma.jar

all:
	mkdir -p $(BIN)
	cd $(BIN) && jar xf ../$(LIB)
	javac -cp $(LIB) -d $(BIN) $(SRC)
	jar cfe $(TARGET) $(MAIN) -C $(BIN) .

run:
	java -cp "$(LIB):$(TARGET)" $(MAIN)

clean:
	rm -rf $(BIN) $(TARGET)