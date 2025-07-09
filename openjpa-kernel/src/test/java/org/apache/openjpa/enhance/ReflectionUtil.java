package org.apache.openjpa.enhance;


public class ReflectionUtil {

    private ReflectionUtil(){
        throw new UnsupportedOperationException("Can't instantiate " + getClass().getName());
    }

    public static class AValidCandidate {

        private Object candidate;
        private boolean codeCoverage;
        public AValidCandidate(Object candidate) {
            this.candidate = candidate;
        }

        public Object getCandidate() {
            return candidate;
        }

        public void setCandidate(Object candidate) {
            this.candidate = candidate;
        }
    }


    public static class InvalidCandidate {
        private Object candidate;
        private boolean codeCoverage;
        public InvalidCandidate(Object candidate) {
            this.candidate = candidate;
        }
        public Object giveMeCandidate() {
            return candidate;
        }

        public void changeCandidate(Object candidate) {
            this.candidate = candidate;
        }
    }



    public enum ReflectionOutcome{
        VALID,
        INVALID,
        MISSING, NULL
    }

}
