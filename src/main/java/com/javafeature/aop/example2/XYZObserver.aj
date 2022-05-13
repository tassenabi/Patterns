public aspect XYZObserver extends ObserverProtocol{

declare parents: XYZ implements Subject;
delcare parents: ABC implements Objects;

protected pointcut subjectChange(Subject s): call(void XYZ.set*(..)) && target(s);

protected void updateObserver(Subject s, Observer o){
((ABC) o).notify();
                                                                                                                                                                                                                                                                                                                        }
}