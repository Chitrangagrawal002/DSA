<h2><a href="https://codeforces.com/contest/2137/problem/A" target="_blank" rel="noopener noreferrer">2137A — Collatz Conjecture</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 2137A](https://codeforces.com/contest/2137/problem/A) |

## Topics
`constructive algorithms` `math`

---

## Problem Statement

<div class="header"><div class="title">A. Collatz Conjecture</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>You are doing a research paper on the famous Collatz Conjecture. In your experiment, you start off with an integer $$$x$$$, and you do the following procedure $$$k$$$ times: </p><ul> <li> If $$$x$$$ is even, divide $$$x$$$ by $$$2$$$. </li><li> Otherwise, set $$$x$$$ to $$$3\cdot x+1$$$. </li></ul><p>For example, starting off with $$$21$$$ and doing the procedure $$$5$$$ times, you get $$$21\rightarrow64\rightarrow32\rightarrow16\rightarrow8\rightarrow4$$$.</p><p>After all $$$k$$$ iterations, you are left with the final value of $$$x$$$. Unfortunately, you forgot the initial value. Please output any possible initial value of $$$x$$$.</p></div><div class="input-specification"><div class="section-title">Input</div><p>Each test contains multiple test cases. The first line contains the number of test cases $$$t$$$ ($$$1 \le t \le 400$$$). The description of the test cases follows. </p><p>The first line of each test case contains two integers $$$k$$$ and $$$x$$$ ($$$1 \leq k,x \leq 20$$$).</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, print any possible initial value on a new line. It can be shown that the answer always exists.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0031741506093986693" id="id0040711891063735284" class="input-output-copier">Copy</div></div><pre id="id0031741506093986693"><div class="test-example-line test-example-line-even test-example-line-0">3</div><div class="test-example-line test-example-line-odd test-example-line-1">1 4</div><div class="test-example-line test-example-line-even test-example-line-2">1 5</div><div class="test-example-line test-example-line-odd test-example-line-3">5 4</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id005777851829977805" id="id0000023023449864034706" class="input-output-copier">Copy</div></div><pre id="id005777851829977805">1
10
21
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the first test case, since $$$1$$$ is odd, performing the procedure $$$k=1$$$ times results in $$$1\cdot3+1=4$$$, so $$$1$$$ is a valid output.</p><p>In the second test case, since $$$10$$$ is even, performing the procedure $$$k=1$$$ times results in $$$\frac{10}{2}=5$$$, so $$$10$$$ is a valid output.</p><p>The third test case is explained in the statement.</p></div>