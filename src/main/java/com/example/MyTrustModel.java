package com.example;


import atb.interfaces.Experience;
import atb.interfaces.Opinion;
import atb.trustmodel.AbstractTrustModel;

import java.util.List;
import java.util.Map;

public class MyTrustModel extends AbstractTrustModel<Double> {

    /**
     * Initializes the trust model with an optional array of varargs Objects.
     * Called only once, at the very start of the test run.
     *
     * @param params Optional parameters
     */
    @Override
    public void initialize(Object... params) {

    }

    /**
     * Notifies the trust model of the current time. Called once at every step
     * of the test run.
     *
     * @param time Current time
     */
    @Override
    public void setCurrentTime(int time) {

    }

    /**
     * Conveys the list of available services to the trust model.
     *
     * @param services
     */
    @Override
    public void setServices(List<Integer> services) {

    }

    /**
     * Conveys the list of available agents to the trust model.
     *
     * @param agents
     */
    @Override
    public void setAgents(List<Integer> agents) {

    }

    /**
     * Conveys opinions to the trust model.
     *
     * @param opinions List of opinions
     */
    @Override
    public void processOpinions(List<Opinion> opinions) {

    }

    /**
     * Conveys experiences to the trust model.
     *
     * @param experiences List of experiences
     */
    @Override
    public void processExperiences(List<Experience> experiences) {

    }

    /**
     * Calculates trust towards agents in the system. The calculated trust must
     * be stored internally. The method is called once at every step of the test
     * run.
     */
    @Override
    public void calculateTrust() {

    }

    /**
     * Returns the calculated trust values for a given service. The trust values
     * have to be packaged in a map, whose keys represent agents and its values
     * represent their computed trust values.
     *
     * @param service type of service
     * @return Map where keys represent agents and values computed trust values
     */
    @Override
    public Map<Integer, Double> getTrust(int service) {
        return null;
    }
}
