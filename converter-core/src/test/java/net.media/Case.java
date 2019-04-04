package net.media;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Map;

public class Case {
  private String inputFile;
  private String inputType;
  private Map<String, String> inputEdits;
  private JsonNode inputJson;
  private String outputFile;
  private String outputType;
  private Map<String, String> outputEdits;
  private JsonNode outputJson;
  private String purpose;
  private Map<String, String> params;
  private String status;

  public Case() {

  }

  public String getInputFile() {
    return this.inputFile;
  }

  public String getInputType() {
    return this.inputType;
  }

  public Map<String, String> getInputEdits() {
    return this.inputEdits;
  }

  public JsonNode getInputJson() {
    return this.inputJson;
  }

  public String getOutputFile() {
    return this.outputFile;
  }

  public String getOutputType() {
    return this.outputType;
  }

  public Map<String, String> getOutputEdits() {
    return this.outputEdits;
  }

  public JsonNode getOutputJson() {
    return this.outputJson;
  }

  public String getPurpose() {
    return this.purpose;
  }

  public Map<String, String> getParams() {
    return this.params;
  }

  public void setInputFile(String inputFile) {
    this.inputFile = inputFile;
  }

  public void setInputType(String inputType) {
    this.inputType = inputType;
  }

  public void setInputEdits(Map<String, String> inputEdits) {
    this.inputEdits = inputEdits;
  }

  public void setInputJson(JsonNode inputJson) {
    this.inputJson = inputJson;
  }

  public void setOutputFile(String outputFile) {
    this.outputFile = outputFile;
  }

  public void setOutputType(String outputType) {
    this.outputType = outputType;
  }

  public void setOutputEdits(Map<String, String> outputEdits) {
    this.outputEdits = outputEdits;
  }

  public void setOutputJson(JsonNode outputJson) {
    this.outputJson = outputJson;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public void setParams(Map<String, String> params) {
    this.params = params;
  }
}
