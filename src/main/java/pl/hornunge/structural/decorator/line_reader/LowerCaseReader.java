package pl.hornunge.structural.decorator.line_reader;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class LowerCaseReader extends FilterReader {
    /**
     * Creates a new filtered reader.
     *
     * @param in a Reader object providing the underlying stream.
     * @throws NullPointerException if <code>in</code> is <code>null</code>
     */
    public LowerCaseReader(Reader in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int read = super.read();
        return read==-1?-1:Character.toLowerCase(read);
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        int read = super.read(cbuf, off, len);
        for (int i = 0; i<cbuf.length; i++){
            cbuf[i] = Character.toLowerCase(cbuf[i]);
        }
        return read;
    }


}
