class Sentence extends React.Component {
  state = {
    textOptions: ["1", "2", "3"],
    option: null,
    value: ""
  };

  handleRandomText = () => {
    const index = Math.floor(Math.random() * this.state.textOptions.length);
    this.setState({
      option: this.state.textOptions[index]
    });
  };

  handleInputValue = e => {
    this.setState({
      value: e.target.value
    });
  };

  addTextOptions = () => {
    if (this.state.value === "") return alert("write something in the field!");
    // const textOptions = [...this.state.textOptions];
    // textOptions.push(this.state.value);
    const textOptions = this.state.textOptions.concat(this.state.value);

    this.setState({
      textOptions, // textOptions:textOptions,
      value: ""
    });
    return alert(`Array contains: ${textOptions}`);
  };

  render() {
    return (
      <>
        <label>
          Add sentence &nbsp;
          <input
            type="text"
            value={this.state.value}
            onChange={this.handleInputValue.bind(this)}
          />
        </label>
        <button onClick={this.addTextOptions}>&nbsp; Add &nbsp;</button>
        <br />
        <br />
        <button onClick={this.handleRandomText}>Drow</button>
        {this.state.option ? <h2>{this.state.option}</h2> : null}
      </>
    );
  }
}
ReactDOM.render(<Sentence />, document.getElementById("root"));
