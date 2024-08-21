package implementingIterable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class URLLibrary implements Iterable<String> {
    private LinkedList<String> urls = new LinkedList<String>();

    private class URLIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < urls.size();
        }
        StringBuilder sb = new StringBuilder();

        @Override
        public String next() {

            try {
                URL url = new URL(urls.get(index));

                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));



                String line = null;

                while ( (line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append("\n");

                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            index++;

            return  sb.toString();
        }

        @Override
        public void remove() {
            urls.remove(index);
        }
    }

    public URLLibrary() {
        urls.add("https://www.youtube.com/");
        urls.add("https://www.google.com/");
        urls.add("https://www.amazon.co.uk/");
    }

    @Override
    public Iterator<String> iterator() {
        return new URLIterator();
    }

    /*
    @Override
    public Iterator<String> iterator() {
        return urls.iterator();
    }
     */
}
